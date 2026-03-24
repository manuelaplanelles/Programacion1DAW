package org.example;

public class EjerciciosRecursividadMetodos {
    public static void main(String[] args) {
        // EJERCICIO 1: Contar dígitos
        System.out.println("EJERCICIO 1");
        System.out.println("Dígitos de 12345: " + contarDigitos(12345));
        System.out.println("Dígitos de 7: " + contarDigitos(7));

        // EJERCICIO 2: Potencia
        System.out.println("EJERCICIO 2");
        System.out.println("2^4 = " + calcularPotencia(2, 4));
        System.out.println("3^3 = " + calcularPotencia(3, 3));

        // EJERCICIO 3: Invertir número
        System.out.println(" EJERCICIO 3 ");
        System.out.print("1234 invertido: ");
        invertirNumero(1234);
        System.out.println();

        // EJERCICIO 4: Es binario
        System.out.println("EJERCICIO 4");
        System.out.println("¿1010 es binario? " + esBinario(1010));
        System.out.println("¿1234 es binario? " + esBinario(1234));

        // EJERCICIO 5: Decimal a binario
        System.out.println("EJERCICIO 5");
        System.out.println("10 en binario: " + decimalABinario(10));
        System.out.println("25 en binario: " + decimalABinario(25));

        // EJERCICIO 6: Palabra ordenada
        System.out.println("EJERCICIO 6");
        System.out.println("¿'abc' está ordenada? " + estaOrdenada("abc", 0));
        System.out.println("¿'casa' está ordenada? " + estaOrdenada("casa", 0));

        // EJERCICIO 7: Suma hasta N
        System.out.println("EJERCICIO 7");
        System.out.print("Suma hasta 4: ");
        sumaHastaN(1, 4);
        System.out.println();
    }

    //EJERCICIO 1: Contar dígitos de un número (RECURSIVO)
    public static int contarDigitos(int numero) {
        if (numero < 10) {
            return 1;
        } else {
            return 1 + contarDigitos(numero / 10);
        }
    }

    //EJERCICIO 2: Calcular potencia (base^exponente) (RECURSIVO)
    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }

    //EJERCICIO 3: Invertir un número (RECURSIVO) - Imprime en pantalla
    public static void invertirNumero(int numero) {
        if (numero < 10) {
            System.out.print(numero);
        } else {
            System.out.print(numero % 10);
            invertirNumero(numero / 10);
        }
    }
    public static int invertirNumeroValor(int numero) {
        return invertirAuxiliar(numero, 0);
    }
    private static int invertirAuxiliar(int numero, int invertido) {
        if (numero == 0) {
            return invertido;
        } else {
            int ultimoDigito = numero % 10;
            invertido = invertido * 10 + ultimoDigito;
            return invertirAuxiliar(numero / 10, invertido);
        }
    }

    //EJERCICIO 4: Comprobar si un número es binario (RECURSIVO)
    public static boolean esBinario(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }
        int ultimoDigito = numero % 10;
        if (ultimoDigito != 0 && ultimoDigito != 1) {
            return false;
        }
        return esBinario(numero / 10);
    }

    //EJERCICIO 5: Convertir decimal a binario (RECURSIVO)
    public static String decimalABinario(int numero) {
        if (numero == 0) {
            return "0";
        }
        if (numero == 1) {
            return "1";
        }
        return decimalABinario(numero / 2) + (numero % 2);
    }

    //EJERCICIO 6: Comprobar si una palabra está ordenada alfabéticamente (RECURSIVO)
    public static boolean estaOrdenada(String palabra, int posicion) {
        if (posicion >= palabra.length() - 1) {
            return true;
        }
        char actual = palabra.charAt(posicion);
        char siguiente = palabra.charAt(posicion + 1);

        if (actual > siguiente) {
            return false;
        }

        return estaOrdenada(palabra, posicion + 1);
    }

    //EJERCICIO 7: Suma de números desde 1 hasta N (RECURSIVO) - Imprime la cadena
    public static void sumaHastaN(int actual, int n) {
        System.out.print(actual);

        if (actual == n) {
            int suma = calcularSuma(n);
            System.out.print(" = " + suma);
        } else {
            System.out.print("+");
            sumaHastaN(actual + 1, n);
        }
    }
    private static int calcularSuma(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + calcularSuma(n - 1);
        }
    }
}
