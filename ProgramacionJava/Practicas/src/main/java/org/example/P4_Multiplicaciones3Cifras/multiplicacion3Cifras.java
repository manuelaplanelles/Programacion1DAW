package org.example.P4_Multiplicaciones3Cifras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class multiplicacion3Cifras {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        int num1 = leerNumero("Introduce el multiplicando (3 cifras): ");
        int num2 = leerNumero("Introduce el multiplicador (3 cifras): ");

        System.out.println("El producto de la multiplicación es: " + multiplicacion(num1, num2));
        proceso(num1, num2);
        System.out.println("_____");
        System.out.println(multiplicacion(num1, num2));
    }
    public static int leerNumero(String mensaje) {
        int num = 0;
        boolean valido = false;
        do {
            try {
                System.out.println(mensaje);
                num = teclado.nextInt();
                if (num < 0) {
                    System.out.println("No se permiten números negativos.");
                } else if (num < 100 || num > 999) {
                    System.out.println("Debe tener exactamente 3 cifras (entre 100 y 999).");
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debe introducir un número entero.");
                teclado.next();
            }
        } while (!valido);
        return num;
    }
    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }
    public static void proceso(int num1, int num2) {
        String numStr = Integer.toString(num2);

        int num_3 = Integer.parseInt(numStr.substring(2, 3)); // unidades
        int num_2 = Integer.parseInt(numStr.substring(1, 2)); // decenas
        int num_1 = Integer.parseInt(numStr.substring(0, 1)); // centenas

        System.out.println("El proceso es: ");
        System.out.println("  " + num1);
        System.out.println("x " + num2);
        System.out.println("_____");
        System.out.println("  " + num1 * num_3);
        System.out.println(num1 * num_2 + "x");
        System.out.println(num1 * num_1 + "xx");
    }
}