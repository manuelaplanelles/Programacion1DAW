package org.example.u06_herencia.Bar;

public class Cliente extends Persona {
    private Integer mesa;
    private int nComensales;

    public Cliente(String nombre, String dni, Integer mesa, int nComensales) {
        super(nombre, dni);
        this.mesa=mesa;
        this.nComensales=nComensales;
    }

    public Integer getMesa() {
        return mesa;
    }

    public void setMesa(Integer mesa) {
        this.mesa = mesa;
    }

    public int getnComensales() {
        return nComensales;
    }

    public void setnComensales(int nComensales) {
        this.nComensales = nComensales;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "mesa=" + mesa +
                ", nComensales=" + nComensales +
                '}';
    }
}
