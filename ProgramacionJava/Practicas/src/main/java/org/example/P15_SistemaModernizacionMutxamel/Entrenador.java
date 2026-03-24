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

    }
    public void hacerCambios(){

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
        this.formacionPreferida = formacionPreferida;
        listaEntrenador.add(this);
    }

    @Override
    public void entrenar() {
        System.out.println( this.nombre + " esta entrenando con " + equipos);
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println( this.nombre + "convoba partido para el fin de semana.");
    }

    @Override
    public void concentrarse() {
        System.out.println(this.nombre + " esta concentrado con " + equipos);
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(this.nombre + " viaja a con " + equipos + " a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println(this.nombre + " corre por la bana gritando ¡GOOOL!");
    }
}
