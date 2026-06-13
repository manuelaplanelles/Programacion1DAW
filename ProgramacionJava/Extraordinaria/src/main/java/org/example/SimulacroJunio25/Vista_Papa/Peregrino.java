package org.example.SimulacroJunio25.Vista_Papa;

import java.util.Objects;

public abstract class Peregrino implements AccionProtocolaria {
    private Integer numReserva;
    private String nombre;
    private EstadoPeregrino estado;

    public Peregrino(Integer numReserva, String nombre, EstadoPeregrino estado) {
        this.numReserva = numReserva;
        this.nombre = nombre;
        this.estado = estado;
    }
    @Override
    public void recibirBesico(){

    }

    public Integer getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(Integer numReserva) {
        this.numReserva = numReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstadoPeregrino getEstado() {
        return estado;
    }

    public void setEstado(EstadoPeregrino estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Peregrino peregrino = (Peregrino) o;
        return Objects.equals(numReserva, peregrino.numReserva);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numReserva);
    }

    @Override
    public String toString() {
        return "Peregrino:" + '\'' +
                "Numero Reserva:" + numReserva + '\'' +
                "Nombre:'" + nombre + '\'' +
                "Estado:" + estado;
    }
}
