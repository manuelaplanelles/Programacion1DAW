package org.example.SimulacroAbril26.votaciones;

public class Nacional extends Votante {

    private String dni;

    public Nacional(String poblacion, String nombre, String dni) {
        super(poblacion, nombre);
        this.dni=dni;
    }

    public Nacional(String dni){
        this.dni=dni;
    }


    @Override
    public String votar() {                 //pregunta
        return "";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nacional --> DNI: " + dni;
    }
}
