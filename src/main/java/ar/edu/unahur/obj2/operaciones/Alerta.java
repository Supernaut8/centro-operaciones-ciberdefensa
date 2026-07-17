package ar.edu.unahur.obj2.operaciones;

import ar.edu.unahur.obj2.operaciones.decoradores.IAlerta;
import ar.edu.unahur.obj2.operaciones.excepciones.AlertaInvalidaException;

public class Alerta implements IAlerta {
    
    private final String codigo;
    private final String ip;
    private Integer severidad;
    private Integer tiempo;

    public Alerta(String codigo, String ip, Integer severidad, Integer tiempo) {
        if (codigo == null || codigo.isEmpty()) {
            throw new AlertaInvalidaException("El código no puede ser nulo o vacío");
        }

        if (severidad < 0) {
            throw new AlertaInvalidaException("La severidad no puede ser negativa");
        }

        if (ip == null || ip.isEmpty()) {
            throw new AlertaInvalidaException("La IP no puede ser nula o vacía");
        }

        this.codigo = codigo;
        this.ip = ip;
        this.severidad = severidad;
        this.tiempo = tiempo;
    }

    @Override
    public Integer getSeveridadTotal() {
        return this.severidad;
    }

    public Integer getSeveridad() {
        return this.severidad;
    }

    @Override
    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public String getIp() {
        return this.ip;
    }

    @Override
    public Integer getTiempo() {
        return this.tiempo;
    }

}
