package org.example.u06_herencia.Dispositivos;

import java.util.ArrayList;

public class AppDispositivos {

    public static void main(String[] args) {

        ArrayList<Dispositivo> listaDispositivo = new ArrayList<>();

        listaDispositivo.add(new Televisor("LG Smart"));
        listaDispositivo.add(new ParlanteInteligente("Alexa"));



        Dispositivo proyector = new Dispositivo("Optoma"){
            @Override
            public void encender() {
                if (estado){
                    System.out.println("El proyector ya está encendido.");
                }else{
                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                    estado= true;
                }
            }
        };
        proyector.encender();

        ControlRemoto proyector_sinc = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación...");
            }
        };
        proyector_sinc.sincronizar();

        Dispositivo horno_ia = new Dispositivo("Horno ChatGPT") {
            @Override
            public void encender() {
                if (estado){
                    System.out.println("El horno ya está encendido.");
                }else{
                    System.out.println("Calentando horno con ajuste automático de temperatura..");
                    estado=false;
                }
            }
        };
        horno_ia.encender();


        listaDispositivo.add(proyector);
        listaDispositivo.add(horno_ia);

        for (Dispositivo dispositivo : listaDispositivo){
            dispositivo.encender();
            dispositivo.encender();

            if(dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            }else if(dispositivo.nombre.equals("Optoma")){
                proyector_sinc.sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();
            dispositivo.apagar();
        }
    }
}
