package org.example.P15_SistemaModernizacionMutxamel;

import java.util.ArrayList;

public class AppMutxamelFC {
    public static void main(String[] args) {

        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        Jugador j1 = new Jugador("Juan",30, Equipos.SENIOR,9,Posiciones.CENTROCAMPISTA,listaJugadores);
        Jugador j2 = new Jugador("Ivan",29, Equipos.SENIOR,3,Posiciones.DEFENSA,listaJugadores);
        Jugador j3 = new Jugador("Marcos",23, Equipos.SENIOR,7,Posiciones.DEFENSA,listaJugadores);
        Jugador j4 = new Jugador("Raul",21, Equipos.SENIOR,6,Posiciones.CENTROCAMPISTA,listaJugadores);
        Jugador j5 = new Jugador("Fernando",26, Equipos.SENIOR,4,Posiciones.DELANTERO,listaJugadores);
        Jugador j6 = new Jugador("José",22, Equipos.SENIOR,2,Posiciones.DELANTERO,listaJugadores);
        Jugador j7 = new Jugador("Carlos",30, Equipos.SENIOR,8,Posiciones.CENTROCAMPISTA,listaJugadores);
        Jugador j8 = new Jugador("Manuel",28, Equipos.SENIOR,1,Posiciones.PORTERO,listaJugadores);
        Jugador j9 = new Jugador("Fran",24, Equipos.SENIOR,5,Posiciones.DELANTERO,listaJugadores);
        Jugador j10 = new Jugador("Loreto",25, Equipos.SENIOR,10,Posiciones.DEFENSA,listaJugadores);
        Jugador j11 = new Jugador("Roberto",29, Equipos.SENIOR,11,Posiciones.PORTERO,listaJugadores);

        ArrayList<Entrenador> listaEntrenador = new ArrayList<>();
        Entrenador e1 = new Entrenador("Pepe",40, Equipos.SENIOR,"4-4-2",listaEntrenador);
        Entrenador e2 = new Entrenador("Lolo",45, Equipos.INFANTIL,"4-3-3",listaEntrenador);
        Entrenador e3 = new Entrenador("Carlos",43, Equipos.ALEVIN,"4-2-3",listaEntrenador);

        ArrayList<Masajista> listaMasajistas = new ArrayList<>();
        Masajista m1 = new Masajista("Carlos",26,"Fisioterapeuta",5);
        Masajista m2 = new Masajista("Ramón",32,"Quiromasajista",7);
        Masajista m3 = new Masajista("José",45,"masajista Deportivo",20);

        ArrayList<Acompanyante> listaAcompanyante = new ArrayList<>();
        Acompanyante a1 = new Acompanyante("Mari Carmen",55, j1, "Madre");
        Acompanyante a2 = new Acompanyante("Ainna",26, j1, "Pareja");
        Acompanyante a3 = new Acompanyante("José Ramon",58, j6, "Padre");
        Acompanyante a4 = new Acompanyante("Iñaqui",33, j6, "Hermano");
        Acompanyante a5 = new Acompanyante("Manoli",55, j4, "Madre");
        Acompanyante a6 = new Acompanyante("María Ángeles",26, j4, "Tia");
        Acompanyante a7 = new Acompanyante("Fernan",58, j2, "Amigo");
        Acompanyante a8 = new Acompanyante("Rober",33, j2, "amigo");

        j1.concentrarse();
        e1.concentrarse();
        m1.concentrarse();
        a1.concentrarse();
        System.out.println();

        j2.entrenar();
        e2.entrenar();

        System.out.println();
        m3.darMasaje(j6);

        System.out.println();
        j4.viajar("Madrid");
        e3.viajar("Madrid");
        m2.viajar("Madrid");
        a4.viajar("Madrid");

        System.out.println();
        e1.planificarEntrenamiento();

        System.out.println();
        j2.descansar();

        System.out.println();
        j5.calentar();

        System.out.println();
        j2.jugarPartido("Madrid");
        e2.jugarPartido("Madrid");

        System.out.println();
        a4.animarEquipo();

        System.out.println();
        e2.hacerCambios();

        System.out.println();
        j3.marcarGol();

        System.out.println();
        j1.celebrarGol();
        e2.celebrarGol();
        m1.celebrarGol();
        a7.celebrarGol();

        System.out.println();
        for (int i = 0; i < 4; i++) {
            m1.darMasaje(listaJugadores.get(i));
        }

        System.out.println();
        j4.viajar("Mutxamel");
        e3.viajar("Mutxamel");
        m2.viajar("Mutxamel");
        a4.viajar("Mutxamel");


    }
}
