package org.example;

public class recursividad1 {
    public static void tri(int contB, int contA, int n) {

        if (contB < contA) {
            System.out.print("* ");
            tri(contB + 1, contA, n);
        } else {
            System.out.println();
            if (contA < n) {
                tri(0, contA + 1, n);
            }
        }
    }

    public static void main(String[] args) {
        int altura = 3;
        tri(0, 0, altura);
    }
}
