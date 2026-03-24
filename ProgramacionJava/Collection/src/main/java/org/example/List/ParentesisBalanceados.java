package org.example.List;

import java.util.Arrays;
import java.util.Stack;

public class ParentesisBalanceados {

    static java.util.Scanner in;

    public static Character[] operadores = {'(','{','['};
    public static Character[] operadores_cerrados = {')','}',']'};

    public static boolean casoDePrueba() {

        if (!in.hasNext())
            return false;
        else {

            Stack<Character> pila = new Stack<>();
            String expresion = in.nextLine();

            for (int i = 0; i < expresion.length(); i++) {

                if (Arrays.asList(operadores).contains(expresion.charAt(i))){
                    pila.push(expresion.charAt(i));
                } else if (Arrays.asList(operadores_cerrados).contains(expresion.charAt(i))) {

                    int op = Arrays.asList(operadores_cerrados).indexOf(expresion.charAt(i));

                    if (pila.contains(operadores[op]) && pila.peek()==operadores[op]){
                        pila.pop();
                    }else{
                        System.out.println("NO");
                        return true;
                    }

                }

            }

            if (pila.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            return true;

        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

}

