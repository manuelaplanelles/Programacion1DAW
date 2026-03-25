package org.example.ra90_proyectos_integradores.practicas.SistemaModernizacionMutxamel;

public class ControlDorsal extends RuntimeException {
    public ControlDorsal() {
        super("El dorsal ya esta adjudicado a un jugador.");
    }
}
