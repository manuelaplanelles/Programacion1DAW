package org.example.vista_papa;

public class Extranjero extends Peregrino{

    private String pais;

    public Extranjero(Integer numReserva, String nombre, EstadoPeregrino estado, String pais) {
        super(numReserva, nombre, estado);
        this.pais=pais;
    }

    @Override
    public void recibirBesico(){

    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Peregrino extranjero: Pais='" + pais ;
    }
}
