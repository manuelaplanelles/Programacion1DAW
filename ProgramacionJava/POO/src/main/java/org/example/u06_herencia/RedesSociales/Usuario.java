package org.example.u06_herencia.RedesSociales;

public class Usuario {
    private String nombre;
    private int edad;
    private String nomUsuario;
    private int seguidores;

    public Usuario(String nombre, int edad, String nomUsuario, int seguidores){
        this.nombre = nombre;
        this.edad = edad;
        this.nomUsuario = nomUsuario;
        this.seguidores = seguidores;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }


    public void mostrarInfo() {
        System.out.println("Informacion del Usuario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre de usuario: " + nomUsuario);
        System.out.println("Seguidores: " + seguidores);
    }
}
