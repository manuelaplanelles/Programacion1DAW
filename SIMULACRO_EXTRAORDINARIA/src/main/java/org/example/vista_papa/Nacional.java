package org.example.vista_papa;

public class Nacional extends Peregrino {
    private String provincia;

    public Nacional(Integer numReserva, String nombre, EstadoPeregrino estado, String provincia) {
        super(numReserva, nombre, estado);
        this.provincia=provincia;
    }
    @Override
    public void recibirBesico(){

    }
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Peregrino nacional: Provincia='" + provincia ;
    }
}
