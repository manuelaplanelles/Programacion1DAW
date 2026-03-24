package org.example.u02_estructurasControl;

import java.util.Scanner;

public class EjerciciohasNextInt {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Elige el modo que quieras: ");
        System.out.println("[1] - Modo 1");
        System.out.println("[2] - Modo 2");
        String modo = teclado.next();

        if(modo.equals("1")) {
            System.out.println("Introduce el año de nacimiento: ");

            if (teclado.hasNextInt()) {
                String anoNacimiento = teclado.next();
                int anoNumero = Integer.parseInt(anoNacimiento);

                if (anoNumero >= 1900 && anoNumero <= 2026) {
                    System.out.println("Año correcto: " + anoNumero);

                } else {
                    System.out.println("ERROR: El año debe estar entre 1900 y 2026.");
                }
            } else {
                System.out.println("ERROR: Debes introducir un número entero.");
            }
        }else if (modo.equals("2")){
            System.out.println("Indica tu edad: ");

            if (teclado.hasNextInt()) {
                String edad = teclado.next();
                int edadNumero = Integer.parseInt(edad);

                if(edadNumero>=0){
                    System.out.println("La edad es correcto: " + edadNumero);
                }else {
                    System.out.println("ERROR: La edad debe ser más de 0 años");
                }
            }else {
                System.out.println("ERROR: Debes introducir un número entero.");
            }
        }

    }
}
