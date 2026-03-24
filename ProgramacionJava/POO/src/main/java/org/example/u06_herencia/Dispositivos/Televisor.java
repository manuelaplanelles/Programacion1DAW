package org.example.u06_herencia.Dispositivos;

public class Televisor extends Dispositivo implements ControlRemoto {

    public Televisor(String nombre) {
        super(nombre);
    }
    @Override
    public void encender() {
        if (super.estado) {
            System.out.println("El televisor ya está encendido.");
        } else {
            super.estado = true;
            System.out.println("Encendiendo televisor...");
        }
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto...");
    }
}
