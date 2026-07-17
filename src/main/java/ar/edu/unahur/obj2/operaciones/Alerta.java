package ar.edu.unahur.obj2.operaciones;

import ar.edu.unahur.obj2.operaciones.decoradores.IAlerta;

public class Alerta implements IAlerta {
    
    private final String codigo;
    private final String ip;
    private Integer severidad;
    private Integer tiempo;

    public Alerta(String codigo, String ip, Integer severidad, Integer tiempo) {
        this.codigo = codigo;
        this.ip = ip;
        this.severidad = severidad;
        this.tiempo = tiempo;
    }

    @Override
    public Integer getSeveridadTotal() {
        return this.severidad;
    }

    @Override
    public String getCodigo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCodigo'");
    }

    @Override
    public String getIp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIp'");
    }

    @Override
    public IAlerta getTiempo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTiempo'");
    }

    public int getSeveridad() {
        return this.severidad;
    }

}
