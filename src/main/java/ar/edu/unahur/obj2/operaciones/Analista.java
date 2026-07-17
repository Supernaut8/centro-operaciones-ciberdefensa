package ar.edu.unahur.obj2.operaciones;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.operaciones.decoradores.IAlerta;
import ar.edu.unahur.obj2.operaciones.estrategias.CriterioDeTriage;
import ar.edu.unahur.obj2.operaciones.excepciones.AnalistaSinCriterioException;

public class Analista {
    
    private final String legajo;
    private CriterioDeTriage criterio;
    private List<IAlerta> historialDeAlertas;

    public Analista(String legajo) {
        this.legajo = legajo;
        historialDeAlertas = new ArrayList<>();
    }

    public void setCriterio(CriterioDeTriage criterio) {
        this.criterio = criterio;
    }

    public CriterioDeTriage getCriterio() {
        if (criterio == null) {
            throw new AnalistaSinCriterioException("El analista no tiene un criterio asignado");
        }
        return criterio;
    }

    public void agregarAlerta(IAlerta alerta) {
        historialDeAlertas.add(alerta);
    }

    public String getLegajo() {
        return legajo;
    }

    public List<IAlerta> getHistorialDeAlertas() {
        return historialDeAlertas;
    }

    
}
