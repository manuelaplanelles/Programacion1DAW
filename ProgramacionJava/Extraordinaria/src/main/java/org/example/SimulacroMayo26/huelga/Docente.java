package org.example.SimulacroMayo26.huelga;

public class Docente implements AccionesHuelga {
    private String dni;
    private Integer diasHuelga;
    private EstadoDocente estado;

    public Docente(String dni, Integer diasHuelga, EstadoDocente estado) {
        this.dni = dni;
        this.diasHuelga = diasHuelga;
        this.estado = estado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getDiasHuelga() {
        return diasHuelga;
    }

    public void setDiasHuelga(Integer diasHuelga) {
        this.diasHuelga = diasHuelga;
    }

    public EstadoDocente getEstado() {
        return estado;
    }

    public void setEstado(EstadoDocente estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Docente: " +
                "DNI: " + dni + '\'' +
                "Dias en Huelga: " + diasHuelga +
                "Estado: " + estado;
    }

    @Override
    public void secundar() {

    }

    @Override
    public void asignarServiciosMinimos() {

    }

    @Override
    public void finalizar() {

    }
}
