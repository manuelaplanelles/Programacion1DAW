package org.example.Maps;

import java.util.Scanner;

public class HasMap<S, I extends Number> {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*HashMap<Integer,String>mapa = new HashMap<>();
        mapa.put(1,"España");
        mapa.put(2,"Senegal");
        mapa.put(3, "Marruecos");
        mapa.put(4, "EEUU");

        System.out.println(mapa.keySet());
        System.out.println(mapa.values()); //para mostrar la lista

        mapa.put(100, "Israel");
        System.out.println(mapa.values());
        for(Map.Entry<Integer,String> mapita : mapa.entrySet()){//estructura para coger la estructura completa clave como valor.
        System.out.println("#"+mapita.getKey()+": "+mapita.getValue());

         */

        /*ejercicio1
        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine().toLowerCase();

        HashMap<String, Integer> mapa = new HashMap<>();

        for (String palabra : frase.split(" ")) {
            if (mapa.containsKey(palabra)) {
                mapa.put(palabra, mapa.get(palabra) + 1);
            } else {
                mapa.put(palabra, 1);
            }
        }

        for (Map.Entry<String, Integer> mapita : mapa.entrySet()) {
            System.out.println(mapita.getKey() + ": " + mapita.getValue());
        }

            /*ejercicio2
            System.out.println("Introduce una palabra: ");
            String frase = teclado.nextLine().toLowerCase();

            HashMap<Character, Integer> mapa2 = new HashMap<>();

            for (char c : frase.toCharArray()) {
                if (mapa2.containsKey(c)) {
                    mapa2.put(c, mapa2.get(c) + 1);
                } else {
                    mapa2.put(c, 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : mapa2.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

             */


    }
}