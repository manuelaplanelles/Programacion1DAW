package org.example.u06_herencia.SemaforoEnum;

import java.util.Random;
import java.util.Scanner;

public class NivelesApp {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Que dificultad vas a querer?");
        String nivel = teclado.next();

        Dificutad nivel1 = Dificutad.valueOf(nivel);
        int puntuacion =aleatorio.nextInt(4000)+1;
        System.out.println(puntuacion);

        //System.out.println(puntuacion*nivel.getMultiplicador());
    }
}
