package ar.edu.unahur.obj2.operaciones.decoradores;

public abstract class AlertaEnriquecedor implements IAlerta {

    protected IAlerta alerta;

    public AlertaEnriquecedor(IAlerta alerta) {
        this.alerta = alerta;
    }

    @Override
    public String getCodigo() {
        return alerta.getCodigo();
    }

    @Override
    public String getIp() {
        return alerta.getIp();
    }

    @Override
    public Integer getTiempo() {
        return alerta.getTiempo();
    }

}

