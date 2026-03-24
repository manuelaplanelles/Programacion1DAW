package org.example;

import java.util.Scanner;

public class ejercicioMetodos4 {
    public static void main(String[] args) {
        float[] ventas = generarDatos();

        if (ventas[0] == -1) {
            return;
        }

        String diaMax = maxVentas(ventas);
        String diaMin = minVentas(ventas);
        float media = calcularMedia(ventas);
        String recaudacionDomingo = verificarDomingo(ventas, media);

        System.out.println(diaMax + " " + diaMin + " " + recaudacionDomingo);
    }

    public static float[] generarDatos() {
        Scanner teclado = new Scanner(System.in);
        float[] datos = new float[7]; // 7 días de la semana

        for (int i = 0; i < 7; i++) {
            datos[i] = teclado.nextFloat();

            // Si el primer día es -1, terminar
            if (i == 0 && datos[i] == -1) {
                return datos;
            }
        }
        return datos;
    }
    public static String maxVentas(float[] datos) {
        float max = datos[0];
        int posMax = 0;

        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > max) {
                max = datos[i];
                posMax = i;
            }
        }
        return obtenerDiaSemana(posMax);
    }

    public static String minVentas(float[] datos) {
        float min = datos[0];
        int posMin = 0;

        for (int i = 1; i < datos.length; i++) {
            if (datos[i] < min) {
                min = datos[i];
                posMin = i;
            }
        }
        return obtenerDiaSemana(posMin);
    }
    public static float calcularMedia(float[] datos) {
        float suma = 0;

        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }
        return suma / datos.length;
    }
    public static String verificarDomingo(float[] datos, float media) {
        // El domingo es el índice 6 (último día)
        if (datos[6] > media) {
            return "SI";
        } else {
            return "NO";
        }
    }
    public static String obtenerDiaSemana(int pos) {
        switch (pos) {
            case 0: return "MARTES";
            case 1: return "MIERCOLES";
            case 2: return "JUEVES";
            case 3: return "VIERNES";
            case 4: return "SABADO";
            case 5: return "DOMINGO";
            case 6: return "LUNES";
            default: return "";
        }
    }
}