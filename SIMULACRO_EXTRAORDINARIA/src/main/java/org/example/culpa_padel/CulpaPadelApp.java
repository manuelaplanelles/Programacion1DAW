package org.example.culpa_padel;

import java.util.Scanner;

public class CulpaPadelApp {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** CULPA PÁDEL APP ***");
       int suma;
        do {
            System.out.println("Introduce el porcentaje de culpa de los 4 factores externos (compi-pista-pala-pelota):");

            String[] datos = teclado.next().split("-");
            suma = 0;
            for (int i = 0; i< datos.length; i++){
                suma+=Integer.parseInt(datos[i]);
            }
            if(suma>100){
                System.out.println("ERROR. La suma es mayor a 100.");
            }
        }while (suma>100);

            int culpaTuya = 100-suma;
        System.out.println("Tienes un "+culpaTuya+"% de culpa.");




    }
}
