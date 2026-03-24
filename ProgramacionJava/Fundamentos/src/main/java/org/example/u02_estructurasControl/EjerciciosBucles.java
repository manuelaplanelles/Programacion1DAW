package org.example.u02_estructurasControl;

import java.util.Scanner;

public class EjerciciosBucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
        Ejercicio 1: Validar una contraseña: Válida la entrada de un usuario que escribe una contraseña hasta que sea correcta.
        */
        String contrasenyaCorrecta = "hola";
        String contrasenya;

        do {
            System.out.println("Introduce una contraseña: ");
            contrasenya = teclado.next();

            if (!contrasenya.equals(contrasenyaCorrecta)){
                System.out.println("La contraseña es incorrecta.");
            }

        }while (!contrasenya.equals(contrasenyaCorrecta));

        System.out.println("¡Contraseña correcta!");

        /*
        Ejercicio 2: Números del N al 1: Imprime los números del N (introducido por el usuario) al 1 en orden descendente.
        */
        System.out.println("Introduce tus numeros: ");
        int num = teclado.nextInt();

        for(int i = num; i >= 1; i--){
            System.out.println(i);
        }


        /*
        Ejercicio 3: Números del 1 al 50 que son múltiplos de 3: El símbolo % en Java se llama operador de módulo, y se
        usa para obtener el resto de un problema de división. Es decir, devuelve el resto de la división entre dos números:
            7 % 2 = 1
            15 % 3 = 0
            4 % 2 = 0
        */
        for(int i = 1; i <= 50; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }

        /*
        Ejercicio 4: Imprimir caracteres de una cadena: Imprime cada carácter de una cadena introducida por el usuario,
        en una nueva línea.
        */
        System.out.println("Introduce una palabra: ");
        String palabra = teclado.next();

        for(int i = 0; i < palabra.length();i++){
            System.out.println(palabra.charAt(i));
        }

        /*
        Ejercicio 5: Tabla de multiplicar: Imprime la tabla de multiplicar de cualquier número N introducido por el usuario.
        */
        System.out.println("Introduce el numero a mutiplicar: ");
        int multiplicar = teclado.nextInt();
        for (int i = 1; i <= 10; i++){
            int  resultado = i * multiplicar;
            System.out.println( i + " x " + multiplicar+ " = " + resultado);
        }

        /*
        Ejercicio 6. Programa que pida N números desde teclado y muestre la suma total de todos ellos
        PISTA: para implementar los acumuladores usa el operador "+=".
            Ejemplo: Cuántos números quieres sumar?: 10
                Inserta nº1: 1
                Inserta nº2: 1
                Inserta nº3: 1
                Inserta nº4: 1
                Inserta nº5: 1
                Inserta nº6: 1
                Inserta nº7: 1
                Inserta nº8: 1
                Inserta nº9: 1
                Inserta nº10: 1
            El resultado es: 10
        */
        System.out.println("Cuantos números quieres sumear: ");
        int sumaNum = teclado.nextInt();
        int contador = 0;
        for (int i = 1; i <= sumaNum; i ++){
            System.out.println("Introduce nº" + i);
            int num1 = teclado.nextInt();
            contador += num1;
        }
        System.out.println("El resultado es: "+ contador);

        /*
        Ejercicio 6: Factorial de un número: Calcula el factorial de un número N cualquiera introducido por el usuario.
        */
        System.out.println("Indica numero factorial: ");
        int factorial = teclado.nextInt();
        int contador2 = 1;
        for (int i = factorial; i >= 1; i --){
            contador *= i;
        }
        System.out.println(contador2);


        /*
        Ejercicio 7: Invertir una cadena: Imprime una cadena en orden inverso.
         */
        System.out.println("Indica una cadena: ");
        String cadena = teclado.next();
        for(int i = cadena.length()-1; i>=0;i--){
            System.out.print(cadena.charAt(i));
        }
    }

}
