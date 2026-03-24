package org.example.u02_estructurasControl;

import java.util.Scanner;

public class pre_examen {
    public static void main(String[] args) {
        //Ejercicio 1. Programa que pida por teclado una cantidad de números a introducir (N). Una vez introducidos,
        // el programa debe informar de cuántos números son:- mayores que 0, - menores que 0. y - iguales a 0.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cantidad de numeros: ");
        int N = teclado.nextInt();
        int contadorMayores = 0;
        int contadorMenores = 0;
        int contadorIguales = 0;
        System.out.println(N);
        for (int i = 0; i < N; i++) {
            int numero= teclado.nextInt();
            if (numero > 0) {
                contadorMayores++;
                System.out.println(numero + " es mayor que 0");
            } else if (numero < 0) {
                contadorMenores++;
                System.out.println(numero + " es menor de 0");
            } else{
                contadorIguales++;
                System.out.println(numero + " es igual a 0");
            }
        }
        System.out.println("Numeros mayores que 0: " +contadorMayores);
        System.out.println("Numeros menores que 0: " +contadorMenores);
        System.out.println("Numeros igual a 0: " +contadorIguales);
    }
}

