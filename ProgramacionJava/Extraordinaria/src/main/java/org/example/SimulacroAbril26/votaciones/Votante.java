package org.example.SimulacroAbril26.votaciones;

import java.util.Scanner;

public abstract class Votante {
   static Scanner teclado = new Scanner(System.in);

    private String poblacion;
    private String nombre;
    private boolean votado;
    public Votante(){}

    public Votante(String poblacion, String nombre){
        this.poblacion=poblacion;
        this.nombre=nombre;
        this.votado=votado;
    }
    public abstract String votar();

    public static int encuestaSatisfaccion(Experiencia experiencia){
        System.out.println("Valora tu experienci: ");
        int valoracion = teclado.nextInt();
        return valoracion;
    }

    public static Scanner getTeclado() {
        return teclado;
    }

    public static void setTeclado(Scanner teclado) {
        Votante.teclado = teclado;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVotado() {
        return votado;
    }

    public void setVotado(boolean votado) {
        this.votado = votado;
    }

    @Override
    public String toString() {
        return "Votante:" +
                "Poblacion: " + poblacion + '\'' +
                "Nombre: " + nombre + '\'' +
                "Votado: " + votado;
    }
}
