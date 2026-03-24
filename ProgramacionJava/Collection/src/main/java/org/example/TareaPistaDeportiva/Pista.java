package org.example.TareaPistaDeportiva;

public abstract class Pista {
    private String identificador;
    private Tipo tipo;

    public Pista(String identificador, Tipo tipo) {
        this.identificador = identificador;
        this.tipo = tipo;
    }

    public String getIdentificador() { return identificador; }
    public Tipo getTipo() { return tipo; }

    @Override
    public String toString() {
        return "identificador=" + identificador + ", tipo=" + tipo;
    }
}
