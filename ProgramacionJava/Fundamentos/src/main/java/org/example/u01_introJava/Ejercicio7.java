package org.example.u01_introJava;

import java.util.Scanner;

public class Ejercicio7 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        String tomate, aceite, jamon;


        while (true) {
            System.out.println("¿Tienes tomate? (si/no): ");
            tomate = teclado.nextLine();

            if (tomate.equals("si") || tomate.equals("no")) {
                break;
            } else {
                System.out.println("Entrada inválida. Escribe 'si' o 'no'.");
            }
        }

        while (true) {
            System.out.println("¿Tienes aceite? (si/no): ");
            aceite = teclado.nextLine();

            if (aceite.equals("si") || aceite.equals("no")) {
                break;
            } else {
                System.out.println("⚠ Entrada inválida. Escribe 'si' o 'no'.");
            }
        }

        while (true) {
            System.out.println("¿Tienes jamón? (si/no): ");
            jamon = teclado.nextLine();

            if (jamon.equals("si") || jamon.equals("no")) {
                break;
            } else {
                System.out.println("Entrada inválida. Escribe 'si' o 'no'.");
            }
        }

        if (tomate.equals("no") || aceite.equals("no") || jamon.equals("no")) {
            System.out.println("Debes ir a comprar.");
        } else {
            System.out.println("No necesitas comprar, tienes todo.");
        }
    }
}
