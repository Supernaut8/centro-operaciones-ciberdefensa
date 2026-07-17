package ar.edu.unahur.obj2.operaciones.estrategias;

import ar.edu.unahur.obj2.operaciones.Alerta;
import ar.edu.unahur.obj2.operaciones.decoradores.IAlerta;

public interface EstrategiaDeEnriquecimiento {

    IAlerta enriquecer(Alerta alerta);
    
}
