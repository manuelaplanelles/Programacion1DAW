package org.example.SimulacroMayo26.huelga;

import java.util.Scanner;

public class AppHuelga {
    static CentroEducativo centro= new CentroEducativo("IES MUTXAMEL", 100, 150.95);
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        centro.generarHuelguistasAleatorios();
        centro.mostrarHuelguistasActuales();
        verSeguimiento();
        Docente encontrado = validacion();
        System.out.println(encontrado);
    }
    static void verSeguimiento(){
       if(centro.getHuelguistas().size()== centro.getPlantillaTotal()){
           System.out.println("HUELGA TOTAL.");
       }else {
           int trabajando = centro.getPlantillaTotal()-centro.getHuelguistas().size();
           System.out.println("HUELGA PARCIAL ("+trabajando+" docentes trabajando)");
       }

    }
    static Docente validacion(){
        System.out.println("Introduce el DNI del docente: ");
        String dniDocente= teclado.next();
        for (Docente docente : centro.getHuelguistas()) {
            if (docente.getDni().equals(dniDocente)) {
                return docente; }
        }
        return null;
    }
    static void insertarHuelguista(){}
    static void calcularDescuentoSalarial(){}
    static void abandonarHuelga(){}
    static void listaConselleria(){}
    static void generarEstadisticas(){}


}
