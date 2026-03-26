package org.example.P5_NumeroDeLaSuerte;

import java.util.Scanner;

public class numeroDeLASuerte {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa)");
        String fecha = teclado.next();
        int primeraBarra = fecha.indexOf("/");
        int segundaBarra = fecha.lastIndexOf("/");

        if (!fecha.contains("/") || primeraBarra == segundaBarra || fecha.contains("-")) {
            System.out.println("ERROR: fecha no válida, usa el formato dd/mm/aaaa con números positivos.");
            return;
        } else {
            System.out.println("Formato válida, procesando...");
        }
        String diaTexto = fecha.substring(0, primeraBarra);
        String mesTexto = fecha.substring(primeraBarra + 1, segundaBarra);
        String anoTexto = fecha.substring(segundaBarra + 1);

        if (anoTexto.length() != 4) {
            System.out.println("ERROR: el año debe tener 4 cifras.");
            return;
        }
        int dia = Integer.parseInt(diaTexto);
        int mes = Integer.parseInt(mesTexto);
        int ano = Integer.parseInt(anoTexto);

        if (dia < 1 || dia > 31) {
            System.out.println("ERROR: el día debe estar entre 1 y 31.");
            return;
        }
        if (mes < 1 || mes > 12) {
            System.out.println("ERROR: el mes debe estar entre 1 y 12.");
            return;
        }
        int subtotal = dia + mes + ano;
        System.out.println(dia + " + " + mes + " + " + ano + " = " + subtotal);

        String subtotalTexto = String.valueOf(subtotal);

        int cifra1 = Integer.parseInt(subtotalTexto.substring(0, 1));
        int cifra2 = Integer.parseInt(subtotalTexto.substring(1, 2));
        int cifra3 = Integer.parseInt(subtotalTexto.substring(2, 3));
        int cifra4 = Integer.parseInt(subtotalTexto.substring(3, 4));

        int total = cifra1 + cifra2 + cifra3 + cifra4;

        System.out.println(cifra1 + "+" + cifra2 + "+" + cifra3 + "+" + cifra4 + " = " + total);
        System.out.println("Tu número de la suerte es el: " + total);
    }
}