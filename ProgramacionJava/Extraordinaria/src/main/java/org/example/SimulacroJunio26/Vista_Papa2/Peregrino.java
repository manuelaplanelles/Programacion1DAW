package org.example.SimulacroJunio26.Vista_Papa2;

import java.util.Objects;

public abstract class Peregrino implements AccionProtocolaria {
    static Integer contador = 0;      // STATIC (uno solo para todos)
    private Integer numReserva;
    private String nombre;
    private EstadoPeregrino estado;

    public Peregrino(String nombre, EstadoPeregrino estado) {
        contador++;
        this.numReserva = contador;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Integer getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(Integer numReserva) {
        this.numReserva = numReserva;
    }

    public EstadoPeregrino getEstado() {
        return estado;
    }

    public void setEstado(EstadoPeregrino estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Peregrino: " +
                "Numero Reserva" + numReserva +
                ", Nombre " + nombre + '\'' +
                ", Estado " + estado ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Peregrino peregrino = (Peregrino) o;
        return Objects.equals(numReserva, peregrino.numReserva);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numReserva);
    }
}
