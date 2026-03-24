package org.example.u06_herencia.Dispositivos;

public abstract class Dispositivo {
    String nombre;
    boolean estado;

    Dispositivo(String nombre) {
        this.nombre = nombre;
        this.estado = false;
    }
    public abstract void encender();


    public void apagar() {
        if (estado == false) {
            System.out.println(nombre + " ya está apagado.");
        } else {
            estado = false;
            System.out.println(nombre + " apagado.");
        }
    }
    public void mostrarEstado() {
        if (estado) {
            System.out.println(nombre + " está encendido.");
        } else {
            System.out.println(nombre + " está apagado.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
