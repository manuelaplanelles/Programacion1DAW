package org.example.vista_papa;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class VaticanoApp {
    static Collection<Peregrino> registrados = new HashSet<>();
    static Collection<Peregrino> fila = new LinkedList<>();

    static void main() {
        registrados.add( new Nacional(0, "Pepe", EstadoPeregrino.SOLICITUD_OK, "Alicante"));
        registrados.add( new Nacional(1, "Lucia", EstadoPeregrino.SOLICITUD_OK, "Castellon"));
        registrados.add( new Extranjero(2, "Lean", EstadoPeregrino.SOLICITUD_OK, "Italia"));
        registrados.add( new Extranjero(3, "Dolo", EstadoPeregrino.SOLICITUD_OK, "Francia"));
        registrados.add( new Extranjero(4, "Kevin", EstadoPeregrino.SOLICITUD_OK, "Irlanda"));

        for(Peregrino peregrino : registrados){
            System.out.println(peregrino);
        }
    }
    public static void llegadaPeregrino(){

    }
    public static Peregrino buscarPeregrino(Integer id){
        return null;
    }
    public static void bendicionPapal(){

    }

}

