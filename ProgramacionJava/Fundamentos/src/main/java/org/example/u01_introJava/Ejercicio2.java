package org.example.u01_introJava;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce las horas: ");
        int horas = teclado.nextInt();

        System.out.println("Introduce la tarifa por hora: ");
        int tarifa = teclado.nextInt();

        int salario = horas * tarifa;
        System.out.println(salario);
        double salarioExtra=0;
        if (horas >= 40){
           int horasExtras = horas - 40;
           salarioExtra = (horasExtras * (0.5*tarifa));
           System.out.println(salarioExtra + " " + horasExtras);
        }
        double salarioTotal = salarioExtra + salario;

        System.out.println("Salario: " + salarioTotal + ".");
    }
}
