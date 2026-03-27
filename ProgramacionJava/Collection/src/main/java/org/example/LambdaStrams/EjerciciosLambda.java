package org.example.LambdaStrams;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosLambda {
    public static void main(String[] args) {

        //ejercicio1
        Ejecutor lambda = (numero) -> {
            return numero > 10;
        };

        System.out.println("Comparando para 15: ");
        System.out.println(lambda.ejecutar(15));

        System.out.println("Comparando para 5: ");
        System.out.println(lambda.ejecutar(5));

        //ejecicio2

        VerificadorVoto verificador = (nombre, edad) -> edad >= 18;

        System.out.println("Probando Maria con 14 años... " + verificador.puedeVotar("Maria", 14));

        //ejercicio3
        String nombre;
        double precio;
        String categoria;
        List<FiltroProducto> productos = new ArrayList<>();



    }
}