package org.example.SimulacroJunio25.Vista_Papa;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class VaticanoApp {
    static HashSet<Peregrino> registrados = new HashSet<>();
    static LinkedList<Peregrino> fila = new LinkedList<>();

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        registrados.add(new Nacional(1, "Manuela", EstadoPeregrino.EN_COLA, "Alicante"));
        registrados.add(new Nacional(2, "Pedro", EstadoPeregrino.EN_COLA,"Madrid"));
        registrados.add(new Nacional(3, "Lacía", EstadoPeregrino.EN_COLA,"Murcia"));
        registrados.add(new Extranjero(4, "Mike", EstadoPeregrino.EN_COLA, "UK"));
        registrados.add(new Extranjero(5, "Matilde", EstadoPeregrino.EN_COLA, "Francia"));

        System.out.println(registrados);

        llegadaPeregrino();
        bendicionPapal();


        for(Peregrino peregrino : registrados){
            if (peregrino instanceof Extranjero && peregrino.getEstado() == EstadoPeregrino.BENDECIDO){
                System.out.println(peregrino);
            }
        }

    }

    public static Peregrino llegadaPeregrino(){
        System.out.println("> Introduce num reserva: ");
        Integer id = teclado.nextInt();

        Peregrino peregrino = buscarPeregrino(id);

        if (peregrino == null){
            System.out.println("[!] ERROR: Reserva no encontrada");
            return null;
        }
        if(peregrino.getEstado()==EstadoPeregrino.BENDECIDO){
            System.out.println("¡Pecador! Ya has recibido tu besico, deja paso a otros");
            return null;
        }
        peregrino.setEstado(EstadoPeregrino.EN_COLA);
        fila.add(peregrino);
        System.out.println("[+] Peregrino " + peregrino.getNombre() + " añadido a la fila.");
        return peregrino;
    }

    public static Peregrino buscarPeregrino(Integer id){
        for(Peregrino peregrino : registrados){
            if(peregrino.getNumReserva().equals(id)){
                return peregrino;
            }
        }
        return null;
    }

    public static void bendicionPapal(){
        if(fila.isEmpty()){
            System.out.println("Su Santidad está descansando, no hay nadie en la cola.");
            return;
        }else {
            System.out.println("> El Papa bendice: ");
            while (!fila.isEmpty()) {
                Peregrino peregrino = fila.poll();
                peregrino.recibirBesico();
                peregrino.setEstado(EstadoPeregrino.BENDECIDO);
            }
        }
    }

}

