package org.example.ExtraordinariaJunio25.PiscinaMunicipal;

public enum TipoUsuario {
    ADULTO(30), NINO(15), INVITADO(3.5);

    private double precio;

    TipoUsuario(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
