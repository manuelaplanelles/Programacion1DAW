package org.example.u03_estructurasDatos;

import java.util.Random;

public class EjerciciosArrays {
    public static void main(String[] args) {
        /*
        Ejercicio 1. Suma de todos los elementos de un array: Crea un array de 8 números enteros e inicialízalo con
        números aleatorios [0,500]. Calcula y muestra la suma de todos los elementos del array.
                La suma de los elementos es: 75

        Random random = new Random();
        int[] num = new int[8];
        num[0] = random.nextInt(0, 500);
        num[1] = random.nextInt(0, 500);
        num[2] = random.nextInt(0, 500);
        num[3] = random.nextInt(0, 500);
        num[4] = random.nextInt(0, 500);
        num[5] = random.nextInt(0, 500);
        num[6] = random.nextInt(0, 500);
        num[7] = random.nextInt(0, 500);
        int suma = 0;
        suma += num[0];
        suma += num[1];
        suma += num[2];
        suma += num[3];
        suma += num[4];
        suma += num[5];
        suma += num[6];
        suma += num[7];
         */
        Random random2 = new Random();
        int[] num1 = new int[8];
        int suma2 = 0;
        for(int i = 0; i < num1.length; i++){
            num1[i] = random2.nextInt(0, 500);
            suma2 += num1[i];
        }
        System.out.println("La suma es: " + suma2);

        /*
        Ejercicio 2. Invierte un array: Crea un array de números enteros (los que quieras) y luego invierte sus
        elementos. Imprime el array invertido.

            Array original: 1, 2, 3, 4, 5
            Array invertido: 5, 4, 3, 2, 1
         */
        /*
        Ejercicio 3. Contar ocurrencias de un número en un array: Crea un array de 25 números enteros e inicialízalo
        con valores aleatorios [0,100]. Luego, pide al usuario que ingrese un número [0,100] y muestra cuántas veces
        aparece ese número en el array.
            Ingresa un número para buscar [0,100]: 5
            El número 5 aparece 3 veces en el array.
         */
        /*
        Ejercicio 4. Elimina un elemento de un array: Crea un array de enteros y permite al usuario ingresar una
        posición. Luego, crea un nuevo array sin el elemento en esa posición.
            Array original: 1, 3, 5, 7, 9
            Ingresa el índice a eliminar: 2
            Array resultante: 1, 3, 7, 9

        Ejercicio 5. Rota un array hacia la derecha: Crea un array y rota todos sus elementos una posición hacia la
        derecha. El último elemento debe moverse a la primera posición.
            Array original: 1, 2, 3, 4, 5
            Array rotado: 5, 1, 2, 3, 4.
         */
        /*
        Ejercicio 6. Comprueba si el array es simétrico (palíndromo):Crea un array de números enteros y verifica si es
        simétrico (es decir, se lee igual de izquierda a derecha que de derecha a izquierda).
            Array: 1, 2, 3, 2, 1
            Es simétrico: SI
         */
        /*
        Ejercicio 7. Combina dos arrays en uno: Crea dos arrays de enteros y combina sus elementos en un solo array más
        grande. Luego, muestra el nuevo array.
            Array 1: 1, 2, 3
            Array 2: 4, 5, 6
            Array combinado: 1, 2, 3, 4, 5, 6
         */
        /*
        Ejercicio 8. Inserta un elemento en un array: Crea un array e inserta un nuevo elemento en una posición
        específica sin sobrescribir el contenido.
            Array original: 1, 2, 3, 5
            Inserta el número 4 en la posición 3
            Array resultante: 1, 2, 3, 4, 5
         */
        /*
        Ejercicio 9. Palabra más larga: Crea un array de tipo String y muestra la palabra más larga que contenga.
         */
        /*
        Ejercicio 10. Identificar primera letra y contar: Crea un array de tipo String que guarde palabras y pide una
        letra (char) al usuario. El programa deberá mostrar todas las palabras cuya primera letra sea el valor del
        char que ha introducido el usuario.
         */
    }
}
