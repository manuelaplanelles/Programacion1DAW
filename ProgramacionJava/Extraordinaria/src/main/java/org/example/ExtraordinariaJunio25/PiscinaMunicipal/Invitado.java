package org.example.ExtraordinariaJunio25.PiscinaMunicipal;

import java.time.LocalDate;

public class Invitado extends Banyista{
    private LocalDate fecha_visita;

    public Invitado(String nombre, int edad, TipoUsuario tipo, LocalDate fecha_visita) {
        super(nombre, edad, tipo);
        this.fecha_visita=fecha_visita;
    }

    @Override
    void pagar() {
        System.out.println("Invitado pagando " + getTipo().getPrecio() + "€");
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    @Override
    public String toString() {
        return "Invitado: " +
                "Numero: " + getNumero()+
                ", Nombre: " + getNombre()+
                ", Edad: " + getEdad() +
                ", Tipo Usuario: " + getTipo()+
                ", Fecha visita:" + fecha_visita;
    }
}
