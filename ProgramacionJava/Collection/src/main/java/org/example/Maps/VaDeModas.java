package org.example.Maps;
import java.util.HashMap;
import java.util.Map;

public class VaDeModas {
    static java.util.Scanner in;
    public static boolean casoDePrueba() {
        int num = in.nextInt();
        if (num == 0) {
            return false;
        } else {
            HashMap<Integer, Integer> mapa = new HashMap<>();
            for (int i = 0; i < num; i++) {
                int numero = in.nextInt();
                if (mapa.containsKey(numero)) {
                    mapa.put(numero, mapa.get(numero) + 1);
                } else {
                    mapa.put(numero, 1);
                }
            }
            int clave = 0;
            int maxVeces = 0;
            for (Map.Entry<Integer, Integer> mapita : mapa.entrySet()) {
                if (mapita.getValue() > maxVeces) {
                    maxVeces = mapita.getValue();
                    clave = mapita.getKey();
                }

            }
            System.out.println(clave);
            return true;
        }
    }
    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
