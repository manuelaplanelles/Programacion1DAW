package org.example.ra90_proyectos_integradores.practicas.SistemaPagoECommerce;

/**
 * Clase que representa un pago mediante PayPal
 * Gestiona pagos con cuenta de correo electrónico y saldo
 * @author Manuela Planelles
 * @version 1.0
 * @see MetodoPago
 */
public class PayPal extends MetodoPago {

    /** Correo electrónico de la cuenta PayPal */
    private String correo;

    /** Saldo disponible en la cuenta (por defecto 23€) */
    private double saldo;

    /**
     * Constructor de PayPal
     * Inicializa la cuenta con un saldo por defecto de 23€
     * @param correo Correo electrónico de la cuenta PayPal
     */
    public PayPal(String correo) {
        super();
        this.correo = correo;
        this.saldo = 23.0;
    }

    /**
     * Valida que el correo sea válido y que haya saldo suficiente
     * Verifica formato del correo (debe contener @) y saldo disponible
     * @param importe Importe que se desea pagar
     * @return true si la cuenta es válida y tiene saldo, false en caso contrario
     * @see #procesarPago(double)
     */
    public boolean validarPayPal(double importe) {
        boolean valido = true;

        if (!correo.contains("@")) {
            System.out.println("El formato del correo no es correcto.");
            valido = false;
        }

        if (saldo < importe) {
            System.out.println("Saldo insuficiente.");
            valido = false;
        }

        if (valido) {
            System.out.println("Validando PayPal...");
        }

        return valido;
    }

    /**
     * Obtiene el correo de la cuenta
     * @return Correo electrónico
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo de la cuenta
     * @param correo Nuevo correo electrónico
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el saldo disponible
     * @return Saldo en euros
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta
     * @param saldo Nuevo saldo en euros
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Representación en String de la cuenta PayPal
     * @return String con los datos de PayPal
     */
    @Override
    public String toString() {
        return "PayPal{" +
                "correo='" + correo + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    /**
     * Procesa un pago con PayPal
     * @param importe Cantidad a pagar en euros
     */
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito PayPal");
    }
}