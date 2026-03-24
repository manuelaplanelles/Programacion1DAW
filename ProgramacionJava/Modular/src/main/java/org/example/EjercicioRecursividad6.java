package org.example;

public class EjercicioRecursividad6 {
    public static void main(String[] args) {

    }
    public static boolean estaOrdenada(String palabra) {
        for (int i = 0; i < palabra.length() - 1; i++) {
            char letraActual = palabra.charAt(i);
            char letraSiguiente = palabra.charAt(i + 1);
            if (letraActual > letraSiguiente) {
                return false;
            }
        }
        return true;
    }
}
