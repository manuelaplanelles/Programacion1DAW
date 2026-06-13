package org.example.SimulacroAbril26.votaciones;

import java.util.*;

public class EleccionesApp {
    static Scanner teclado = new Scanner(System.in);
    static double [][] matriz = new double[2][4];
    static Collection<Votante> yaHanVotado = new HashSet<>();
    static Map<String,Integer> votosPorPueblo = new TreeMap<>();    //xq va ordenando alfaveticamente por población

    public static void main(String[] args) {

//        System.out.println("**** ELECCIONES APP ****");
//        System.out.println("Introduce la población: ");
//        String poblacion = teclado.nextLine();
//        System.out.println("Empieza la votacion en "+poblacion);
//
//        while (true){
//            try {
//                System.out.println("Introduce el tipo de documento a validar [DNI, NIE] ó SALIR para finalizar la votación: ");
//                String tipoDoc = teclado.nextLine().toUpperCase();
//
//                if(tipoDoc.equals("SALIR"){
//                   recuento();
//                   break;
//                } else if (tipoDoc.equals("DNI")||tipoDoc.equals("NIE")){
//                    System.out.println("Introduce el número del DNI/NIE que has presentado: ");
//                    String numero = teclado.nextLine();
//                    if (validarDocumento(numero)){
//                }else {
//                        System.out.println("El DNI/NIE no es correcto");
//                    }
////            }catch (FraudeException e){
////                System.out.println(e.getMessage());
////            }
//        }
//
//    }
//    public static boolean validarDocumento(String documento){               //pide doc y valida 8num y 1 letra .match()
//
//
//
//
//    }
//
//    public static Votante verificarEmpadronamiento(Votante votante){                    //busca en el censo for-each
//        return votante;
//    }
//    public static boolean comprobarFraude(Votante votante){                             //si ya voto excepcion if + throw
//
//        return  true;
//    }
//    public static void contabilizarDatosEncuesta( int opcion){              //suma acceso a matriz
//
//    }
//    public static void recuento(){                                          //votar si o no datos por poblacion,.. treemap y matriz
//
//    }
    }
}
