package org.example.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class Ejercicio4_Colas {

        static LinkedList<String> lista = new LinkedList<>();
        static Scanner teclado = new Scanner(System.in);
        public static void main(String[] args) {

            int opcion = 0;

            do {
                System.out.println("--- LISTA DE LA COMPRA ---");
                System.out.println("1. Añadir producto al final");
                System.out.println("2. Eliminar el primer producto");
                System.out.println("3. Eliminar un producto específico");
                System.out.println("4. Ver el primer producto");
                System.out.println("5. Buscar un producto");
                System.out.println("6. Mostrar lista actual");
                System.out.println("0. Salir");
                System.out.print("Elige una opción: ");

                opcion = Integer.parseInt(teclado.nextLine());

                switch (opcion) {
                    case 1:
                        anyadirProducto();
                        break;
                    case 2:
                        eliminarPrimero();
                        break;
                    case 3:
                        eliminarEspecifico();
                        break;
                    case 4:
                        verPrimero();
                        break;
                    case 5:
                        buscarProducto();
                        break;
                    case 6:
                        mostrarLista();
                        break;
                    case 0:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }

            } while (opcion != 0);
        }

        static void anyadirProducto() {
            System.out.print("Nombre del producto: ");
            String producto = teclado.nextLine();
            lista.offerLast(producto);
            System.out.println(producto + " añadido al final de la lista.");
        }

        static void eliminarPrimero() {
            if (lista.isEmpty()) {
                System.out.println("La lista está vacía. No hay nada que eliminar.");
            } else {
                String eliminado = lista.pollFirst();
                System.out.println("Se ha eliminado el primer producto: " + eliminado + ".");
            }
        }

        static void eliminarEspecifico() {
            if (lista.isEmpty()) {
                System.out.println("La lista está vacía. No hay nada que eliminar.");
                return;
            }
            System.out.print("Nombre del producto a eliminar: ");
            String producto = teclado.nextLine();

            if (lista.contains(producto)) {
                lista.remove(producto);
                System.out.println("Producto " + producto + " eliminado correctamente.");
            } else {
                System.out.println("El producto " + producto + " no se encuentra en la lista.");
            }
        }

        static void verPrimero() {
            if (lista.isEmpty()) {
                System.out.println("La lista está vacía.");
            } else {
                System.out.println("Primer producto: " + lista.peekFirst() + ".");
            }
        }

        static void buscarProducto() {
            if (lista.isEmpty()) {
                System.out.println("La lista está vacía.");
                return;
            }
            System.out.print("Nombre del producto a buscar: ");
            String producto = teclado.nextLine();

            if (lista.contains(producto)) {
                int posicion = lista.indexOf(producto) + 1;
                System.out.println("Producto " + producto + " encontrado en la posición " + posicion + ".");
            } else {
                System.out.println("El producto " + producto + " no está en la lista.");
            }
        }

        static void mostrarLista() {
            if (lista.isEmpty()) {
                System.out.println("La lista está vacía.");
            } else {
                System.out.println("Lista de la compra:");
                for (String producto : lista) {
                    int posicion = lista.indexOf(producto) + 1;
                    System.out.println("  " + posicion + ". " + producto);
                }
            }
        }
    }
