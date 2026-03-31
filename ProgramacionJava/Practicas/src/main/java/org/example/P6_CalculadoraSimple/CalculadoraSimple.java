package org.example.P6_CalculadoraSimple;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String operacion = "";
        
        System.out.println("*** BIENVENIDO A LA CALCULADORA RÁPIDA ***");
        
        do{
            try{    
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

            switch (operacion){
                case "+":
                    System.out.println("Introduce el segundo operando: ");
                    int operador2 = teclado.nextInt();
                    System.out.println("El resultado de " + operador1 + " + " + operador2 + " es " + (operador1 + operador2));
                    break;
                case "-":
                    System.out.println("Introduce el segundo operando: ");
                    int operador3 = teclado.nextInt();
                    System.out.println("El resultado de " + operador1 + " - " + operador3 + " es " + (operador1 - operador3));
                    break;
                case "X":
                    System.out.println("Introduce el segundo operando: ");
                    int operador4 = teclado.nextInt();
                    System.out.println("El resultado de " + operador1 + " x " + operador4 + " es " + (operador1 * operador4));
                    break;
                case "/":
                    System.out.println("Introduce el segundo operando: ");
                    int operador5 = teclado.nextInt();
                    if (operador5 == 0) {
                        System.out.println("ERROR, no se puede dividir entre 0");
                    } else {
                        double divi = (double) operador1 / operador5;
                        System.out.println("El resultado de " + operador1 + " / " + operador5 + " es " + divi);
                    }
                    break;
                case "R":
                    double resul = Math.sqrt(operador1);
                    System.out.println("La raíz cuadrada de " + operador1 + " es " + resul);
                    break;
                case "SALIR":
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("ERROR, la operación no es valido");
                    break;
            }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número.");
                teclado.next();
            }
        }while (!operacion.equals("SALIR"));
        
    }
}
