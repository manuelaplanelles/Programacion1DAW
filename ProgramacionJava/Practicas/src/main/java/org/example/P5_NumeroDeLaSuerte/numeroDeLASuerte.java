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
            System.out.println("Fecha válida, procesando...");
        }

        String diaTexto = fecha.substring(0, primeraBarra);
        String mesTexto = fecha.substring(primeraBarra + 1, segundaBarra);
        String anoTexto = fecha.substring(segundaBarra + 1);

        int dia = Integer.parseInt(diaTexto);
        int mes = Integer.parseInt(mesTexto);
        int ano = Integer.parseInt(anoTexto);

        int subtotal = dia + mes + ano;
        System.out.println(dia + " + " + mes + " + " + ano + " = " + subtotal);

        String subtotalTexto = String.valueOf(subtotal);
        int total = 0;
        String calculo = "";

        for (int i = 0; i < subtotalTexto.length(); i++) {
            int cifra = Integer.parseInt(subtotalTexto.substring(i, i + 1));
            total += cifra;
            if (i < subtotalTexto.length() - 1) {
                calculo += cifra + "+";
            } else {
                calculo += cifra;
            }
        }

        System.out.println(calculo + " = " + total);
        System.out.println("Tu número de la suerte es el: " + total);
    }
}