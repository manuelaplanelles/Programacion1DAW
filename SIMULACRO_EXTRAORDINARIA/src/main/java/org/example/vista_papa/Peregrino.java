package org.example.vista_papa;

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
    public String toString() {
        return "Peregrino:" + '\'' +
                "Numero Reserva:" + numReserva + '\'' +
                "Nombre:'" + nombre + '\'' +
                "Estado:" + estado;
    }
}
