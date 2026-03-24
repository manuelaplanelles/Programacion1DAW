package org.example;

public class EjercicioRecursividad4 {
    public static void main(String[] args) {

    }
    public static boolean esBinario(int numero) {
        String numeroTexto = String.valueOf(numero);

        for (int i = 0; i < numeroTexto.length(); i++) {
            char digito = numeroTexto.charAt(i);

            if (digito != '0' && digito != '1') {
                return false;
            }
        }
        return true;
    }
}
