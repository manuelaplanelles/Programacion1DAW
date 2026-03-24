package org.example.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ColeccionesColas {
    public static void main(String[] args) {
        /* Explicación
        //en caso de las colas si esta vacia devolvera null y no mostrara excepción.
        Deque<String> cola = new LinkedList<>();  // Se ha probado con quene, deque
        cola.offer("Manolito");
        cola.offer("Pocoyo");
        cola.offer("Bart Simpson");
        cola.offer("Stewie");
        cola.poll(); //se elimina a "Manolito"
        System.out.println(cola.peek()); //muestra el primero
        cola.offerFirst("Kavin Mc Calister"); //Se mete delante
        System.out.println(cola.peek());
        cola.pollLast();
        System.out.println(cola.peekLast());
        LinkedBlockingQueue<String> cola_limitada=new LinkedBlockingQueue<>(3); // se indica cuanto puedes almacenar
        cola_limitada.offer("Manolito");
        cola_limitada.offer("Juanito");
        cola_limitada.offer("Jaimito");
        cola_limitada.offer("Joselito"); //si se limita el tamaño y se añade mas, no da error pero no lo guarda
        System.out.println(cola_limitada);

         */

        //ejercicio2
        Queue<String> cola_impresion = new LinkedList<>(); //porque indica que el primero que sale es el primero que entra
        cola_impresion.offer("Imprimir documento1");
        cola_impresion.offer("Imprimir documento2");
        cola_impresion.offer("Imprimir documento3");
        cola_impresion.offer("Imprimir documento4");
        cola_impresion.offer("Imprimir documento5");
        System.out.println("Estado inicial de la cola de impresión: " + cola_impresion);
        //mientras la cola no este vacia procesando
        while (!cola_impresion.isEmpty()){
            System.out.println("Procesando: " +cola_impresion.poll());
            System.out.println("Estado de la cola despues de procesar el trabajo;" + cola_impresion);
        }
        //ejercicio5
        Deque<Character> cola = new LinkedList<>();
        String palabra = "";
        for (int i = 0; i<palabra.length();i++){
            cola.offer(palabra.charAt(i));
        }
       while (!cola.isEmpty()){
           if (cola.peekFirst() == cola.peekLast()){
                cola.pollFirst();
                cola.pollLast();
            }else{
                System.out.println("No es palindromo");
                return;
            }
        }
        System.out.println("Es palindromo.");

       //ejercicio4
        Queue<String> compra = new LinkedList<>();

    }
}
