package ar.edu.unahur.obj2.operaciones.estrategias;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.operaciones.decoradores.IAlerta;
import ar.edu.unahur.obj2.operaciones.Alerta;
import ar.edu.unahur.obj2.operaciones.decoradores.GeolocalizacionIp;
import ar.edu.unahur.obj2.operaciones.decoradores.HistorialForense;

public class CriterioDeTriageTest {
    @Test
    void testAnalistaNivel1CumpleCriterio() {

        CriterioDeTriage criterio = new AnalistaNivel1();
        Alerta alerta = new Alerta("ad1", "192.168.1.1", 95, 1200);

        assertTrue(criterio.cumpleCriterio(alerta));

    }

    @Test
    void testEspecialistaAmenazasCriticasNoAceptaMenoresA75Incluido() {

        CriterioDeTriage criterio = new EspecialistaAmenzasCriticas();
        Alerta alerta = new Alerta("ad1", "192.168.1.1", 75, 1200);

        assertFalse(criterio.cumpleCriterio(alerta));

    }

    @Test
    void aceptaIPConfigurada() {

        List<String> ipsCriticas = List.of("192.168.1.1");

        CriterioDeTriage criterio = new EspecialistaInfraestructura(ipsCriticas);
        Alerta alerta = new Alerta("ad1", "192.168.1.1", 50, 1200);

        assertTrue(criterio.cumpleCriterio(alerta));
    }

    @Test
    void GeoSumaCinco() {

        IAlerta alerta = new GeolocalizacionIp(new Alerta("ad1", "192.168.1.1", 50, 1200));
        assertEquals(55, alerta.getSeveridadTotal());

    }

    @Test
    void historialSumaQuince() {

        IAlerta alerta = new HistorialForense(
                new Alerta("A", "1", 40, 0));

        assertEquals(55, alerta.getSeveridadTotal());

    }
}
