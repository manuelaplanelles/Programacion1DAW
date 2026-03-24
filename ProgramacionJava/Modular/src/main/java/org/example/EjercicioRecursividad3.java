package org.example;

public class EjercicioRecursividad3 {
    public static void main(String[] args) {

    }
    public static String invertirNumero(int numero) {
        String texto = String.valueOf(numero);
        char[] caracteres = texto.toCharArray();

        String invertido = "";
        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertido += caracteres[i];
        }
        return invertido;
    }
}
