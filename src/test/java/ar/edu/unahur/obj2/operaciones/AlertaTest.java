package ar.edu.unahur.obj2.operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.operaciones.excepciones.AlertaInvalidaException;

public class AlertaTest {
    @Test
    public void unaAlertaSeCreaConSusValoresCorrectamente() {
        
        Alerta alerta = new Alerta("bcd001", "192.168.1.1", 5, 10);
        assertTrue(alerta.getCodigo().equals("bcd001"));

    }

    @Test
    void testSeveridadMostrandoQueNoPermiteValoresNegativos() {
        assertThrows(AlertaInvalidaException.class, () -> new Alerta("ad1", "192.168.1.1", -5, 1200));
    }

    @Test
    void testCodigoMostrandoQueNoPermiteValoresNulos() {
        assertThrows(AlertaInvalidaException.class, () -> new Alerta(null, "192.168.1.1", 20, 1000));
    }

    @Test
    void testIPMostrandoQueNoPermiteValoresNulos() {
        assertThrows(AlertaInvalidaException.class, () -> new Alerta("ad2", null, 5, 1140));
    }



}
    