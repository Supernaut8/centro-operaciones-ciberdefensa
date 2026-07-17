package ar.edu.unahur.obj2.operaciones.estrategias;

import ar.edu.unahur.obj2.operaciones.Alerta;

public class DefensaHibrida implements CriterioDeTriage {
    private CriterioDeTriage especialistaAmenzasCriticas;
    private CriterioDeTriage especialistaInfraestructura;

    public DefensaHibrida(CriterioDeTriage especialistaAmenzasCriticas, CriterioDeTriage especialistaInfraestructura) {
        this.especialistaAmenzasCriticas = especialistaAmenzasCriticas;
        this.especialistaInfraestructura = especialistaInfraestructura;
    }   

    @Override
    public Boolean cumpleCriterio(Alerta alerta) {
        return this.especialistaAmenzasCriticas.cumpleCriterio(alerta) 
                ||
               this.especialistaInfraestructura.cumpleCriterio(alerta);
    }

    
}
