package org.example.u06_herencia.RedesSociales;

public class Streamer extends Usuario{
    private int numeroRetransmisiones;
    private int horasDirecto;

    public Streamer(String nombre, int edad, String nomUsuario, int seguidores, int numeroRetransmisiones, int horasDirecto) {
        super(nombre, edad, nomUsuario, seguidores);
        this.numeroRetransmisiones = numeroRetransmisiones;
        this.horasDirecto = horasDirecto;
    }

    public int getNumeroRetransmisiones() {
        return numeroRetransmisiones;
    }

    public void setNumeroRetransmisiones(int numeroRetransmisiones) {
        this.numeroRetransmisiones = numeroRetransmisiones;
    }

    public int getHorasDirecto() {
        return horasDirecto;
    }

    public void setHorasDirecto(int horasDirecto) {
        this.horasDirecto = horasDirecto;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Informacion del Streamer:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nombre de usuario: " + getNomUsuario());
        System.out.println("Retransmisiones realizadas: " + numeroRetransmisiones);
        System.out.println("Horas de directo: " + horasDirecto);
    }
}
