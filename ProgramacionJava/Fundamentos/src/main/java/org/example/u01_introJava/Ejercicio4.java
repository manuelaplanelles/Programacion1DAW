package org.example.u01_introJava;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*Realizar un programa para calcular el mínimo de 3 números  leídos desde teclado.
        En caso de que el usuario introduzca dos o tres números iguales, informaremos con
        el siguiente mensaje: "ERROR: hay números introducidos que son iguales".*/
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el primer segundo: ");
        int num2 = teclado.nextInt();
        System.out.println("Introduce el primer tercero: ");
        int num3 = teclado.nextInt();

        if (num1==num2 || num2 == num3 || num3==num1){
            System.out.println("ERROR: hay números introducidos que son iguales");
        }else {
            if (num1>num2 && num1>num3){
                System.out.println("El" +num1+ "es Mayor");
            } else if (num2>num1 && num2>num3) {
                System.out.println("El" +num2+ "es Mayor");
            }else{
                System.out.println("El" +num3+ "es Mayor");
            }
        }

    }
}
