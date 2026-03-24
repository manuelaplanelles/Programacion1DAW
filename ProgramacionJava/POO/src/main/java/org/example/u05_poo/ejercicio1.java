package org.example.u05_poo;

public class ejercicio1 {
    /*Añade dos atributos a la clase Persona para guardar la ciudad de residencia y la profesión de cada una.
    Modifica también el constructor parametrizado para adaptarlo a los nuevos atributos.
     */
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private String ciudad;
    private String profesion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public ejercicio1 (String nombre, String apellidos, String dni, int edad, String ciudad, String profesion){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.ciudad = ciudad;
        this.profesion = profesion;
    }
    public ejercicio1() {

    }
    public void imprimirFicha() {
        System.out.println("Hola, ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Profesion: " + profesion);
    }

}
