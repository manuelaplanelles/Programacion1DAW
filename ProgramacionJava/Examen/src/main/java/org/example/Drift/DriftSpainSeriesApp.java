package org.example.Drift;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DriftSpainSeriesApp {

    public static ArrayList<Inscripcion> pilotosInscritos = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("=== BIENVENIDO A LA APP DEL DRIFT SPAIN SERIES DE VALENCIA ===");

        // crear 3 pilotos para las marcas SKODA, MERCEDES y TOYOTA
        Piloto skoda = new Piloto("SKODA");
        Piloto mercedes = new Piloto("MERCEDES");
        Piloto toyota = new Piloto("TOYOTA");

        // todos los pilotos se inscriben en la categoría PRO y guardamos sus inscripciones en la lista de pilotosInscritos
        Inscripcion skoda_insc = skoda.inscribirse();
        pilotosInscritos.add(skoda_insc);
        Inscripcion mercedes_insc = mercedes.inscribirse();
        pilotosInscritos.add(mercedes_insc);
        Inscripcion toyota_insc = toyota.inscribirse();
        pilotosInscritos.add(toyota_insc);

        // crea al juez de la carrera
        Juez juez_malo = new Juez();

        // sólo 2 pilotos pagan la inscripción
        skoda.pagarInscripcion(skoda_insc);
        mercedes.pagarInscripcion(mercedes_insc);

        System.out.println(pilotosInscritos);

        // el juez valida que todas las inscripciones sean validas (el piloto ha pagado) antes de organizar la carrera.
        // aquellas inscripciones que no sean válidas, deben el valor de la marca del piloto a NO_VALIDO
        System.out.println("\nJuez validando inscripciones...");
        for (Inscripcion insc : pilotosInscritos){
            juez_malo.validarInscripciones(insc);
        }

        // crea los mecánicos asociados a cada piloto inscrito que no tenga la marca NO_VALIDO y mételos en una nueva lista
        ArrayList<Mecanico> listaMecanicos = new ArrayList<>();
        for (Inscripcion insc : pilotosInscritos){
            if (!insc.getPiloto().getMarca().equals("NO_VALIDO")){
                System.out.println("\nCreando mecánico para " + insc.getPiloto().getNombre() + ": ");
                listaMecanicos.add(new Mecanico(insc.getPiloto()));
            }
        }

        // los mecánicos revisan los coches de sus pilotos para dejarlos a punto para la carrera
        for (Mecanico mecanico : listaMecanicos){
            mecanico.revisarVehiculo();
        }

        // el juez comprueba el estado VALIDADO de los coches antes de iniciar la carrera y les da el APTO,
        System.out.println("\nJuez validando coches...");
        for (Mecanico mecanico : listaMecanicos){
            juez_malo.validarCocheApto(mecanico.getPiloto());
        }

        // se lanza la carrera darSalida() y puntúa sólo a aquellos pilotos que hayan conseguido el APTO en sus coches
        juez_malo.darSalida();
        for (Mecanico mecanico : listaMecanicos){
            if (mecanico.getPiloto().getEstado().equals(EstadoCoche.APTO)){
                juez_malo.puntuar(mecanico.getPiloto());
            }
        }

        // imprimir ganador
        verGanador(CategoriaDrift.PRO);

    }

    public static void verGanador(CategoriaDrift categoria){

        Piloto ganador = pilotosInscritos.get(0).getPiloto();

        for (Inscripcion insc : pilotosInscritos){
            if (insc.getPiloto().getPuntuacion()>ganador.getPuntuacion()){
                ganador = insc.getPiloto();
            }
        }

        System.out.println("\nEl piloto ganador en categoría " + categoria + " ha sido " + ganador.getNombre() );

    }
}
