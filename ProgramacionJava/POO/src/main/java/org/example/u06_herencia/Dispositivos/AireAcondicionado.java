package org.example.u06_herencia.Dispositivos;

public class AireAcondicionado extends Dispositivo implements ControlRemoto {

    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (super.estado) {
            System.out.println("El aire acondicionado ya está encendido.");
        } else {
            super.estado = true;
            System.out.println("Encendiendo aire acondicionado...");
        }
    }

    @Override
    public void sincronizar() {

        System.out.println("Sincronizando aire acondicionado con control remoto...");
    }
}
