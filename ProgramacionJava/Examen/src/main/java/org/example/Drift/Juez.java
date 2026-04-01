package org.example.Drift;

import java.util.Random;

public class Juez extends Participante implements AccionesCarrera{

    public Juez(){
        super();
        System.out.println("Juez " + getNombre() + " creado.");
    }

    public void validarCocheApto(Piloto piloto){
        if (piloto.getEstado().equals(EstadoCoche.REVISADO)){
            piloto.setEstado(EstadoCoche.APTO);
            System.out.println("Coche del piloto " + piloto.getNombre() + " APTO.");
        }else{
            //LANZAR EXCEPTION AQUÍ
            piloto.setEstado(EstadoCoche.NO_APTO);
            System.out.println("Coche del piloto " + piloto.getNombre() + " NO APTO.");
        }
    }

    @Override
    public void validarInscripciones(Inscripcion inscripcion) {

            if (inscripcion.isPagado()){
                System.out.println("Piloto " + inscripcion.getPiloto().getNombre() + ": Inscripción válida.");
            }else{
                System.out.println("La inscripción no está completada por el piloto " + inscripcion.getPiloto().getNombre());
                inscripcion.getPiloto().setMarca("NO_VALIDO");
            }

    }

    @Override
    public void darSalida() {
        System.out.println("\nJuez " + getNombre() + " dando salida a la carrera en 3... 2... 1");
    }

    @Override
    public void puntuar(Piloto piloto) {
        Random aleatorio = new Random();
        piloto.setPuntuacion(aleatorio.nextInt(9)+1);
        System.out.println("\nJuez puntuando a " + piloto.getNombre() + " con " + piloto.getPuntuacion() + " puntos.");
    }

}
