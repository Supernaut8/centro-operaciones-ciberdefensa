package ar.edu.unahur.obj2.operaciones.estrategias;

import ar.edu.unahur.obj2.operaciones.Alerta;
import ar.edu.unahur.obj2.operaciones.decoradores.GeolocalizacionIp;
import ar.edu.unahur.obj2.operaciones.decoradores.HistorialForense;
import ar.edu.unahur.obj2.operaciones.decoradores.IAlerta;

public class Forense implements EstrategiaDeEnriquecimiento {

    @Override
    public IAlerta enriquecer(Alerta alerta) {
        return new GeolocalizacionIp(new HistorialForense(alerta));
    }
    
}
