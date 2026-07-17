package ar.edu.unahur.obj2.operaciones.estrategias;

import ar.edu.unahur.obj2.operaciones.Alerta;
import ar.edu.unahur.obj2.operaciones.decoradores.IAlerta;

public class Rapido implements EstrategiaDeEnriquecimiento {

    @Override
    public IAlerta enriquecer(Alerta alerta) {
        return alerta;
    }

}
