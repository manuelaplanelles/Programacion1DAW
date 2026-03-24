package org.example;

public class Recursividad {

        static int limite = 10;
        static String frase = "Hola soy una frase al reves";
        static char[] frase_char = frase.toCharArray();

        static void main() {

            System.gc(); //Limpia lo que pueda antes de medir

            long inicioEjecucion = System.nanoTime();
            long memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

            // PROGRAMA A REALIZAR
            imprimir(1);

            long finEjecucion = System.nanoTime();
            long memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

            System.out.println("Tiempo recursivo: " + (finEjecucion - inicioEjecucion) + " ns");
            System.out.println("Memoria consumida recursivo: " + (memoriaDespues - memoriaAntes) + " bytes");

            inicioEjecucion = System.nanoTime();
            memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

            // PROGRAMA A REALIZAR
            imprimir_bucle();

            finEjecucion = System.nanoTime();
            memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

            System.out.println("Tiempo: " + (finEjecucion - inicioEjecucion) + " ns");
            System.out.println("Memoria consumida: " + (memoriaDespues - memoriaAntes) + " bytes");

            //   System.out.println(suma(10));

            System.out.println(digitos(537473));

            System.out.println(potencia(2,4));

            del_reves(38472);

            System.out.println();

            del_reves_char(frase_char.length-1);

            System.out.println();

            del_reves_char_sin_vector(frase.length()-1);

            System.out.println();
            System.out.println(esBinario(5454));

            System.out.println(aBinario(4));

        }

        public static void imprimir (int num){

            if (num <= limite){
                System.out.println(num);
                imprimir(num+1);
            }

        }

        public static void imprimir_bucle(){

            for (int i = 1; i <= 10000; i++) {
                System.out.println(i);
            }

        }

        public static int suma (int nums){

            if (nums==0){
                return 0;
            }else{
                return nums + suma(nums-1);
            }

        }

        public static int digitos (int numero){

            if (numero < 10){
                return 1;
            }else{
                return 1+digitos(numero/10);
            }

        }

        public static int potencia (int base, int exponente){

            if (exponente == 0){
                return 1;
            }else{
                return base*potencia(base,exponente-1);
            }

        }

        public static void del_reves(int numero){

            if (numero < 10){
                System.out.print(numero);
            }else{
                System.out.print(numero%10);
                del_reves(numero/10);
            }

        }

        public static void del_reves_char(int posicion){

            if (posicion>=0){
                System.out.print(frase_char[posicion]);
                del_reves_char(posicion-1);
            }

        }

        public static void del_reves_char_sin_vector(int posicion){

            if (posicion>=0){
                System.out.print(frase.charAt(posicion));
                del_reves_char(posicion-1);
            }

        }

        public static boolean esBinario (int numero){

            if (numero > 9){
                if (numero % 10 != 0 && numero % 10 != 1){
                    return false;
                }else{
                    return esBinario(numero/10);
                }
            }else{
                if (numero == 0 || numero == 1){
                    return true;
                }else{
                    return false;
                }
            }

        }

        public static String aBinario (int numero){

            if (numero == 0 || numero == 1){
                return Integer.toString(numero);
            }else{
                return aBinario(numero/2)+numero%2;
            }

        }

    }