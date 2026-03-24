package org.example.Set;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class Ejercicio3_Conjuntos {
    public static void main(String[] args) {

        Set<String> historial = new LinkedHashSet<>();
        Scanner teclado = new Scanner(System.in);
        String url = "";

        while (!url.equals("salir")) {
            System.out.print("Escribe una URL visitada (o 'salir' para terminar): ");
            url = teclado.nextLine();

            if (!url.equals("salir")) {
                historial.add(url);
            }
        }

        System.out.println("Historial de navegación:");
        int posicion = 1;
        for (String pagina : historial) {
            System.out.println(posicion + ". " + pagina);
            posicion++;
        }
    }
}

