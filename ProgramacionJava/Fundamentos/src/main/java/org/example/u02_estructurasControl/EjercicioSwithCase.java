package org.example.u02_estructurasControl;

import java.time.LocalDateTime;
import java.util.Scanner;

public class EjercicioSwithCase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int ANYO_MINIMO = 1900;

        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();

        int anyo_nacimiento_int = 0;


        System.out.println("Elige un modo...");
        System.out.println("[1] - Año de nacimiento");
        System.out.println("[2] - Edad");

        int modo = 0;
        if (teclado.hasNextInt()) {
            modo = teclado.nextInt();
        } else {
            System.out.println("Introduce un valor válido...");
            return;
        }

        switch (modo) {
            case 1:
                System.out.println("Introduce tu año de nacimiento...");
                String anyo_nacimiento = teclado.next();

                try {
                    anyo_nacimiento_int = Integer.parseInt(anyo_nacimiento);
                } catch (Exception e) {
                    System.out.println("El formato introducido para el año no es correcto.");
                    return;
                }
                break;
            case 2:
                System.out.println("el nodo no exist");
                int edad = 0;
                System.out.println("Introduce tu edad...");
                if (teclado.hasNextInt()) {
                    edad = teclado.nextInt();
                } else {
                    System.out.println("Formato incorrecto. No es numérico.");
                    return;
                }

                if (edad >= 0) {
                    anyo_nacimiento_int = anyo_actual - edad;
                }

                break;
            default:


                if (anyo_nacimiento_int >= ANYO_MINIMO && anyo_nacimiento_int <= anyo_actual) {

                    if (anyo_nacimiento_int <= 1927) {
                        System.out.println("Generacion no bautizada");
                    } else if (anyo_nacimiento_int <= 1928 && anyo_nacimiento_int <= 1944) {
                        System.out.println("Generación Silent");
                    } else if (anyo_nacimiento_int >= 1945 && anyo_nacimiento_int <= 1964) {
                        System.out.println("Baby Boomer");
                    } else if (anyo_nacimiento_int >= 1965 && anyo_nacimiento_int <= 1981) {
                        System.out.println("Generación X");
                    } else if (anyo_nacimiento_int >= 1982 && anyo_nacimiento_int <= 1994) {
                        System.out.println("Millenials la mejor");
                    } else {
                        System.out.println("Generación Z");
                    }

                }
        }
    }
}
