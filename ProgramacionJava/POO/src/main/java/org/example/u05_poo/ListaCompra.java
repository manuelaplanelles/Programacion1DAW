package org.example.u05_poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListaCompra {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        ArrayList<String> listaCompra = new ArrayList<>();
        System.out.println("Lista: " + listaCompra.size());  // Crear lista y verificar que esta vacia

        listaCompra.add("sal");
        System.out.println("Lista: " + listaCompra.size()); //añadir elemento y verificar de nuevo

        listaCompra.addAll(Arrays.asList("pan","agua","aceite","jamón","tomate")); //añade 5 elementos mas

        System.out.println(listaCompra); //muestra el contenido

        System.out.println(listaCompra.get(3)); //mostrar el tercer elemento

        listaCompra.set(1, "queso"); //cambia el segundo elemento de la lista por queso
        System.out.println(listaCompra);

        //comprobar si un producto específico "leche" esta en la lista
        if (listaCompra.equals("Leche")){
            System.out.println("Leche esta en la lista");
        }else{
            System.out.println("No hay Leche en la lista");
        }

        /*
        Implementa un control para que antes de añadir un nuevo elemento (add) se verifique si ya existe en la lista
        para evitar duplicados. Haz lo mismo para cuando se modifique un elemento (set).
        */

        System.out.println("Añade un alimento a la lista: ");
        String alimento1 = teclado.next();

        if (listaCompra.equals(alimento1)){
            System.out.println(alimento1 + " ya esta en la lista.");
        }else{
            listaCompra.add(alimento1);
        }

        //Muestra el número de elementos en la lista. Clona la lista actual.
        System.out.println("En la lista hay: "+ listaCompra.clone() + " " + listaCompra.size() + " productos en total.");
        ArrayList<String> copia = new ArrayList<>(listaCompra);

        //Limpia la lista clonada y verifica que está vacía.
        listaCompra.clear();
        System.out.println("Esta vacia?:" + listaCompra.isEmpty());


    }
}
