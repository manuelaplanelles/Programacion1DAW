package org.example.P14_SistemaPagoECommerce;

public class AppEcommerce {

    public static void main(String[] args) {
        Tienda.iniciarPago();
    }

    MetodoPago PayPal1 = new PayPal("manu@gmail.com");
    boolean validar1 = ((PayPal) PayPal1).validarPayPal(50.0);
}