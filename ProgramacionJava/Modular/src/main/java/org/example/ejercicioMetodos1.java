package org.example;

import java.util.Scanner;

public class ejercicioMetodos1 {


    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);

        System.out.println("Dame un numero entero: ");
        int num1 = teclado.nextInt();
        calcularCubo(num1);

        System.out.println(calcularCubo(num1));
    }
    public static int calcularCubo(int num1){

        int cubo= num1*num1*num1;
        return cubo;
    }

}
