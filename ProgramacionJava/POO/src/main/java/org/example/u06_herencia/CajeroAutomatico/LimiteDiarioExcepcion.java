package org.example.u06_herencia.CajeroAutomatico;

public class LimiteDiarioExcepcion extends RuntimeException {
    public LimiteDiarioExcepcion(String message) {
        super(message);
    }
}
