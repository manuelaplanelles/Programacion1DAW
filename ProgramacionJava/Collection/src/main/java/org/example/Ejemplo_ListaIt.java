package org.example;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ejemplo_ListaIt {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        /* EJemplo
        ArrayList<String> alumnos = new ArrayList<>(Arrays.asList("Juan", "Pepe","Paula"));
        ListIterator<String> it = alumnos.listIterator();
        while (it.hasNext()){
            System.out.println(it.nextIndex());
            String nombre = it.next();
            System.out.println(it.nextIndex());
            System.out.println(nombre);
        }
        while (it.hasPrevious()){
            System.out.println(it.previousIndex());
            String nombre = it.previous();
            System.out.println(it.previousIndex());
            System.out.println(nombre);
        }*/

        //Ejercicio
        String palabra= teclado.nextLine();
        ArrayList<Character> lista = new ArrayList<>();
        ListIterator<Character> it = lista.listIterator();

        for (Character caracter : palabra.toCharArray()){
            switch (caracter){
                case '<':
                    if(it.hasPrevious()){
                        it.previous();
                    }
                    break;
                case '>':
                    if(it.hasNext()){
                        it.next();
                    }
                    break;
                case '#':
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
    }
}
