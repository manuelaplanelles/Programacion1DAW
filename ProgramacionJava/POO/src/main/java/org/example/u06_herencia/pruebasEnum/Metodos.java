package org.example.u06_herencia.pruebasEnum;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Metodo opcion = Metodo.PAYPAL;
        System.out.println(opcion);
        System.out.println("Metodos válidos: ");
        for (Metodo metodo : Metodo.values()){
            System.out.println(metodo);
        }
        System.out.println(opcion.ordinal()); //indica la posición
        System.out.println(opcion.name());

        System.out.println("Elige un metodo de pago: ");
        Metodo respuesta = Metodo.valueOf(teclado.next().toLowerCase());
        System.out.println("Metodo elegido: " + respuesta);
    }
}
