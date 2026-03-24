package org.example.u06_herencia.SemaforoEnum;

public enum Dificutad {
    FACIL(2), MEDIO(4), DIFICIL(8), EXPERTO(10);

    public final int multiplicador;

    Dificutad(int multiplicador){
        this.multiplicador = multiplicador;
    }

    public static int getMultiplicador(){
        return getMultiplicador();

    }
}
