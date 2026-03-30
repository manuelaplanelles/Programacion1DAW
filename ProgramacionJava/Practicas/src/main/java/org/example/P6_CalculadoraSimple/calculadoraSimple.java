package org.example.P6_CalculadoraSimple;

import java.util.Scanner;

public class calculadoraSimple {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String operacion ;
        System.out.println("*** BIENVENIDO A LA CALCULADORA RAPIDA ***");
        do{
            System.out.println("Introduce el operador: ");
            int operador1 = teclado.nextInt();
            System.out.println("----------------------------");
            System.out.println("[+] -> sumar");
            System.out.println("[-] -> resta");
            System.out.println("[X] -> multiplicar");
            System.out.println("[/] -> dividir");
            System.out.println("[R] -> raíz cuadrada");
            System.out.println("[Salir]");
            System.out.println("----------------------------");
            System.out.println("Introduce el operador: ");
            operacion = teclado.next().toUpperCase();

            int operador2 = 0;
            if(!operacion.equals("R") && !operacion.equals("SALIR")){
                System.out.println("Introduce el segundo operador: ");
                operador2= teclado.nextInt();
            }

            switch (operacion){
                case "+":
                    int suma = operador1+operador2;
                    System.out.println("El resultado de "+operador1+" + "+operador2+" es "+suma);
                    break;
                case "-":
                    int resta = operador1-operador2;
                    System.out.println("El resultado de "+operador1+" - "+operador2+" es "+resta);
                    break;
                case "X":
                    int multi = operador1*operador2;
                    System.out.println("El resultado de "+operador1+" x "+operador2+" es "+multi);
                    break;
                case "/":

                    if (operador2==0) {
                        System.out.println("ERROR, no se puede dividir entre 0");
                    }else {
                        int divi = operador1 / operador2;
                        System.out.println("El resultado de " + operador1 + " / " + operador2 + " es " + divi);
                    }
                    break;
                case "R":
                    double resul = Math.sqrt(operador1);
                    System.out.println("El resultado de la raiz cuadrada de " + operador1 + " es " + resul);
                    break;
                case "SALIR":
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("ERROR, la operación no es valido");
                    break;
            }
        }while (!operacion.equals("SALIR"));
    }
}
