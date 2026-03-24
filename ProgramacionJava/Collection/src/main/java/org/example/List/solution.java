package org.example.List;

import java.util.Stack;

public class solution {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            Stack<Character> pila3 = new Stack<>();
            String expresion = in.nextLine();

            for (int i = 0; i < expresion.length(); i++) {
                if (expresion.charAt(i) == '(' || expresion.charAt(i) == '{' || expresion.charAt(i) == '[') {
                    pila3.push(expresion.charAt(i));
                } else if (expresion.charAt(i) == ')' || expresion.charAt(i) == '}' || expresion.charAt(i) == ']') {
                    if (pila3.isEmpty()) {
                        System.out.println("NO");
                        return true;
                    } else if (expresion.charAt(i) == ')' && pila3.peek() != '(') {
                        System.out.println("NO");
                        return true;
                    } else if (expresion.charAt(i) == '}' && pila3.peek() != '{') {
                        System.out.println("NO");
                        return true;
                    } else if (expresion.charAt(i) == ']' && pila3.peek() != '[') {
                        System.out.println("NO");
                        return true;
                    } else {
                        pila3.pop();
                    }
                }
            }

            if (pila3.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
