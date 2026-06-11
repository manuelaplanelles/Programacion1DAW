package org.example.Simulacro26;

public class Docente implements AccionesHuelga {
    private String dni;
    private Integer diasHuelga;
    private EstadoDocente estado;

    public Docente(String dni, Integer diasHuelga, EstadoDocente estado){
        this.dni=dni;
        this.diasHuelga=diasHuelga;
        this.estado=estado;
    }
    @Override
    public String toString() {
        return "Docente: dni: " + dni + ", dias de huelga: " + diasHuelga + ", estado: " + estado;
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

    public String getDni(){
        return dni;
    }
    public Integer getDiasHuelga(){
        return diasHuelga;
    }
    public EstadoDocente getEstado(){
        return estado;
    }
    public void setDni(String dni){
        this.dni=dni;
    }
    public void setDiasHuelga(Integer diasHuelga){
        this.diasHuelga=diasHuelga;
    }
    public void setEstado(EstadoDocente estado) {
        this.estado = estado;
    }


}
