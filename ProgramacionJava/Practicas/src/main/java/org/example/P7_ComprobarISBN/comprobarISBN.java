package org.example.P7_ComprobarISBN;

import java.util.Scanner;

public class comprobarISBN {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca ISBN: ");
        String isbn = teclado.next().toUpperCase();

        if(isbn.length() !=10){
            System.out.println("ERROR: el ISBN debe tener exactamente 10 caracteres");
            return;
        }
        if (isbn.contains("?")) {
            repararISBN(isbn);
        } else {
            comprobarISBN(isbn);
        }

    }
    public static void comprobarISBN(String isbn){
        int suma = 0;

        for (int i = 0; i < isbn.length(); i++) {
            int multiplicador = 10 - i;
            int cifra;
            if (isbn.charAt(i) == 'X') {
                cifra = 10;
            } else {
                cifra = isbn.charAt(i) - '0';
            }
            suma += cifra * multiplicador;
        }

        if (suma % 11 == 0) {
            System.out.println("El ISBN es válido.");
        } else {
            System.out.println("El ISBN no es válido.");
        }
    }

    public static void repararISBN(String isbn){
        int posicion = isbn.indexOf("?");

        for (int intento = 0; intento <= 9; intento++) {
            String isbnReparado = isbn.substring(0, posicion) + intento + isbn.substring(posicion + 1);

            int suma = 0;
            for (int i = 0; i < isbnReparado.length(); i++) {
                int multiplicador = 10 - i;
                int cifra;
                if (isbnReparado.charAt(i) == 'X') {
                    cifra = 10;
                } else {
                    cifra = isbnReparado.charAt(i) - '0';
                }
                suma += cifra * multiplicador;
            }

            if (suma % 11 == 0) {
                System.out.println("El dígito que falta es " + intento);
                return;
            }
        }

        String isbnReparado = isbn.substring(0, posicion) + "X" + isbn.substring(posicion + 1);
        int suma = 0;
        for (int i = 0; i < isbnReparado.length(); i++) {
            int multiplicador = 10 - i;
            int cifra;
            if (isbnReparado.charAt(i) == 'X') {
                cifra = 10;
            } else {
                cifra = isbnReparado.charAt(i) - '0';
            }
            suma += cifra * multiplicador;
        }
        if (suma % 11 == 0) {
            System.out.println("El dígito que falta es X");
        } else {
            System.out.println("No se encontró ningún dígito válido.");
        }
    }
}