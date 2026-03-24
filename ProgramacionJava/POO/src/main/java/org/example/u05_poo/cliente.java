package org.example.u05_poo;

public class cliente {
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;


    public cliente (int id, String nombre, String apellidos, int edad){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public boolean mayorEdad (){
        if (edad>=18){
            return true;
        }else{
            return false;
        }
    }
}

