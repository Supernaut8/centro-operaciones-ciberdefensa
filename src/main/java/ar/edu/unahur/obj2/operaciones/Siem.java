package ar.edu.unahur.obj2.operaciones;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.operaciones.decoradores.IAlerta;

public abstract class Siem {

    List<Alerta> alertasPendientes = new ArrayList<>();

    protected abstract IAlerta enriquercerAlerta(Alerta alerta);

    public final void asignarTrabajo(Analista analista) {
        Alerta alerta = buscarAlerta(analista);
        IAlerta alertaEnriquecida = enriquercerAlerta(alerta);
        analista.agregarAlerta(alertaEnriquecida);
        alertasPendientes.remove(alerta);        
    }

    public Alerta buscarAlerta(Analista analista) {
        return alertasPendientes.stream()
                .filter(alerta -> analista.getCriterio().cumpleCriterio(alerta))
                .findFirst()
                .orElse(null);
    }

    public void agregarAlerta(Alerta alerta) {
        alertasPendientes.add(alerta);
    }
    
}
