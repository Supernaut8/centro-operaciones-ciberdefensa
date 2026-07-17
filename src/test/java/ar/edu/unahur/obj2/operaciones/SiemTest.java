package ar.edu.unahur.obj2.operaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.operaciones.estrategias.EspecialistaAmenzasCriticas;
import ar.edu.unahur.obj2.operaciones.plantillas.SiemRapido;

public class SiemTest {
    @Test
    void testAsignarTrabajo() {
        Siem siem = new SiemRapido();

        Alerta alerta = new Alerta("AL-001", "192.168.1.1", 20, 0);
        Alerta alerta2 = new Alerta("AL-002", "192.168.1.2", 80, 0);

        siem.agregarAlerta(alerta);
        siem.agregarAlerta(alerta2);

        Analista analista = new Analista("123");
        analista.setCriterio(new EspecialistaAmenzasCriticas());

        siem.asignarTrabajo(analista);

        assertEquals(1, analista.getHistorialDeAlertas().size());
        assertEquals("AL-002", analista.getHistorialDeAlertas().get(0).getCodigo());
    }
}
