package org.example;

public class EjercicioRecursividad2 {
    public static void main(String[] args) {

    }
    public static double calcularPotencia(double base, double exponente) {
        double resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }
}
