package org.example.P14_SistemaPagoECommerce;

/**
 * Clase que representa un pago mediante tarjeta de crédito
 * Soporta los tipos VISA, MASTERCARD y MAESTRO
 * @author Manuela Planelles
 * @version 1.0
 * @see MetodoPago
 */
public class TarjetaCredito extends MetodoPago {

    /** Número de la tarjeta (debe tener 16 dígitos) */
    private String nro_tarjeta;

    /** Tipo de tarjeta (VISA, MASTERCARD o MAESTRO) */
    private String tipoTarjeta;

    /**
     * Constructor de TarjetaCredito
     * @param nro_tarjeta Número de tarjeta de 16 dígitos
     * @param tipoTarjeta Tipo de tarjeta (VISA, MASTERCARD, MAESTRO)
     */
    public TarjetaCredito(String nro_tarjeta, String tipoTarjeta) {
        super();
        this.nro_tarjeta = nro_tarjeta;
        this.tipoTarjeta = tipoTarjeta;
    }

    /**
     * Valida que el número de tarjeta y el tipo sean correctos
     * Verifica que el número tenga 16 dígitos y el tipo sea válido
     * @return true si la tarjeta es válida, false en caso contrario
     * @see #procesarPago(double)
     */
    public boolean validarTarjeta() {
        boolean valida = true;

        if (!nro_tarjeta.matches("\\d+")) {
            System.out.println("Solo se admiten números.");
            valida = false;
        }

        if (nro_tarjeta.length() != 16) {
            System.out.println("Solo se admiten 16 números.");
            valida = false;
        }

        if ((!tipoTarjeta.equalsIgnoreCase("VISA")) &&
                (!tipoTarjeta.equalsIgnoreCase("MASTERCARD")) &&
                (!tipoTarjeta.equalsIgnoreCase("MAESTRO"))) {
            System.out.println("Solo se aceptan VISA, MASTERCARD y MAESTRO");
            valida = false;
        }

        if (valida) {
            System.out.println("Validando tarjeta...");
        }

        return valida;
    }

    /**
     * Obtiene el número de la tarjeta
     * @return Número de tarjeta
     */
    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    /**
     * Establece el número de la tarjeta
     * @param nro_tarjeta Nuevo número de tarjeta
     */
    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    /**
     * Obtiene el tipo de tarjeta
     * @return Tipo de tarjeta (VISA, MASTERCARD, MAESTRO)
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * Establece el tipo de tarjeta
     * @param tipoTarjeta Nuevo tipo de tarjeta
     */
    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    /**
     * Representación en String de la tarjeta de crédito
     * @return String con los datos de la tarjeta
     */
    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "nro_tarjeta='" + nro_tarjeta + '\'' +
                ", tipoTarjeta='" + tipoTarjeta + '\'' +
                '}';
    }

    /**
     * Procesa un pago con tarjeta de crédito
     * @param importe Cantidad a pagar en euros
     */
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito " + tipoTarjeta);
    }
}