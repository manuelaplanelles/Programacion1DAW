package org.example.Invierno;

import java.time.LocalDate;
import java.util.ArrayList;

public class Deportista {

    private String nombre;
    private LocalDate fecha_nacimiento;
    private int medallas;
    private Equipo equipo;
    private ArrayList<String> listaModalidades;

    public Deportista (String nombre, int dia, int mes, int anyo){
        this.nombre=nombre;
        fecha_nacimiento = LocalDate.of(anyo,mes,dia);
        medallas = 0;
        equipo = new Equipo();
        listaModalidades = new ArrayList<>();
    }

    public void inscribirse(String modalidad){

        listaModalidades.add(modalidad);

    }

    public void verModalidades(){

        System.out.println("\n El deportista " + nombre + " participa en " + listaModalidades.size() + " modalidades: ");

        for (String modalidad : listaModalidades){
            System.out.println("- " + modalidad);
        }

    }

    public ArrayList<String> getListaModalidades() {
        return listaModalidades;
    }

    public void setListaModalidades(ArrayList<String> listaModalidades) {
        this.listaModalidades = listaModalidades;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "nombre='" + nombre + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", medallas=" + medallas +
                ", equipo=" + equipo.getPais() +
                ", \n listaModalidades=" + listaModalidades +
                '}';
    }
}
