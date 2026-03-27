package org.example.LambdaStrams;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class Prueba_streams {
    public static void main(String[] args) {
        Stream<String>pruebaStream = Stream.of("Gatos","Leon", "Tigre", "Guepardo")
                .filter(felino -> felino.endsWith("s"))
                .filter(felinos -> felinos.contains("e"))
                .map(String::toUpperCase);
                       // .anyMatch(felinos -> felinos.equals("Leones"));

           //     .count();


        //List<String>felinos= pruebaStream.toList();
        System.out.println(pruebaStream);
    }
}
