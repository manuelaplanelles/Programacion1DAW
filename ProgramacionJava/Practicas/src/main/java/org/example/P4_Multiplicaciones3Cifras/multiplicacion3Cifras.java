package org.example.P4_Multiplicaciones3Cifras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class multiplicacion3Cifras {


    public static void main(String[] args) {

        menu();

    }
    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;

        try{
            System.out.println("Introduce el multiplicando (3cifras): ");
            num1 = teclado.nextInt();
            validarNumero(num1);
        }catch (InputMismatchException e){
            System.out.println("Error: debe introducir un número entero.");
            teclado.next();
        }
        try{
            System.out.println("Introduce el multiplicador (3cifras): ");
            num2 = teclado.nextInt();
            validarNumero(num2);
        }catch (InputMismatchException e){
            System.out.println("Error: debe introducir un número entero.");
            teclado.next();
        }
        System.out.println("El producto de la multiplicación es: " + multiplicacion( num1, num2));
        proceso(num1,num2);
        System.out.println("_____");
        multiplicacion(num1,num2);
        System.out.println(multiplicacion(num1,num2));
    }

    public static void validarNumero(int num1){
        boolean repetir = true;
        if(num1<0){
            System.out.println("No se permiten numeros negativos");
        }else if(num1<100 || num1>999){
            System.out.println("Debe tener exactamente 3 cifras (entre 100 y 999).");
        }else{
            repetir = false;
        }
    }
    public static int multiplicacion(int num1, int num2){
        int resultado = num1*num2;
        return resultado;
    }
    public static void proceso(int num1, int num2){

        String numI = Integer.toString(num2);
        String numI_3 = numI.substring(2,3);
        int num_3 = Integer.parseInt(numI_3);

        System.out.println("El proceso es: ");
        System.out.println("  " + num1);
        System.out.println("x " + num2);
        System.out.println("_____");
        System.out.println("  " + num1*num_3);

        String numC = Integer.toString(num2);
        String numC_2 = numC.substring(1,2);
        int num_2 = Integer.parseInt(numC_2);

        System.out.println(num1*num_2 + "x");

        String numD = Integer.toString(num2);
        String numD_1 = numD.substring(0,1);
        int num_1 = Integer.parseInt(numD_1);

        System.out.println(num1*num_1 + "xx");

    }
}
