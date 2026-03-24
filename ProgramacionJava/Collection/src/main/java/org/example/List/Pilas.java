package org.example.List;

import java.util.Scanner;
import java.util.Stack;

public class Pilas {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //Ejercio 1
        Stack<Character> pila1 = new Stack<>();
        pila1.push('a');
        pila1.push('b');
        pila1.push('c');
        pila1.push('d');
        pila1.push('e');
        System.out.println("¿Esta vacia?"+pila1.isEmpty());
        System.out.println();
        System.out.println("Tamaño: "+pila1.size());
        System.out.println();
        System.out.println("¿Que hay en la ultima posición? "+pila1.peek());
        System.out.println();
        while (!pila1.isEmpty()){
            System.out.println("Eliminada: "+pila1.pop());
        }
        System.out.println();
        System.out.println("¿Esta vacia?"+pila1.isEmpty());


        //Ejercicio 2
        Stack<Integer> pila2 = new Stack<>();
        System.out.println("Introduce el primer numero: ");
        pila2.push(teclado.nextInt());
        System.out.println("Introduce el segundo numero: ");
        pila2.push(teclado.nextInt());
        System.out.println("Introduce el tercer numero: ");
        pila2.push(teclado.nextInt());
        System.out.println();
        System.out.println("Numero de orden inverso: ");
        while (!pila2.isEmpty()){
            System.out.print(pila2.pop()+" ");
        }
        //Ejercicio3
        String expresion = "((2+3)*(5-1)";
        if(esBalanceado(expresion)){
            System.out.println("La expresion esta correcta.");
        }else{
            System.out.println("La expresion no es correcta.");
        }
    }
    public static boolean esBalanceado(String expresion) {
        Stack<Character> pila3 = new Stack<>();

        for(int i = 0; i<expresion.length();i++){
            if(expresion.charAt(i)=='('){
                pila3.push(expresion.charAt(i));
            } else if (expresion.charAt(i) == ')') {
                if (pila3.isEmpty()){
                    return false;
                } else {
                    pila3.pop();
                }
            }
        }
        if(pila3.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
