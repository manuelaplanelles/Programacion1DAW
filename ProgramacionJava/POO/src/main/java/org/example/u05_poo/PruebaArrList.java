package org.example.u05_poo;

import java.util.ArrayList;
import java.util.Arrays;

public class PruebaArrList {
    static void main() {
        ArrayList<String> listaPartesCoches = new ArrayList<>();
        System.out.println("Elementos insertados: " + listaPartesCoches.size());

        listaPartesCoches.add("puerta");
        listaPartesCoches.add("polea");
        listaPartesCoches.add("piston");
        listaPartesCoches.add("alternador");

        System.out.println("Elementos insertados: " + listaPartesCoches.size());

        listaPartesCoches.add(3,"tubo escape"); //para añadir uno nuevo
        System.out.println(listaPartesCoches);

        listaPartesCoches.remove("puerta"); //para borrar por valor
        System.out.println(listaPartesCoches);

        listaPartesCoches.remove(1); //para borrar por posición
        System.out.println(listaPartesCoches);

        System.out.println("Posición de altermador en la lista: " + listaPartesCoches.indexOf("alternador"));
        System.out.println("Posición de puerta en la lista: " + listaPartesCoches.indexOf("puerta"));

        for(String parte : listaPartesCoches){
            System.out.println("Parte: " + parte);
        }
        for(int i =0; i<listaPartesCoches.size();i++){
            System.out.println("Parte: " + i + ": " + listaPartesCoches.get(i));
        }

        listaPartesCoches.set(0, "carter"); // para añadir en una posición
        System.out.println(listaPartesCoches);

        listaPartesCoches.clone(); //solo en caso de necesitar un objeto object
        ArrayList<String> copia = new ArrayList<>(listaPartesCoches);

        System.out.println("La lista contiene puerta?:" + listaPartesCoches.contains("puerta"));
        System.out.println("La lista contiene alternador?:" + listaPartesCoches.contains("alternador"));

        System.out.println("Esta vacia?:" + listaPartesCoches.isEmpty());

        listaPartesCoches.clear();

        System.out.println("Está vaciá?: " + listaPartesCoches.isEmpty());
        listaPartesCoches.addAll(Arrays.asList("rueda","freno", "radiador"));

        System.out.println(listaPartesCoches);
    }
}
