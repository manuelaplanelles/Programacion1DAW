package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ParentesisBalanceo {
    public class solution {

        static java.util.Scanner in;

        public static boolean casoDePrueba() {

            if (!in.hasNext())
                return false;
            else {

                ArrayList<Character> lista_abierta = new ArrayList<>(Arrays.asList('(','{','['));
                ArrayList<Character> lista_cerrada = new ArrayList<>(Arrays.asList(')','}',']'));
                String expresion = in.nextLine();

                Stack<Character> pila = new Stack<>();
                for(int i = 0; i < expresion.length();i++){
                        if (lista_abierta.contains(expresion.charAt(i))){
                            pila.push(expresion.charAt(i));
                        } else if (lista_cerrada.contains(expresion.charAt(i))){
                            int pos = lista_cerrada.indexOf(expresion.charAt(i));
                            if (pila.contains(lista_abierta.get(pos)) && pila.peek()==lista_abierta.get(pos)) {
                                pila.pop();
                            } else {
                                System.out.println("NO");
                            }
                        }

                }
                if (pila.isEmpty()) {
                    System.out.println("YES");;
                } else {
                    System.out.println("NO");
                }

            }
            return true;
        }

        public static void main(String[] args) {
            in = new java.util.Scanner(System.in);
            while (casoDePrueba()) {
            }
        }

    }

}
