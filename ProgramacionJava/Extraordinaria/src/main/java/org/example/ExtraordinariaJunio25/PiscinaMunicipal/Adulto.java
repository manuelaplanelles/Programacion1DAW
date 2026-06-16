package org.example.ExtraordinariaJunio25.PiscinaMunicipal;

public class Adulto extends Banyista{


    public Adulto(String nombre, int edad, TipoUsuario tipo) {
        super(nombre, edad, tipo);
    }

    @Override
    void pagar() {
        System.out.println("Adulto (abono de tipo ADULTO) pagando " + getTipo().getPrecio() + "€");
    }

    @Override
    public String toString() {
        return "Adulto " +
                "Numero: " + getNumero()+
                ", Nombre: " + getNombre()+
                ", Edad: " + getEdad() +
                ", Tipo Usuario: " + getTipo();
    }
}
