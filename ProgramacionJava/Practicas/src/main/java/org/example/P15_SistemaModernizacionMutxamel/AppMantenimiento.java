package org.example.ra90_proyectos_integradores.practicas.SistemaModernizacionMutxamel;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMantenimiento {
    static ArrayList<Masajista> listaMasajistas = new ArrayList<>();
    static ArrayList<Jugador> listaJugadores = new ArrayList<>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Masajista m1 = new Masajista("Carlos",26,"Fisioterapeuta",5); //0
        Masajista m2 = new Masajista("Ramón",32,"Quiromasajista",7); //1
        Masajista m3 = new Masajista("José",45,"masajista Deportivo",20); //2
        listaMasajistas.add(m1);
        listaMasajistas.add(m2);
        listaMasajistas.add(m3);
        String resptPrimerMenu;


        Jugador j1 = new Jugador("Juan",30, Equipos.SENIOR,9,Posiciones.CENTROCAMPISTA,listaJugadores);
        Jugador j2 = new Jugador("Ivan",29, Equipos.SENIOR,3,Posiciones.DEFENSA,listaJugadores);
        Jugador j3 = new Jugador("Marcos",23, Equipos.BENJAMIN,7,Posiciones.DEFENSA,listaJugadores);
        Jugador j4 = new Jugador("Raul",21, Equipos.BENJAMIN,6,Posiciones.CENTROCAMPISTA,listaJugadores);
        Jugador j5 = new Jugador("Fernando",26, Equipos.ALEVIN,4,Posiciones.DELANTERO,listaJugadores);
        Jugador j6 = new Jugador("José",22, Equipos.ALEVIN,2,Posiciones.DELANTERO,listaJugadores);
        Jugador j7 = new Jugador("Carlos",30, Equipos.INFANTIL,8,Posiciones.CENTROCAMPISTA,listaJugadores);
        Jugador j8 = new Jugador("Manuel",28, Equipos.INFANTIL,1,Posiciones.PORTERO,listaJugadores);
        Jugador j9 = new Jugador("Fran",24, Equipos.CADETE,5,Posiciones.DELANTERO,listaJugadores);
        Jugador j10 = new Jugador("Loreto",25, Equipos.CADETE,10,Posiciones.DEFENSA,listaJugadores);
        Jugador j11 = new Jugador("Roberto",29, Equipos.JUVENIL,11,Posiciones.PORTERO,listaJugadores);
        listaJugadores.add(j1);
        listaJugadores.add(j2);
        listaJugadores.add(j3);
        listaJugadores.add(j4);
        listaJugadores.add(j5);
        listaJugadores.add(j6);
        listaJugadores.add(j7);
        listaJugadores.add(j8);
        listaJugadores.add(j9);
        listaJugadores.add(j10);
        listaJugadores.add(j11);



        do {
            System.out.println("App de mantenimiento del MUTXAMEL FC");
            System.out.println("  [1]. Mantenimiento de jugadores");
            System.out.println("         Dentro podremos añadir jugadores, modificar datos y añadir acompañantes (sólo seniors).");
            System.out.println("  [2]. Mantenimiento de entrenadores (añadir-modificar-salir)");
            System.out.println("         Dentro podremos añadir entrenadores y modificar sus datos.");
            System.out.println("  [3]. Mantenimiento masajistas (añadir-modificar datos-salir)");
            System.out.println("         Dentro podremos añadir masajistas y modificar sus datos.");
            System.out.println("  [4]. Consultar equipos");
            System.out.println("         Dentro se deben listar los tipos de equipos del club y elegir uno.");
            System.out.println("  [x]. Salir");
            System.out.println();
            System.out.print("Selecciona una opción --> ");

            resptPrimerMenu = teclado.next().toLowerCase();

            switch (resptPrimerMenu) {
                case "1":
                    System.out.println("Mantenimiento de Jugadores");
                    System.out.println("   [1]. Añadir nuevo jugador");
                    System.out.println("   [2]. Modificar datos de jugador existente");
                    System.out.println("   [3]. Crear acompañantes (sólo seniors)");
                    System.out.println("   [X]. Volver al menú principal");
                    System.out.println();
                    System.out.println("Selecciona una opción --> ");
                    break;

                case "2":
                    System.out.println("Mantenimiento de Entrenadores");
                    System.out.println("   [1]. Añadir nuevo entrenador");
                    System.out.println("   [2]. Modificar datos de entrenador existente");
                    System.out.println("   [X]. Volver al menú principal");
                    System.out.println();
                    System.out.println("Selecciona una opción --> ");
                    break;

                case "3":
                    menuMasajista();

                    break;

                case "4":
                    menuConsultarEquipos();
                    break;

                case "x":
                    System.out.println("Finalizando programa.");
                    break;
                default:
                    System.out.println("La opción no es valida");
                    break;
            }

        } while (!resptPrimerMenu.equals("x"));

    }
    public static void menuMasajista () {
        Scanner teclado = new Scanner(System.in);
        String nuevoMasj;

        do {
            System.out.println("Mantenimiento de Entrenadores");
            System.out.println("   [1]. Añadir nuevo entrenador");
            System.out.println("   [2]. Modificar datos de entrenador existente");
            System.out.println("   [x]. Volver al menú principal");
            System.out.println();
            System.out.println("Selecciona una opción --> ");

            nuevoMasj = teclado.next().toLowerCase();
            switch (nuevoMasj) {
                case "1": //Añadir nuevo entrenador
                    System.out.println("Introduce los datos del nuevo masajista: ");
                    System.out.println("Nombre: ");
                    String nombre = teclado.next();

                    System.out.println("Edad: ");
                    int edad = teclado.nextInt();

                    System.out.println("Titulación: ");
                    String titulacion = teclado.next();

                    System.out.println("Años de experiencia: ");
                    int anyos = teclado.nextInt();

                    listaMasajistas.add(new Masajista(nombre, edad, titulacion, anyos));

                    System.out.println("¡Masajista añadido correctamente!");

                   /*for (int i = 0; i <listaMasajistas.size(); i++) {
                        Masajista m = listaMasajistas.get(i);
                       System.out.println(listaMasajistas.get(i).toString() );
                   }

                    */

                    break;

                    case "2": //Modificar datos de entrenador existente
                    System.out.println("¿De qué masajista quieres hacer cambios?");

                    for (int i = 0; i < listaMasajistas.size(); i++) {
                        System.out.println("[" + i + ", "+ listaMasajistas.get(i).toString() );
                    }

                    System.out.print("Selecciona una opción --> ");
                    int masajSelect = teclado.nextInt();

                    Masajista masajista = listaMasajistas.get(masajSelect);
                    System.out.print("¿Qué quieres modificar? nombre, edad, titulacion o anyosExperiencia: ");
                    String modificar = teclado.next().toLowerCase();

                    switch (modificar){
                        case "nombre":
                            String nomNuevo = teclado.next();
                            listaMasajistas.get(masajSelect).setNombre(nomNuevo);
                            System.out.println("Masajista actualizado: [" + listaMasajistas.get(masajSelect).toString() + "]");
                            break;
                        case "edad":
                            int edadNuevo = teclado.nextInt();
                            listaMasajistas.get(masajSelect).setEdad(edadNuevo);
                            System.out.println("Masajista actualizado: [" + listaMasajistas.get(masajSelect).toString() + "]");
                            break;
                        case "titulacion":
                            String titNuevo = teclado.next();
                            listaMasajistas.get(masajSelect).setTitulacion(titNuevo);
                            System.out.println("Masajista actualizado: [" + listaMasajistas.get(masajSelect).toString() + "]");
                            break;
                        case "anyosexperiencia":
                            int anyosExpNuevo = teclado.nextInt();
                            listaMasajistas.get(masajSelect).setAnyosExperiencia(anyosExpNuevo);
                            System.out.println("Masajista actualizado: [" + listaMasajistas.get(masajSelect).toString() + "]");
                            break;
                        default:
                            System.out.println("La opción no es valida");
                            break;
                    }
                    break;
                case "x": //Volver al menú principal
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("La opción no es valida");
                    break;
            }
        } while (!nuevoMasj.equals("x"));

    }
    public static void menuConsultarEquipos(){
    //Dentro se deben listar los tipos de equipos del club y elegir uno.
        // BENJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, SENIOR
        Scanner teclado = new Scanner(System.in);
        String equipo;
        do {
        System.out.println("Equipos: ");
        for (Equipos equipos : Equipos.values()) {
            System.out.println(equipos);
        }
        System.out.println("[x]. Volver al menú.");

        System.out.print("Selecciona una opción --> ");
        equipo = teclado.next().toLowerCase();


            switch (equipo){
                case "benjamin":
                    for (Jugador jugador : listaJugadores) {
                        if (jugador.getCategoria() == Equipos.BENJAMIN) {
                            System.out.println(jugador.toString());
                        }
                    }
                break;
                case "alevin":
                    for (Jugador jugador : listaJugadores) {
                        if (jugador.getCategoria() == Equipos.ALEVIN) {
                            System.out.println(jugador.toString());
                        }
                    }
                    break;
                case "infantil":
                    for (Jugador jugador : listaJugadores) {
                        if (jugador.getCategoria() == Equipos.INFANTIL) {
                            System.out.println(jugador.toString());
                        }
                    }
                    break;
                case "cadete":
                    for (Jugador jugador : listaJugadores) {
                        if (jugador.getCategoria() == Equipos.CADETE) {
                            System.out.println(jugador.toString());
                        }
                    }
                    break;
                case "juvenil":
                    for (Jugador jugador : listaJugadores) {
                        if (jugador.getCategoria() == Equipos.JUVENIL) {
                            System.out.println(jugador.toString());
                        }
                    }
                    break;
                case "senior":
                    for (Jugador jugador : listaJugadores) {
                        if (jugador.getCategoria() == Equipos.SENIOR) {
                            System.out.println(jugador.toString());
                        }
                    }
                    break;
                case "x":
                    System.out.println("Volviendo al menú...");
                    break;
                default:
                    System.out.println("La opción no es valida.");
            }
        }while (!equipo.equals("x"));
    }
}

