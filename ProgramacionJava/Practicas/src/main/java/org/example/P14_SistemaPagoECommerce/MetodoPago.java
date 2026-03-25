package org.example.ra90_proyectos_integradores.practicas.SistemaPagoECommerce;

/**
 * Clase abstracta que representa un método de pago genérico
 * Define el comportamiento común de todos los métodos de pago
 * @author Manuela Planelles
 * @version 1.0
 * @see TarjetaCredito
 * @see PayPal
 * @see Bizum
 */
public abstract class MetodoPago {

    public MetodoPago() {
    }

    public abstract void procesarPago(double importe);
}