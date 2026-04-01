package org.example.Drift;

import lombok.Getter;

@Getter
public class Mecanico extends Participante{

    private Piloto piloto;

    public Mecanico(Piloto piloto){
        super();
        this.piloto=piloto;
        System.out.println("Mecánico " + super.getNombre() + " creado y asignado al piloto " + piloto.getNombre());
    }

    public void revisarVehiculo() {
        System.out.println("\nMecánico " + getNombre() + " revisando vehículo de " + piloto.getNombre());
        piloto.setEstado(EstadoCoche.REVISADO);
    }

}
