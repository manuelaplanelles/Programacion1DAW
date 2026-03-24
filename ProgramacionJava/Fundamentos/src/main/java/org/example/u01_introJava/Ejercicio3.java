package org.example.u01_introJava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /* Realizar un programa que pida un número al usuario, que deberá introducirlo usando el teclado.
        El algoritmo debe identificar si el número introducido se trata de un número positivo (>0) o un
        número negativo (<0) y controlar el caso particular del número 0, que es natural.*/

        Scanner tecl = new Scanner(System.in);

        System.out.println("Indica un número: ");
        int num = tecl.nextInt();

        if (num > 0) {
            System.out.println("El número " + num + " es POSITIVO ");
        } else {
            if (num < 0) {
                System.out.println("El número " + num + " es NEGATIVO");
            } else {
                System.out.println("El número " + num + " es NATURAL");
            }
        }
    }
}