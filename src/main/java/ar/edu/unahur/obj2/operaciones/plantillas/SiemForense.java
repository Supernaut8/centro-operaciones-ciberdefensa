package ar.edu.unahur.obj2.operaciones.plantillas;

import ar.edu.unahur.obj2.operaciones.Alerta;
import ar.edu.unahur.obj2.operaciones.Siem;
import ar.edu.unahur.obj2.operaciones.decoradores.GeolocalizacionIp;
import ar.edu.unahur.obj2.operaciones.decoradores.HistorialForense;
import ar.edu.unahur.obj2.operaciones.decoradores.IAlerta;

public class SiemForense extends Siem {

    @Override
    protected IAlerta enriquercerAlerta(Alerta alerta) {
        return new GeolocalizacionIp(new HistorialForense(alerta));
    }

}
