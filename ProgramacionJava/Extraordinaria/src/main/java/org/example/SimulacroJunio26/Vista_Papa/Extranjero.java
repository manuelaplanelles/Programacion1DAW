package org.example.SimulacroJunio26.Vista_Papa;

public class Extranjero extends Peregrino{

    private String pais;

    public Extranjero(Integer numReserva, String nombre, EstadoPeregrino estado, String pais) {
        super(numReserva, nombre, estado);
        this.pais=pais;
    }

    @Override
    public void recibirBesico(){
        System.out.println("The Pope gives "+getNombre() +" a little kiss on the forehead and sends them on their way with a smile.");
    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Peregrino extranjero:" + '\'' +
                "Numero Reserva: " + getNumReserva() + '\'' +
                "Nombre: " + getNombre() + '\'' +
                "Estado: " + getEstado() + '\'' +
                "Pais: " + pais;
    }
}
