package ar.edu.unahur.obj2.operaciones.decoradores;

public class HistorialForense extends AlertaEnriquecedor {

    public HistorialForense(IAlerta alerta) {
        super(alerta);
    }

    @Override
    public Integer getSeveridadTotal() {
        return alerta.getSeveridadTotal() + 15;
    }

}
