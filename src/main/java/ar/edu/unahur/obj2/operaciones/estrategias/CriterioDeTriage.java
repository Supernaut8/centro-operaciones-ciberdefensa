package ar.edu.unahur.obj2.operaciones.estrategias;

import ar.edu.unahur.obj2.operaciones.Alerta;

public interface CriterioDeTriage {

    Boolean cumpleCriterio(Alerta alerta);

}
