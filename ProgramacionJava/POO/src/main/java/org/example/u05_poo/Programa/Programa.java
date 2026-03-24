package org.example.u05_poo.Programa;
import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, String nombreDirector) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0; // Por defecto 0
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();

        this.director = new Empleado(nombreDirector, "director", null);
        this.listaEmpleados.add(this.director);

        // Relación bidireccional con cadena
        cadena.agregarPrograma(this);
    }

    public void insertarEmpleado(String nombre, String cargo, Empleado director) {
        Empleado nuevo = new Empleado(nombre, cargo, this.director);
        this.listaEmpleados.add(nuevo);
    }

    public void insertarInvitado(String nombre, String profesion, int temporada) {
        Invitado nuevo = new Invitado(nombre, profesion, temporada);
        this.listaInvitados.add(nuevo);
    }

    // Paso 2b: Muestra invitados de una temporada
    public void invitadosTemporada(int temporada) {
        int contador = 0;
        for (Invitado inv : listaInvitados) {
            if (inv.getTemporada() == temporada) {
                System.out.println("Nombre: " + inv.getNombre() + " - Profesión: " + inv.getProfesion());
                contador++;
            }
        }
        System.out.println("Total invitados temporada " + temporada + ": " + contador);
    }

    // Paso 2c: Devuelve veces que ha ido un invitado
    public int vecesInvitado(String nombre) {
        int veces = 0;
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equalsIgnoreCase(nombre)) {
                veces++;
            }
        }
        return veces;
    }

    // Paso 2d: Rastrear historial de un invitado
    public void rastrearInvitado(String nombre) {
        int total = vecesInvitado(nombre);
        System.out.println("El invitado " + nombre + " ha venido " + total + " veces.");
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Fecha: " + inv.getFecha_visita() + " | Temporada: " + inv.getTemporada());
            }
        }
    }

    // Paso 2e: Buscar si ha acudido
    public boolean buscarInvitado(String nombre) {
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    // Paso 2f: Compara fechas entre dos programas
    public void invitadoAntes(String nombre, Programa otroPrograma) {
        if (this.buscarInvitado(nombre) && otroPrograma.buscarInvitado(nombre)) {
            Invitado esteP = null;
            for (Invitado i : this.listaInvitados) {
                if(i.getNombre().equalsIgnoreCase(nombre)) esteP = i;
            }

            Invitado otroP = null;
            for (Invitado i : otroPrograma.getListaInvitados()) {
                if(i.getNombre().equalsIgnoreCase(nombre)) otroP = i;
            }

            if (esteP.getFecha_visita().isBefore(otroP.getFecha_visita())) {
                System.out.println(nombre + " estuvo antes en " + this.nombre);
            } else {
                System.out.println(nombre + " estuvo antes en " + otroPrograma.getNombre());
            }
        }
    }

    // Getters
    public ArrayList<Invitado> getListaInvitados() { return listaInvitados; }
    public ArrayList<Empleado> getListaEmpleados() { return listaEmpleados; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return "Programa [nombre=" + nombre + ", cadena=" + cadena.getNombre() + ", director=" + director.getNombre() + "]";
    }
}