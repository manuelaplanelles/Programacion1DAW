package org.example;
import java.util.Scanner;

public class BateriaRecursividad {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void borrar() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("No se pudo limpiar la pantalla");
        }
    }

    public static void menu() {
        System.out.println("*** Bateria de ejercicios sobre recursividad ***");
        System.out.println();
        System.out.println("Selecciona a continuacion el modo que quieras ejecutar...");
        System.out.println("   1 - Digitos");
        System.out.println("   2 - Potencias");
        System.out.println("   3 - Del reves");
        System.out.println("   4 - Binario");
        System.out.println("   5 - A binario");
        System.out.println("   6 - Orden alfabetico");
        System.out.println("   7 - Mostrar suma");
        System.out.println();
        System.out.print("Introduce el numero: ");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            case 6:
                ejercicio6();
                break;
            case 7:
                ejercicio7();
                break;
            default:
                System.out.println("Opcion no valida");
                salida();
                break;
        }
    }

    public static void salida() {
        System.out.println();
        System.out.println("Elige una opcion: ");
        System.out.println("   [M] - Volver al menu principal");
        System.out.println("   [X] - Salir");
        System.out.println();
        System.out.print("Introduce una opcion: ");
        char opcion = teclado.next().toUpperCase().charAt(0);

        switch (opcion) {
            case 'M':
                borrar();
                menu();
                break;
            case 'X':
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opcion no valida");
                salida();
                break;
        }
    }

    // EJERCICIO 1: Contar digitos de un numero
    public static void ejercicio1() {
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        int resultado = contarDigitos(numero);
        System.out.println("El numero " + numero + " tiene " + resultado + " digitos");

        salida();
    }

    public static int contarDigitos(int numero) {
        if (numero < 10) {
            return 1;
        } else {
            return 1 + contarDigitos(numero / 10);
        }
    }

    // EJERCICIO 2: Potencia de un numero
    public static void ejercicio2() {
        System.out.print("Introduce la base: ");
        int base = teclado.nextInt();
        System.out.print("Introduce el exponente: ");
        int exponente = teclado.nextInt();

        int resultado = potencia(base, exponente);
        System.out.println("El resultado de " + base + "^" + exponente + " es " + resultado);

        salida();
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    // EJERCICIO 3: Del reves (numero o cadena)
    public static void ejercicio3() {
        System.out.println("Que quieres invertir?");
        System.out.println("   1 - Un numero");
        System.out.println("   2 - Una cadena de texto");
        System.out.print("Elige opcion: ");
        int opcion = teclado.nextInt();
        teclado.nextLine(); // Limpiar buffer

        if (opcion == 1) {
            System.out.print("Introduce un numero: ");
            int numero = teclado.nextInt();
            System.out.print("El numero del reves es: ");
            numeroDelReves(numero);
            System.out.println();
        } else if (opcion == 2) {
            System.out.print("Introduce una cadena: ");
            String cadena = teclado.nextLine();
            char[] cadenaChar = cadena.toCharArray();
            System.out.print("La cadena del reves es: ");
            cadenaDelReves(cadenaChar, cadenaChar.length - 1);
            System.out.println();
        } else {
            System.out.println("Opcion no valida");
        }

        salida();
    }

    public static void numeroDelReves(int numero) {
        if (numero < 10) {
            System.out.print(numero);
        } else {
            System.out.print(numero % 10);
            numeroDelReves(numero / 10);
        }
    }

    public static void cadenaDelReves(char[] cadena, int posicion) {
        if (posicion >= 0) {
            System.out.print(cadena[posicion]);
            cadenaDelReves(cadena, posicion - 1);
        }
    }

    // EJERCICIO 4: Comprobar si un numero es binario
    public static void ejercicio4() {
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        if (esBinario(numero)) {
            System.out.println("El numero " + numero + " SI es binario");
        } else {
            System.out.println("El numero " + numero + " NO es binario");
        }

        salida();
    }

    public static boolean esBinario(int numero) {
        if (numero < 10) {
            if (numero == 0 || numero == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            if (numero % 10 != 0 && numero % 10 != 1) {
                return false;
            } else {
                return esBinario(numero / 10);
            }
        }
    }

    // EJERCICIO 5: Convertir a binario
    public static void ejercicio5() {
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        String resultado = aBinario(numero);
        System.out.println("El numero " + numero + " en binario es " + resultado);

        salida();
    }

    public static String aBinario(int numero) {
        if (numero == 0 || numero == 1) {
            return Integer.toString(numero);
        } else {
            return aBinario(numero / 2) + numero % 2;
        }
    }

    // EJERCICIO 6: Comprobar orden alfabetico
    public static void ejercicio6() {
        System.out.print("Introduce una palabra: ");
        teclado.nextLine(); // Limpiar buffer
        String palabra = teclado.nextLine();

        if (estaOrdenada(palabra)) {
            System.out.println("La palabra \"" + palabra + "\" SI esta ordenada alfabeticamente");
        } else {
            System.out.println("La palabra \"" + palabra + "\" NO esta ordenada alfabeticamente");
        }

        salida();
    }

    public static boolean estaOrdenada(String palabra) {
        if (palabra.length() <= 1) {
            return true;
        }
        if (palabra.charAt(0) > palabra.charAt(1)) {
            return false;
        }
        return estaOrdenada(palabra.substring(1));
    }

    // EJERCICIO 7: Mostrar suma de 1 hasta N
    public static void ejercicio7() {
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        int resultado = mostrarSuma(numero);
        System.out.println(" = " + resultado);

        salida();
    }

    public static int mostrarSuma(int n) {
        if (n == 1) {
            System.out.print("1");
            return 1;
        }
        int sumaAnterior = mostrarSuma(n - 1);
        System.out.print(" + " + n);
        return n + sumaAnterior;
    }
}