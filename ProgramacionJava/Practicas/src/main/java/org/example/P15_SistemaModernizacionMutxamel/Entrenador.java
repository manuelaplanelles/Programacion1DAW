package org.example.P15_SistemaModernizacionMutxamel;

import java.util.ArrayList;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{
    private Equipos equipos;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipos, String formacionPreferida, ArrayList<Entrenador>listaEntrenador){
        super(nombre, edad);
        this.equipos = equipos;
        setFormacionPreferida(formacionPreferida, listaEntrenador);
    }

    public void planificarEntrenamiento(){
        System.out.println("El entrenador " +  this.getNombre() +  " está planificando el entrenamiento con formación " + this.getFormacionPreferida());
    }
    public void hacerCambios(){
        System.out.println("El entrenador " +  this.getNombre() + " está realizando cambios tácticos en el equipo "+ this.equipos);
    }



    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida, ArrayList<Entrenador>listaEntrenador) {
        if(!formacionPreferida.matches("\\d-\\d-\\d")){
            throw new ControlformacionPreferida();
        }
        this.formacionPreferida = formacionPreferida;
        listaEntrenador.add(this);
    }

    @Override
    public void entrenar() {
        System.out.println( this.getNombre() + " esta entrenando al equipo " + equipos);
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El entrenador " + this.getNombre()+ " está dirigiendo el partido contra " + rival + " con formación " + this.formacionPreferida);
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + this.getNombre() + " esta en concentración con el equipo de " + equipos);
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El entrenador " + this.getNombre() + " viaja con su equipo " + equipos + " para el partido que se celebra en " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("¡GOOOOOOOOOOOL! "+ this.getNombre() +" celebra el gol!");
    }
}
