package org.example.ra90_proyectos_integradores.practicas.SistemaPagoECommerce;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase que representa un pago mediante Bizum
 * Genera un PIN aleatorio de 6 dígitos para validar la transacción
 * @author Manuela Planelles
 * @version 1.0
 * @see MetodoPago
 */
public class Bizum extends MetodoPago {

    /** Número de teléfono vinculado a Bizum (9 dígitos) */
    private String telefono;

    /** PIN de 6 dígitos generado aleatoriamente */
    private int pin;

    /**
     * Constructor de Bizum
     * Genera automáticamente un PIN aleatorio de 6 dígitos
     * @param telefono Número de teléfono de 9 dígitos
     */
    public Bizum(String telefono) {
        super();
        this.telefono = telefono;
        Random random = new Random();
        this.pin = random.nextInt(900000) + 100000;
        System.out.println(pin);
    }

    /**
     * Valida el formato del teléfono y el PIN introducido
     * Verifica que el teléfono tenga 9 dígitos y el PIN sea correcto
     * @return true si Bizum es válido, false en caso contrario
     * @see #procesarPago(double)
     */
    public boolean validarBizum() {
        boolean valido = true;

        if (!telefono.matches("\\d+")) {
            System.out.println("Solo se admiten 9 números.");
            valido = false;
        }

        if (telefono.length() != 9) {
            System.out.println("Solo se admiten 9 números.");
            valido = false;
        }

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu PIN: ");
        int pinIntroducido = teclado.nextInt();

        if (pinIntroducido != this.pin) {
            System.out.println("El PIN introducido es incorrecto.");
            valido = false;
        }

        if (valido) {
            System.out.println("Validando tarjeta...");
        }

        return valido;
    }

    /**
     * Obtiene el número de teléfono
     * @return Número de teléfono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono
     * @param telefono Nuevo número de teléfono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el PIN generado
     * @return PIN de 6 dígitos
     */
    public int getPin() {
        return pin;
    }

    /**
     * Establece un nuevo PIN
     * @param pin Nuevo PIN de 6 dígitos
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    /**
     * Representación en String de Bizum
     * @return String con los datos de Bizum
     */
    @Override
    public String toString() {
        return "Bizum{" +
                "telefono='" + telefono + '\'' +
                ", pin=" + pin +
                '}';
    }

    /**
     * Procesa un pago con Bizum
     * @param importe Cantidad a pagar en euros
     */
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito Bizum");
    }
}