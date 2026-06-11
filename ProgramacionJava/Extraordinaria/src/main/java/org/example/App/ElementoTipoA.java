package org.example.App;

public class ElementoTipoA extends Elemento {
    private String datoExtra;

    public ElementoTipoA(String id, String nombre, Estado estado, String datoExtra){
        super(id, nombre, estado);
        this.datoExtra = datoExtra;
    }

    @Override
    public void mostrar() {

    }

    @Override
    public String toString() {
        return "ElementoTipoA{" +
                "datoExtra='" + datoExtra + '\'' +
                '}';
    }
}
