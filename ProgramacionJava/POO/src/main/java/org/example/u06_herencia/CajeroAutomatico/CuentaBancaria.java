package org.example.u06_herencia.CajeroAutomatico;

public class CuentaBancaria {
    private String saldo;

    public CuentaBancaria(String saldo){
        this.saldo=saldo;
    }


    public void ingresarDinero(){

    }
    public void retirarDinero(){

    }
    public void consultarSaldo(){

    }


    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo='" + saldo + '\'' +
                '}';
    }
}
