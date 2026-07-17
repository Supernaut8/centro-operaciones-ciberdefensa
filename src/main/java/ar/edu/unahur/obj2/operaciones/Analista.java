package ar.edu.unahur.obj2.operaciones;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.operaciones.estrategias.CriterioDeTriage;

public class Analista {
    
    private final String legajo;
    private CriterioDeTriage criterio;
    private List<Alerta> historialDeAlertas;

    public Analista(String legajo) {
        this.legajo = legajo;
        historialDeAlertas = new ArrayList<>();
    }

    public void setCriterio(CriterioDeTriage criterio) {
        this.criterio = criterio;
    }

    public CriterioDeTriage getCriterio() {
        return criterio;
    }

    

}
