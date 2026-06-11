package org.example.App;

import java.util.ArrayList;
import java.util.List;

public class App {
    static List<Elemento> elementos = new ArrayList<>();

    public static void main(String[] args) {
        elementos.add(new ElementoTipoA("E1","uno", Estado.PENDIENTE, "extra"));
        elementos.add(new ElementoTipoB("E2", "dos", Estado.ACTIVO, 10));

        for (Elemento elemento : elementos){
            elemento.mostrar();
        }
    }
}
