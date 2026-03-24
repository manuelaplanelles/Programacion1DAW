package org.example.u06_herencia.pruebasEnum;

public enum Metodo {
    BIZUM(0), PAYPAL(3), TARJETA(1.5),APPELPAY(0);

    public final double comision;

    Metodo(double comision){ //el constructor siempre es publico y no se indica
        this.comision=comision;

    }
    public double getComision (){
        return comision;
    }
}
