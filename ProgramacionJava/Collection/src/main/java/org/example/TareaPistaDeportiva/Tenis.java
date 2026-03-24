package org.example.TareaPistaDeportiva;

public class Tenis extends Pista {
    private Superficie superficie;

    public Tenis(String identificador, Tipo tipo, Superficie superficie) {
        super(identificador, tipo);
        this.superficie = superficie;
    }

    public Superficie getSuperficie() { return superficie; }

    @Override
    public String toString() {
        return "Tenis{" + super.toString() + ", superficie=" + superficie + "}";
    }
}
