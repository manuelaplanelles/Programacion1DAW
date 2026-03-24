package org.example.u02_estructurasControl;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosReandom {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
        Ejercicio 1: Lanzamiento de dados
            Crea un programa que simule el lanzamiento de dos dados. El programa debe:
            Generar dos números aleatorios entre 1 y 6.
            Mostrar los resultados de cada dado y la suma total.

        Random random = new Random();
        int aleatorio1 = random.nextInt(1,7);
        int aleatorio2 = random.nextInt(1,7);
        int sumaTotal = aleatorio2+aleatorio1;
        System.out.println("Dado 1: " + aleatorio1);
        System.out.println("Dado 2: " + aleatorio2);
        System.out.println("Suma de dados: " + sumaTotal);
         */
        /*
        Ejercicio 2: Generador de Contraseñas
            Crea un generador de contraseñas aleatorias. El programa debe:
            Generar una contraseña de 12 dígitos que contenga letras mayúsculas, minúsculas y números.
            Usa la siguiente cadena como referencia:
            caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
         */
        Random random = new Random();
        String caracter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contructorContrasenya = "";
        for(int i = 1; i<=13; i++){
            contructorContrasenya += caracter.charAt(random.nextInt(0,62));
        }
        System.out.println("Tu contraseña es: " + contructorContrasenya);

        /*
        Ejercicio 3: Números aleatorios en un rango
            Desarrolla un programa que genere N números aleatorios en un rango definido por el usuario. El programa debe:
            Solicitar al usuario el rango mínimo y máximo. (Validar que mínimo es menor que máximo).
            Usa la fórmula: aleatorio.nextInt(max - min + 1) + min
            Solicitar al usuario cuántos números aleatorios quiere.
            Mostrar todos los números generados.
         */

        /*
        Ejercicio 4: Contraseña mejorada
            Modifica el programa del ejercicio 2 para que la contraseña que se genera tenga entre 8 y 12 caracteres.
            Además, debemos asegurar que contiene mayúsculas, minúsculas y números.
         */
        Random random2 = new Random();
        String caracterMay = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String caracterMin = "abcdefghijklmnopqrstuvwxyz";
        String nume= "0123456789";
        String contructorContrasenya2 = "";
        contructorContrasenya2 += caracterMay.charAt(random.nextInt(0,26));
        contructorContrasenya2 += caracterMin.charAt(random.nextInt(0,26));
        contructorContrasenya2 += nume.charAt(random.nextInt(0,10));
        String todos = caracterMay + caracterMin + nume;
        for(int i = 1; i<=random.nextInt(5, 10); i++){
            contructorContrasenya2 += todos.charAt(random.nextInt(0, 62));
        }
        System.out.println("Tu contraseña es: " + contructorContrasenya2);



    }
}
