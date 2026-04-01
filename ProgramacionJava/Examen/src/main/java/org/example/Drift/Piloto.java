package org.example.Drift;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Piloto extends Participante{

    private String marca;
    private EstadoCoche estado;
    private int puntuacion;

    public Piloto(String marca){
        super();
        this.marca=marca;
        this.estado=EstadoCoche.PENDIENTE;
        this.puntuacion=0;
        System.out.println("Piloto " + getNombre() + " de la marca " + marca + " creado.");
    }

    public Inscripcion inscribirse(){

        System.out.println("\nPiloto " + super.getNombre() +  " realizando inscripción...");
        return new Inscripcion(this);

    }

    public void pagarInscripcion(Inscripcion inscripcion){
        System.out.println("\nPiloto " + getNombre() + " pagando " + inscripcion.getCategoria().getPrecio() + " € por la inscripción en categoría " + inscripcion.getCategoria().name());
        inscripcion.setPagado(true);
    }

}
