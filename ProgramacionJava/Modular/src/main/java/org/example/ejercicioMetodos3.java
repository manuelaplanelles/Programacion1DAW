package org.example;

import java.util.Scanner;

public class ejercicioMetodos3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra = teclado.nextLine();
        mayusculas(palabra);
        vocales(palabra);
        System.out.println("La palabra " + mayusculas(palabra) + " tiene " + vocales(palabra) + " vocales.");
    }

    public static String mayusculas(String palabra) {

        String palMay = palabra.toUpperCase();
        return palMay;
    }

    public static int vocales(String palMay) {
        int contador = 0;
        for (int i = 0; i < palMay.length(); i++) {
            if ((palMay.charAt(i) == 'a') || (palMay.charAt(i) == 'e') || (palMay.charAt(i) == 'i') || (palMay.charAt(i) == 'o') || (palMay.charAt(i) == 'u')) {
                contador++;
            }
        }
        return contador;
    }
}