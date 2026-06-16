package org.example.ExtraordinariaJunio25.PiscinaMunicipal;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class AppPiscina {

    private static HashSet<Banyista> banystas=new HashSet<>();
    private static Integer numero;
    static Scanner teclado =  new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*** APP DE MANTENIMIENTO DE LA PISCINA DE MUTXAMEL ***");

        banystas.add(new Adulto("patricia",20,TipoUsuario.ADULTO));
        banystas.add(new Adulto("pablo",30,TipoUsuario.ADULTO));
        banystas.add(new Nino("pepe",12,TipoUsuario.NINO,"34565432"));
        banystas.add(new Nino("carla",8,TipoUsuario.NINO,"8569512"));
        banystas.add(new Invitado("Fran",40,TipoUsuario.INVITADO,LocalDate.now()));
        banystas.add(new Invitado("Marta",12,TipoUsuario.INVITADO,LocalDate.now()));


        try {
            altaUsuario();
        } catch (ExceptionEdad e) {
            System.out.println(e.getMessage());
        }
        System.out.println(" ");
        System.out.println("Lista bañistas: ");
        for (Banyista banyista : banystas){
            System.out.println(banyista);
        }
        System.out.println(" ");
        mostrarInvitados();
        System.out.println(" ");
        eliminarInvitados();



    }
    static void cobrar(Banyista banyista){
        banyista.pagar();

    }
    static void altaUsuario(){
       //menu tipo bañista
        int tipo;
        do{
            System.out.println("Alta de usuario...");
            System.out.println("    1. Adulto");
            System.out.println("    2. Niño (<=16 años)");
            System.out.println("    3. Invitado (pase diario)");
            System.out.println("----------------------------------");
            System.out.println("Elige un tipo: ");
            tipo = teclado.nextInt();
        }while (tipo<1 || tipo>3);

        System.out.println("Elegiste: " + tipo);


            switch (tipo){
                case 1: //adulto
                    System.out.println("Introduce el nombre del nuevo bañista: ");
                    String nombreA = teclado.next();

                    System.out.println("Introduce la edad: ");
                    int edadA = teclado.nextInt();

                    Adulto adult = new Adulto(nombreA, edadA, TipoUsuario.ADULTO);
                    banystas.add(adult);
                    cobrar(adult);

                    System.out.println("Nuevo bañista creado.");
                    break;
                case 2: //niño
                    System.out.println("Introduce el nombre del nuevo bañista: ");
                    String nombreN = teclado.next();

                    System.out.println("Introduce la edad: ");
                    int edadN = teclado.nextInt();
                    if (edadN > 16) {
                        throw new ExceptionEdad("ERROR al crear un NIÑO. Edad "+edadN+" no permitida.");
                    }

                    System.out.println("Introduce telefono de contacto del tutor: ");
                    String telef = teclado.next();

                    Nino nino = new Nino(nombreN, edadN, TipoUsuario.NINO, telef);
                    banystas.add(nino);
                    cobrar(nino);
                    System.out.println("Nuevo bañista creado.");
                    break;
                case 3: //invitado
                    System.out.println("Introduce el nombre del nuevo bañista: ");
                    String nombreI = teclado.next();

                    System.out.println("Introduce la edad: ");
                    int edadI = teclado.nextInt();

                    Invitado inv = new Invitado(nombreI, edadI, TipoUsuario.INVITADO, LocalDate.now());
                    banystas.add(inv);
                    cobrar(inv);
                    System.out.println("Nuevo bañista creado.");
                    break;
                default:
            }


    }

    static void mostrarInvitados(){
        System.out.println("Lista de invitados en el dia de hoy: ");
        for (Banyista invitado : banystas) {
            if (invitado instanceof Invitado) {
                System.out.println("Número " + invitado.getNumero() + " - Nombre: " + invitado.getNombre() + " - Edad: " + invitado.getEdad());
            }
        }


    }
    static void eliminarInvitados(){
        System.out.println("Eliminando invitados de hoy...");
        Iterator<Banyista> it = banystas.iterator();
        while (it.hasNext()) {
            Banyista invit = it.next();
            if (invit.getTipo() == TipoUsuario.INVITADO) {
                System.out.println("Número " + invit.getNumero() + " - Nombre: " + invit.getNombre() + " - Edad: " + invit.getEdad());
                it.remove();
            }
        }
    }
}
