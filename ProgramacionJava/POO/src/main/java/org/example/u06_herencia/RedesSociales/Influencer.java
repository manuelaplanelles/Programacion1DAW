package org.example.u06_herencia.RedesSociales;

import u05_poo.chalet.Habitacion;

import java.util.ArrayList;

public class Influencer extends Usuario {

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nomUsuario, int seguidores) {
        super(nombre, edad, nomUsuario, seguidores);
        this.colaboraciones = new ArrayList<>();
    }

    public void agregarColaboracion(String colaboracion) {
        colaboraciones.add(colaboracion);
    }
    public ArrayList<String> getColaboraciones() {
        return colaboraciones;
    }

    public void setColaboraciones(ArrayList<String> colaboraciones) {
        this.colaboraciones = colaboraciones;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Informacion del Influencer:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nombre de usuario: " + getNomUsuario());
        System.out.println("Seguidores: " + getSeguidores());
        System.out.println("Colaboraciones: ");

        for (int i = 0; i < colaboraciones.size(); i++) {
            System.out.println(colaboraciones.get(i) );

            if (i < colaboraciones.size() - 1) {
                System.out.println(", ");
            }
        }
    }
}
