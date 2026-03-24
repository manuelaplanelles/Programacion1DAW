package org.example.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {

    static HashMap<String, Double> mapa = new HashMap<>();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*** REGISTRO DE TEMPERATURAS ***");
        while (true){

            System.out.println("Elige una opcion [insertar, actualizar, consultar, ver todas, salir]: ");

            String opcion = teclado.next().toLowerCase();
            teclado.nextLine();
            switch (opcion){
                case "insertar":
                    insertar();
                    break;
                case "consultar":
                    consultar();
                    break;
                case "actualizar":
                    actualizar();
                    break;
                case "ver todas":
                    verTodas();
                    break;
                case "salir":
                    return;
                default:
                    System.out.println("No te entiendo.");
            }
            for (Map.Entry<String, Double> mapita:mapa.entrySet()){
                System.out.println("Ciudad: "+ mapita.getKey()+" , Temperatura: "+mapita.getValue());
            }

        }

    }
    public static void insertar(){
        System.out.println("Introduce los nuevos datos (siudad/temperatura): ");
        String datos[]= teclado.nextLine().split("/");
        mapa.put(datos[0],Double.valueOf(datos[1]));

    }
    public static void actualizar(){
        System.out.println("Introduce la ciudad a actualizar: ");
        String ciudad = teclado.nextLine();
        if (mapa.containsKey(ciudad)){
            System.out.println("Introuce la nueva temperatura: ");
            double temp = teclado.nextDouble();
            mapa.put(ciudad,temp);
        }else{
            System.out.println("La ciudad no existe. Actualizada");
        }
    }
    public static void consultar(){
        System.out.println("Que ciudad quieres consultar: ");

        String consulCiudad = teclado.nextLine();
        if (mapa.containsKey(consulCiudad)){
            System.out.println(mapa.get(consulCiudad));
        }else{
            System.out.println("La ciudad no existe.");
        }
    }
    public static void verTodas(){
        for (Map.Entry<String, Double> mapita:mapa.entrySet()){
            System.out.println("Ciudad: "+ mapita.getKey()+" , Temperatura: "+mapita.getValue());
        }
    }


}
