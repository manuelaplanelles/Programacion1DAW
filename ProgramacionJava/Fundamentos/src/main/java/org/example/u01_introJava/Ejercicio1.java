package org.example.u01_introJava;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce las horas: ");
        int horas = teclado.nextInt();

        System.out.println("Introduce la tarifa por hora: ");
        int tarifa = teclado.nextInt();

        int salario = horas * tarifa;
        System.out.println("Salario: " + salario + ".");
    }
}
