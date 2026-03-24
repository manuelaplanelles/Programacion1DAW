package org.example.Set;

import java.util.*;

public class ColeccionesConjunto {
    public static void main(String[] args) {

        String peces[] ={"boqueron","sardinas", "anchoas","anchoas", "tiburon", "merluza","merluza", " anguila"};

        HashSet<String>desordenado = new HashSet<>(Arrays.asList(peces));
        LinkedHashSet<String>respeta_orden= new LinkedHashSet<>(Arrays.asList(peces));
        TreeSet<String>ordenado=new TreeSet<>(Arrays.asList(peces));

        System.out.println(desordenado);
        System.out.println(respeta_orden);
        System.out.println(ordenado);

        //ejercicio1.
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine().toLowerCase();

        String frase1 []=frase.split(" ");
        HashSet<String>fraseSinDuplicado = new HashSet<>(Arrays.asList(frase1));
        System.out.println(frase);
        System.out.println(fraseSinDuplicado);

        //ejercicio2


    }
}
