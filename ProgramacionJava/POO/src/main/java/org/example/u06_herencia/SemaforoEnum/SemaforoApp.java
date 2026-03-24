package org.example.u06_herencia.SemaforoEnum;

import java.util.Random;
import java.util.Scanner;

public class SemaforoApp {
    public static void main(String[] args) {
        Semaforo inicio = Semaforo.AMARILLO;




        for(int i = 0; i < 10; i++){
            inicio = Semaforo.siguiente(inicio);
            System.out.println(inicio);
        }
    }
}

