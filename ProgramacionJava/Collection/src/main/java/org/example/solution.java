package org.example;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;


// Asume fichero llamado solution.java
    public class solution {
        static Scanner teclado = new Scanner(System.in);
        static Scanner in;
        static String palabra= teclado.nextLine();
        public static boolean casoDePrueba() {
            if (!in.hasNext())
                return false;
            else {
                ArrayList<Character> lista = new ArrayList<>();
                ListIterator<Character> it = lista.listIterator();

                for (Character caracter : palabra.toCharArray()){
                    switch (caracter){
                        case '-':
                            if(it.hasPrevious()){
                                it.previous();
                            }
                            break;
                        case '+':
                            if(it.hasNext()){
                                it.next();
                            }
                            break;
                        case '*':
                            if(it.hasPrevious()){
                                it.previous();
                                it.remove();
                            }
                            break;
                        default:
                            it.add(caracter);
                    }
                }
                for(Character caracter : lista){
                    System.out.println(caracter);
                }
                return true;
            }
        } // casoDePrueba

        public static void main(String[] args) {
            in = new Scanner(System.in);
            while (casoDePrueba()) {
            }
        } // main

    } // class solution
