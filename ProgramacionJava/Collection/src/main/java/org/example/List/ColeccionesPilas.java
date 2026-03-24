package org.example.List;

import java.util.ArrayList;
import java.util.Stack;

public class ColeccionesPilas {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>(); //lista

        //Ejercicio1 --- con las pilas si estan vacias dara error al hacer peek() o pop(), tamien da error con el for ech porque no sigue un orden.
        Stack<Character> letras = new Stack<>();
        letras.push('h');
        letras.push('g');
        letras.push('f');
        letras.push('s');
        letras.push('a');
        System.out.println(letras.isEmpty()); //false
        System.out.println(letras.size()); //5
        System.out.println(letras.peek()); //a
        System.out.println(letras.pop());

        System.out.println(letras.size());

        //Ejercicio2
        Stack<Integer> pila = new Stack<>();
        pila.push(4);
        pila.push(8);
        pila.push(3);

        /*
        for (int i = 0; i< pila.size(); i++){ // Error = prohibit
            System.out.println(pila.pop());
        }

        for(Integer mum : pila){  // Error = prohibit
            System.out.println(pila.pop());
        }
         */

        while (!pila.isEmpty()) { // porque no sabes si cuantas vueltas van a ser
            System.out.println(pila.pop());
        }

        //Ejercicio3
        String expresion = "((2+3)*(5-1))";
        if (esBalanceado(expresion)) {
            System.out.println("BIEN");
        } else {
            System.out.println("MAL");
        }
    }

    public static boolean esBalanceado(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {

            if (expresion.charAt(i) == ('(')) {
                pila.push(expresion.charAt(i));
            } else if (expresion.charAt(i) == ')') {
                if (pila.contains(')')) {
                    pila.pop();
                } else {
                    return false;
                }
            }
            if (pila.isEmpty()) {
                return true;
            } else {
                return false;
            }

        }
        return true;
    }
}
