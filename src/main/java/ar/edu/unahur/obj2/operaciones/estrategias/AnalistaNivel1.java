package ar.edu.unahur.obj2.operaciones.estrategias;

import ar.edu.unahur.obj2.operaciones.Alerta;

public class AnalistaNivel1 implements CriterioDeTriage {

    @Override
    public Boolean cumpleCriterio(Alerta alerta) {
        return Boolean.TRUE;
    }
    
}
