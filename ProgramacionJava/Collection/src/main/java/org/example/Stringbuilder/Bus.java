package org.example.Stringbuilder;

import java.util.Random;

public class Bus {

    public static final int TAM = 97;

    public static void main(String[] args) throws InterruptedException {        //excepcion que no podemos controlar como un apagon

        Random random = new Random();

        int a = 0; // POSICIÓN INICIAL DEL AUTOBÚS
        int b = 0;


        System.out.println("\n<<<<<<<<<< AUTOBUSITO >>>>>>>>>>");
        Thread.sleep(3000);

        while (a < TAM && b < TAM) {

            int movimiento = random.nextInt(2);
            if(movimiento==1){
                a++;
            }else{
                b++;
            }

            limpiarPantalla();
            System.out.println(dibujarCarrera(a, b));
            Thread.sleep(70);

        }
        if(a>=TAM){
            System.out.println("GANADOR --> IES MUTXAMEL");
        }else{
            System.out.println("GANADOR --> IES SAN VICENTE");
        }

        System.out.println("\033[32m" + "EL AUTOBUSITO HA LLEGADO A SU DESTINO!!" + "\033[0m");

    }

    public static String dibujarCarrera(int n1, int n2) {

        StringBuilder sb = new StringBuilder();

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("________________    ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|   IES MUTXAMEL  |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append("_".repeat(117)).append("\n");


        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n2)).append("________________    ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("| IES SAN VICENTE |)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append("_".repeat(117));

        return sb.toString();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}

