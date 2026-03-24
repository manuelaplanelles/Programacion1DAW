package org.example.u06_herencia.RedesSociales;

public class Basico extends Usuario{


    public Basico(String nombre, int edad, String nomUsuario, int seguidores) {
        super(nombre, edad, nomUsuario, seguidores);
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Informacion de la Persona Normal:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nombre de usuario: " + getNomUsuario());
        System.out.println("Seguidores: " + getSeguidores());
    }
}
