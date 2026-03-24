package org.example;

public class EjercicioRecursividad1 {
    public static void main(String[] args){

    }

    public static int contarDigitos(int n) {
        if (n < 10) {
            return 1;
        }
        int contador = 0;
        while (n > 0) {
            n = n / 10;
            contador++;
        }
        return contador;
    }
}
