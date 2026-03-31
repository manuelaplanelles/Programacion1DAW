package org.example.P9_SimulacionSorteo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        // SORTEO
        int[] sorteo = new int[6];
        for (int i = 0; i < 6; i++) {
            int numero;
            boolean repetido;
            do {
                numero = random.nextInt(49) + 1;
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (sorteo[j] == numero) {
                        repetido = true;
                    }
                }
            } while (repetido);
            sorteo[i] = numero;
        }
        Arrays.sort(sorteo);

        // COMPLEMENTARIO
        int complementario;
        boolean repetido;
        do {
            complementario = random.nextInt(49) + 1;
            repetido = false;
            for (int i = 0; i < 6; i++) {
                if (sorteo[i] == complementario) {
                    repetido = true;
                }
            }
        } while (repetido);

        // REINTEGRO
        int reintegroSorteo = random.nextInt(10);

        // MOSTRAR SORTEO (solo para pruebas, quitar después)
        System.out.println("Números sorteados: " + Arrays.toString(sorteo));
        System.out.println("Complementario: " + complementario);
        System.out.println("Reintegro: " + reintegroSorteo);

        // BOLETO
        System.out.println("Introduce los datos de tu boleto: ");
        String boleto = teclado.next();

        if (!boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d")) {
            System.out.println("ERROR: formato no válido.");
            return;
        }

        String[] datosBoleto = boleto.split("[-/]");
        int[] numerosBoleto = new int[6];
        for (int i = 0; i < 6; i++) {
            numerosBoleto[i] = Integer.parseInt(datosBoleto[i]);
        }
        int reintegroBoleto = Integer.parseInt(datosBoleto[6]);

        System.out.println(Arrays.toString(datosBoleto));

        // COMPROBAR ACIERTOS
        int aciertos = 0;
        boolean tieneComplementario = false;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (numerosBoleto[i] == sorteo[j]) {
                    aciertos++;
                }
            }
            if (numerosBoleto[i] == complementario) {
                tieneComplementario = true;
            }
        }

        boolean tieneReintegro = (reintegroBoleto == reintegroSorteo);

        // RESULTADOS
        System.out.println("RESULTADOS:");
        if (aciertos == 6 && tieneReintegro) {
            System.out.println("Categoría Especial.");
        } else if (aciertos == 6) {
            System.out.println("1ª Categoría.");
        } else if (aciertos == 5 && tieneComplementario) {
            System.out.println("2ª Categoría.");
        } else if (aciertos == 5) {
            System.out.println("3ª Categoría.");
        } else if (aciertos == 4) {
            System.out.println("4ª Categoría.");
        } else if (aciertos == 3) {
            System.out.println("5ª Categoría.");
        } else {
            if (aciertos > 0) {
                System.out.println(aciertos + (aciertos == 1 ? " acierto." : " aciertos."));
            }
            if (tieneReintegro) {
                System.out.println("Reintegro.");
            }
            if (aciertos == 0 && !tieneReintegro) {
                System.out.println("No premiado.");
            }
        }
    }
}
