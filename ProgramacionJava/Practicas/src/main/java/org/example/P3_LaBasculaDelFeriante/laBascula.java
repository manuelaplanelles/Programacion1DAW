package org.example.P3_LaBasculaDelFeriante;
import java.util.Scanner;

public class laBascula {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
           System.out.println("*** BIENVENIDO AL RATÓN JUGUETÓN ***");
           System.out.println("Leyendo altura (cm)...");
           int altura = teclado.nextInt();
           if (altura < 0 || altura > 230) {
               System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR…");
           } else {
               if (altura < 140) {
                   int restAltura = 140 - altura;
                   System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan " + restAltura + "cm de altura.");
               } else {
                   double pesoMin = (altura * 2.0) / 8.0;
                   int pesoMax = 120;
                   System.out.println("Leyendo peso (kg)...");
                   int peso = teclado.nextInt();
                   if (peso > pesoMax) {
                       int pesoRest = peso - pesoMax;
                       System.out.println("LO SIENTO. Sobrepasas " + pesoRest + "kg el límite de la atracción");
                   }else if (peso < pesoMin) {
                       double pesoRest = pesoMin - peso;
                       System.out.println("LO SIENTO. No llegas al peso minimo " + pesoRest + "kg el límite de la atracción");
                   }else {
                       System.out.printf("Pesas " + peso + "kg. Peso mínimo calculado: " + pesoMin + "kg.");
                       System.out.println("¡¡SUBE A LA ATRACCIÓN!!");
                   }
               }
           }
    }
}

