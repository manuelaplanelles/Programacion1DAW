package org.example.u02_estructurasControl;

import java.util.Scanner;

public class EjerciciosCadenaCaracteres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
        EJERCICIO 1. A partir de una cadena de caracteres que se pide al usuario por teclado, aplicar:
        a. Muestra el texto original introducido.
        b. Muestra la longitud del texto introducido (length()).
        c. Elimina los espacios del texto (si los hay) y muestra como queda (replace()).
        d. Divide la cadena de texto en dos partes iguales (por la mitad) para posteriormente concatenarlas y mostrarlas de nuevo, pero con el siguiente formato: "Primera mitad del texto es " + mitad1 + "y la segunda mitad del texto es " + mitad2. (substring + concat).
        e. Transforma la cadena de texto a mayúsculas (toUpperCase()).
         */
        System.out.println("Introduce una palabra o frase: ");
        String frase = teclado.nextLine();

        System.out.println(frase);
        System.out.println(frase.length());
        String fraseSinEspacios = frase.replace(" ","");
        System.out.println(fraseSinEspacios);

        int mitad = frase.length()/2;
        String mitad1 = frase.substring(0, mitad);
        String mitad2 = frase.substring(mitad);

        System.out.println("Primera mitad del texto es: " + mitad1);
        System.out.println("Segunda mitad del texto es: " + mitad2);

        System.out.println(frase.toUpperCase());

        /*
        EJERCICIO 2. Desarrolla un programa que permita leer 2 cadenas de caracteres (palabras) diferentes y nos diga
        cuál es la más larga.
         */
        String palabra1 = "manuela";
        String palabra2 = "planelles";

        if (palabra1.length()>palabra2.length()){
            System.out.println("La palabra mas larga es: " + palabra1);
        }else{
            System.out.println("La palabra más larga es: " + palabra2);
        }

        /*
        EJERCICIO 3. Programa que quite a una variable numérica N sus m últimas cifras.
         */
        System.out.print("Introduce el número (N): ");
        String n = teclado.next();
        System.out.print("¿Cuántas cifras quieres quitar (m)?: ");
        int m = teclado.nextInt();

        String resultado = n.substring(0, n.length()-m);
        System.out.println(resultado);

        /*
        EJERCICIO 4. Escribe un programa que cuente cuántas veces aparece una subcadena dentro de una cadena, sin usar
        bucles. Usa como ejemplo las siguientes:
            String texto = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
            String subcadena = "Mundo";
         */
        String texto = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
        System.out.println(texto);
        String subcadena = "Mundo";
        System.out.println(subcadena);

        int longitud = texto.length();
        String sinSubcadena =  texto.replace(subcadena, "");
        System.out.println(longitud + " " + sinSubcadena);

        int longitudSinMundo = sinSubcadena.length();
        int letrasDesaparecidas = longitud - longitudSinMundo;
        System.out.println(longitudSinMundo + " " + letrasDesaparecidas);

        int cantidad = letrasDesaparecidas / subcadena.length();
        System.out.println("La subcadena " + subcadena + " aparece " + cantidad);

        /*
        EJERCICIO 5. Escribe un programa que simule un juego para 2 jugadores. El funcionamiento debe ser el siguiente:
        1. El programa le pide al Jugador 1 introducir una cadena.
        2. El programa pide al Jugador 2 que introduzca una palabra.
        3. El programa debe verificar si la palabra insertada por el Jugador 2 está contenida en la cadena que ha introducido el Jugador 1.
          - Si no está, se debe restar un intento (intentos iniciales 10) y mostrar un mensaje de intento fallido. Seguidamente, el programa procederá a dar otra oportunidad al Jugador 2 (hasta 10 intentos).
          - Si la palabra está, el programa imprimirá un mensaje de ¡enhorabuena, has acertado una palabra! y finalizará.
        Usa la función contains("palabra"), la cual devuelve un booleano.
         */
    }
}
