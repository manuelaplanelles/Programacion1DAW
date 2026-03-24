package org.example.u06_herencia.CajeroAutomatico;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String message) {
        super(message);
    }


}
