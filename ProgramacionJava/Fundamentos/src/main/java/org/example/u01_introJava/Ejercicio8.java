package org.example.u01_introJava;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /* Realiza un programa para mostrar un mensaje por pantalla que indique si un
        triángulo es «escaleno», «equilátero» o «isósceles» introduciendo el tamaño de
        sus lados por teclado.*/

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un lado del triangulo: ");
        int lado1 = teclado.nextInt();
        System.out.println("Introduce otro lado del triangulo: ");
        int lado2 = teclado.nextInt();
        System.out.println("Introduce otro lado del triangulo: ");
        int lado3 = teclado.nextInt();

        if (lado1==lado2 && lado2==lado3){
            System.out.println("Es im triangulo EQUILATERO");
        }else {
            if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                System.out.println("Es im triangulo ISÓSCELES");
            }
            else{
                System.out.println("Es im triangulo ESCALENO");
            }
        }
    }
}