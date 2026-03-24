package org.example;

import java.util.Scanner;

public class ejercicioMetodos2 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        menu();
        char opcionMenu = teclado.next().charAt(0);
        if (opcionMenu == '1'|| opcionMenu == '2' || opcionMenu == '3' || opcionMenu == 'X'){

        }else{
            System.out.println("Debes indicar un caracter correcto.");
        }
    }
    public static void menu(){
        System.out.println("***Menú Usuario***");
        System.out.println("[1] - Inicio");
        System.out.println("[2] - Contacto");
        System.out.println("[3] - Inscripción");
        System.out.println("[X] - Salida");

    }
}
