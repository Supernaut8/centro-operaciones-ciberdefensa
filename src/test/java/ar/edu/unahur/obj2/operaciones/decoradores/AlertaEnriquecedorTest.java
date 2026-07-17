package ar.edu.unahur.obj2.operaciones.decoradores;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.operaciones.Alerta;
import ar.edu.unahur.obj2.operaciones.Analista;
import ar.edu.unahur.obj2.operaciones.estrategias.AnalistaNivel1;
import ar.edu.unahur.obj2.operaciones.estrategias.EstrategiaDeEnriquecimiento;
import ar.edu.unahur.obj2.operaciones.estrategias.Forense;
import ar.edu.unahur.obj2.operaciones.estrategias.Rapido;
import ar.edu.unahur.obj2.operaciones.excepciones.AnalistaSinCriterioException;
import ar.edu.unahur.obj2.operaciones.excepciones.EnriquecimientoIncompatibleException;

public class AlertaEnriquecedorTest {
    @Test
    void losDecoradoresAcumulan() {

        IAlerta alerta = new HistorialForense(
                new GeolocalizacionIp(
                        new Alerta("A", "1", 40, 0)));

        assertEquals(60, alerta.getSeveridadTotal());

    }

    @Test
    void analisisMalwareNoAceptaLocalhost() {

        assertThrows( EnriquecimientoIncompatibleException.class,
                () -> new AnalisisMalware(
                        new Alerta("AL-001", "127.0.0.1", 20, 0)));
    }

    @Test
    void modoRapidoNoModificaLaSeveridad() {

        EstrategiaDeEnriquecimiento estrategia = new Rapido();

        IAlerta alerta = estrategia.enriquecer(
                new Alerta("A", "1", 40, 0));

        assertEquals(40, alerta.getSeveridadTotal());

    }

    @Test
    void modoForenseAgregaVeinte() {

        EstrategiaDeEnriquecimiento estrategia = new Forense();

        IAlerta alerta = estrategia.enriquecer(
                new Alerta("A", "1", 40, 0));

        assertEquals(60, alerta.getSeveridadTotal());

    }

    @Test
    void puedeCambiarElCriterio() {

        Analista analista = new Analista("123");

        analista.setCriterio(new AnalistaNivel1());

        assertNotNull(analista.getCriterio());

    }

    @Test
    void lanzarExcepcionSiNoTieneCriterio() {

        Analista analista = new Analista("123");

        assertThrows(
                AnalistaSinCriterioException.class,
                analista::getCriterio);

    }
}
