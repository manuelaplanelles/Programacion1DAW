package org.example.P14_SistemaPagoECommerce;

import java.util.Scanner;

/**
 * Clase que gestiona los pagos de la tienda online
 * Coordina el proceso de selección de método de pago y validación
 * @author Manuela Planelles
 * @version 1.0
 * @see MetodoPago
 * @see TarjetaCredito
 * @see PayPal
 * @see Bizum
 */
public class Tienda {

    /**
     * Realiza un pago con el método de pago proporcionado
     * Solicita el importe al usuario y procesa el pago
     * @param metodo Método de pago a utilizar (TarjetaCredito, PayPal o Bizum)
     * @see MetodoPago#procesarPago(double)
     */
    public static void realizarPago(MetodoPago metodo) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el importe a pagar: ");
        double importe = teclado.nextDouble();

        metodo.procesarPago(importe);

        System.out.println("Pago aceptado. Muchas gracias.");
    }

    /**
     * Inicia el proceso de pago
     * Pregunta al usuario qué método de pago desea usar,
     * valida los datos y procesa el pago si es correcto
     * @see #realizarPago(MetodoPago)
     */
    public static void iniciarPago() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Qué método de pago quieres usar? [Bizum, Paypal, Tarjeta]: ");
        String metodo = teclado.nextLine();

        MetodoPago metodoPago = null;

        switch (metodo.toLowerCase()) {

            case "tarjeta":
                System.out.println("Introduce los datos de tu tarjeta:");
                String numeroTarjeta = teclado.nextLine();

                System.out.print("Selecciona el tipo de tarjeta [VISA, MAESTRO, MASTERCARD]: ");
                String tipoTarjeta = teclado.nextLine();

                TarjetaCredito tarjeta = new TarjetaCredito(numeroTarjeta, tipoTarjeta);

                System.out.println("Validando tarjeta...");
                if (tarjeta.validarTarjeta()) {
                    metodoPago = tarjeta;
                }
                break;

            case "paypal":
                System.out.print("Introduce tu correo de PayPal: ");
                String correoPayPal = teclado.nextLine();

                PayPal paypal = new PayPal(correoPayPal);

                System.out.print("Introduce el importe a pagar: ");
                double importePayPal = teclado.nextDouble();

                System.out.println("Validando PayPal...");
                if (paypal.validarPayPal(importePayPal)) {
                    metodoPago = paypal;
                }
                break;

            case "bizum":
                System.out.print("Introduce tu número de teléfono vinculado con Bizum: ");
                String telefonoBizum = teclado.nextLine();

                Bizum bizum = new Bizum(telefonoBizum);

                System.out.println("Validando Bizum...");
                if (bizum.validarBizum()) {
                    metodoPago = bizum;
                }
                break;

            default:
                System.out.println("El método de pago no existe.");
                return;
        }

        if (metodoPago != null) {
            realizarPago(metodoPago);
        }
    }
}