package org.example.SimulacroJunio26.Vista_Papa;

public class Nacional extends Peregrino {
    private String provincia;

    public Nacional(Integer numReserva, String nombre, EstadoPeregrino estado, String provincia) {
        super(numReserva, nombre, estado);
        this.provincia=provincia;
    }
    @Override
    public void recibirBesico(){
        System.out.println("El Papa le da un besico en la frente a "+ getNombre() + " y l@ despacha con una sonrisa.");
    }
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Peregrino nacional:" + '\'' +
                "Numero Reserva: " + getNumReserva() + '\'' +
                "Nombre: " + getNombre() + '\'' +
                "Estado: " + getEstado() + '\'' +
                "Provincia: " + provincia ;


    }
}
