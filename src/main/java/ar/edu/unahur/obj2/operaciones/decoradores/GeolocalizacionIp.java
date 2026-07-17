package ar.edu.unahur.obj2.operaciones.decoradores;

public class GeolocalizacionIp extends AlertaEnriquecedor {

    public GeolocalizacionIp(IAlerta alerta) {
        super(alerta);
    }

    @Override
    public Integer getSeveridadTotal() {
        return alerta.getSeveridadTotal() + 5;
    }

}
