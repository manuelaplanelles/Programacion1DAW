package org.example.u06_herencia.Bar;

public class Persona {
    private String nombre;
    private String dni;

    public Persona(String nombre, String dni){
        this.nombre=nombre;
        this.dni=dni;

    }

    public void mostrarInfoPersona(String nombre,String dni){
        System.out.println("Persona con nombre: " + nombre + " y DNI "+ dni);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    protected void mostrarInfoPersona() {
    }


}
