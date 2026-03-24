package org.example.TareaPistaDeportiva;

public class Padel extends Pista {
    private Paredes paredes;

    public Padel(String identificador, Tipo tipo, Paredes paredes) {
        super(identificador, tipo);
        this.paredes = paredes;
    }

    public Paredes getParedes() { return paredes; }

    @Override
    public String toString() {
        return "Padel{" + super.toString() + ", paredes=" + paredes + "}";
    }
}