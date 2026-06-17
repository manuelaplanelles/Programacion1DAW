package org.example.SimulacroJunio26.Vista_Papa2;

import org.example.Repertorio;

import java.util.*;

public class VaticanoApp {
    static LinkedHashSet<Peregrino> registrados = new LinkedHashSet<>();
    static Queue<Peregrino> fila = new LinkedList<>();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        registrados.add(new Nacional("Manuela", EstadoPeregrino.SOLICITUD_OK, "Valencia"));
        registrados.add(new Nacional("Pedro", EstadoPeregrino.BENDECIDO, "Alicante"));
        registrados.add(new Nacional("Carmen", EstadoPeregrino.SOLICITUD_OK, "Albacete"));
        registrados.add(new Extranjero("Mike", EstadoPeregrino.EN_COLA, "UK"));
        registrados.add(new Extranjero("Dolo", EstadoPeregrino.SOLICITUD_OK, "Francia"));

        for (Peregrino peregrino : registrados) {
            System.out.println(peregrino);
        }
        llegadaPeregrino();
        bendicionPapal();

    }
    public static void llegadaPeregrino(){
        System.out.println("> Introduce num reserva: ");
        Integer id = teclado.nextInt();
        Peregrino peregrino = buscarPeregrino(id);

        if(peregrino!=null){
            fila.offer(peregrino);
            System.out.println("[+] Peregrino "+peregrino.getNombre()+ " añadido a la fila.");

        }
    }
    public static Peregrino buscarPeregrino (Integer id){
        for (Peregrino pereg : registrados) {
            if (pereg.getNumReserva().equals(id)) {
                if(pereg.getEstado().equals(EstadoPeregrino.BENDECIDO)){
                        System.out.println("[!] ¡Pecador! Ya has recibido tu besico, deja paso a otros");
                        return null;
                }else{
                        pereg.setEstado(EstadoPeregrino.EN_COLA);
                        return pereg;
                }
            }
        }
        System.out.println("[!] Error: Reserva no encontrada.");
        return null;
    }
    public static void bendicionPapal(){
        if (!fila.isEmpty()){
                System.out.println("Su Santidad está descansando, no hay nadie en la cola.");
            }else{
                System.out.println(">El Papa bendice: ");
            while (!fila.isEmpty()) {
                Peregrino peregrino = fila.peek();
                peregrino=fila.poll();
                peregrino.recibirBesico();
                peregrino.setEstado(EstadoPeregrino.BENDECIDO);
            }

        }
    }
}
