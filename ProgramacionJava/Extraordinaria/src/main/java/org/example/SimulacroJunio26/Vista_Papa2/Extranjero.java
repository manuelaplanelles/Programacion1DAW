package org.example.SimulacroJunio26.Vista_Papa2;

public class Extranjero extends Peregrino{
    private String pais;

    public Extranjero(String nombre, EstadoPeregrino estado, String pais) {
        super(nombre, estado);
        this.pais=pais;
    }

    @Override
    public void recibirBesico() {

    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Peregrino extranjero: " +
                "Numero Reserva " + getNumReserva() +
                ", Nombre " + getNombre()+ '\'' +
                ", Estado " + getEstado() +
                ", Pais:'" + pais ;
    }
}
