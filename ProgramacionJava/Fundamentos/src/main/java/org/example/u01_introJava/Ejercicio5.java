package org.example.u01_introJava;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*Realizar un programa para dividir dos números leídos por teclado y escribir el resultado.
        Se debe controlar que el divisor no sea igual a 0 e informaremos con el siguiente mensaje:
        "ERROR: no se puede dividir entre 0".*/

        Scanner teclado = new Scanner(System.in);
        System.out.println("Intoriduce un número");
        int num1 = teclado.nextInt();
        System.out.println("Intoriduce otro número");
        int num2 = teclado.nextInt();

        try{
            int result = num1/num2;
        }catch (ArithmeticException e){
            System.out.println("ERROR: no se puede dividir entre 0");
        }
    }
}
