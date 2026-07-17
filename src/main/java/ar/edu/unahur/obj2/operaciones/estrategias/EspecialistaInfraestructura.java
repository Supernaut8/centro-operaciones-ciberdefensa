package ar.edu.unahur.obj2.operaciones.estrategias;

import java.util.List;

import ar.edu.unahur.obj2.operaciones.Alerta;

public class EspecialistaInfraestructura implements CriterioDeTriage {

    private List<String> IpsCriticas;

    public EspecialistaInfraestructura(List<String> IpsCriticas) {
        this.IpsCriticas = IpsCriticas;
    }

    @Override
    public Boolean cumpleCriterio(Alerta alerta) {
        return this.IpsCriticas.contains(alerta.getIp())    ;
    }

}
