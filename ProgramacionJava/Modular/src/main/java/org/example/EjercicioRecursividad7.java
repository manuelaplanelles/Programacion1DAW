package org.example;

public class EjercicioRecursividad7 {
    public static void main(String[] args) {

    }
    public static int sumaHastaN(int n) {
        int suma = 0;
        String cadena = "";

        for (int i = 1; i <= n; i++) {
            suma += i;
            cadena += i;

            if (i < n) {
                cadena += "+";
            }
        }
        cadena += " = " + suma;
        System.out.println(cadena);
        return suma;
    }
}
