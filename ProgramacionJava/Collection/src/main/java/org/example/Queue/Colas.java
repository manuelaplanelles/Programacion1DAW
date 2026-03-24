package org.example.Queue;

import java.util.Scanner;

import static java.lang.System.in;

public class Colas {
    static Scanner teclado = new Scanner(in);

    public static <Strings> void main(String[] args) {
        /*Ejercicio 1
        Queue<Character> cola = new LinkedList<>();
        cola.offer('a');
        cola.offer('b');
        cola.offer('c');
        cola.offer('d');
        cola.offer('e');
        System.out.println("¿La cola esta vacia? " + cola.isEmpty());
        System.out.println("¿Cuantos elemento hay? "+cola.size());
        System.out.println("El primer elemento es: "+cola.peek());
        System.out.println("Elementos eliminados:");
        while (!cola.isEmpty()){
            System.out.print(cola.poll()+", ");
        }
        System.out.println();
        System.out.println("¿La cola esta vacia? " + cola.isEmpty());*/

        /*Ejercicio 2
        Queue<String> cola = new LinkedList<>();
        cola.offer("Imprimir documento 1");
        cola.offer("Imprimir documento 2");
        cola.offer("Imprimir documento 3");
        cola.offer("Imprimir documento 4");
        cola.offer("Imprimir documento 5");
        System.out.println("Estado inicial de la cola de imprecion: "+cola);

        while (!cola.isEmpty()){
            System.out.println("Procesando: Imprimir "+cola.poll());
            System.out.println("Estado de la cola despues de procesar el trabajo "+cola);

        }
        if (cola.isEmpty()){
            System.out.println("No hay más trabajos en la cola de impresión.");
        }else{
            System.out.println("Estado de la cola despues de procesar el trabajo "+cola);
        }*/
        /*Ejercicio 3
        Queue<String> playlist = new LinkedList<>();
        playlist.offer("Hotel California - Eagles");
        playlist.offer("The Passenger - Iggy Pop");
        playlist.offer("Oh Klahoma - Jack Stauber");
        playlist.offer("Beautiful Things - Benson Boone");
        playlist.offer("Belong Together - Mark Ambor");
        System.out.println("Estado inicial de la playlist: "+playlist);
        while (!playlist.isEmpty()){
            System.out.println("Reproduciendo: "+playlist.poll());
            System.out.println("Estado inicial de la playlist: "+playlist);
        }
        if(playlist.isEmpty()){
            System.out.println("La playlist ha terminado.");
        }*/
        /*Ejercicio 4
        main: static LinkedList<String> compra = new LinkedList<String>();

        String opcion = "";

        do {
            System.out.println("--- LISTA DE LA COMPRA ---");
            System.out.println("1. Añadir producto al final");
            System.out.println("2. Eliminar el primer producto");
            System.out.println("3. Eliminar un producto específico");
            System.out.println("4. Ver el primer producto");
            System.out.println("5. Buscar un producto");
            System.out.println("6. Mostrar lista actual");
            System.out.println("x. Salir");
            System.out.print("Elige una opción: ");

            opcion = teclado.nextLine().toLowerCase();

            switch (opcion){
                case "1":
                    anyadirFinal();
                    break;
                case "2":
                    eliminarPrimero();
                    break;
                case "3":
                    eliminarProducto();
                    break;
                case "4":
                    primerProducto();
                    break;
                case "5":
                    buscarProducto();
                    break;
                case "6":
                    listaActualizada();
                    break;
                case "x":
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while (!opcion.equals("x"));
        }
        public static void anyadirFinal(){
                System.out.println("Producto a añadir: ");
                String producto = teclado.nextLine();
                        compra.offerLast(producto);
                System.out.println(producto + " añadido al final de la lista.");
                System.out.println("Lista de la compra actualizada: "+compra);
        }
        public static void eliminarPrimero() {
            if (compra.isEmpty()) {
                System.out.println("La lista esta vacia.");
            } else {
                System.out.println("Producto eliminado: " + compra.pollFirst());
                System.out.println("Lista de la compra actualizada: " + compra);
            }
        }
        public static void eliminarProducto(){
                System.out.println("Que producto quieres eliminar: ");
                String producto = teclado.nextLine();
            if (compra.isEmpty()) {
                System.out.println("La lista esta vacia.");
            }else if (compra.contains(producto)) {
                    System.out.println(compra.remove(producto) + " eliminado de la lista.");
                    System.out.println("Lista de la compra actualizada: " + compra);
            }else {
                    System.out.println("El producto no esta en la lista.");
                    System.out.println("Lista de la compra actualizada: " + compra);
            }
        }
        public static void primerProducto(){
            System.out.println("El primer producto de la compra es: "+compra.peekFirst());
        }
        public static void buscarProducto(){
            System.out.println("Que producto quieres buscar: ");
            String producto = teclado.nextLine();
            if (compra.isEmpty()) {
                System.out.println("La lista esta vacia.");
            }else if (compra.contains(producto)) {
                System.out.println(producto+" si que se ecuentra en la lista.");
                System.out.println("Lista de la compra actualizada: " + compra);
            }else {
                System.out.println("El producto no esta en la lista.");
                System.out.println("Lista de la compra actualizada: " + compra);
            }
        }
        public static void listaActualizada() {
            if (compra.isEmpty()) {
                System.out.println("La lista está vacía.");
            } else {
                int i = 0;
                while (i < compra.size()) {
                    System.out.println((compra.indexOf(compra.get(i)) + 1) + ". " + compra.get(i));
                    i++;
                }
            }
        }*/

        //Ejercicio 5
    }
}

