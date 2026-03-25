package org.example.P11_ElFormigueroYLaRebelion;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Clase que representa un invitado de un programa de televisión.
 * Gestiona información personal, profesional y datos de visita.
 *
 * @author Manuela Planelles Lucas
 * @version 1.0
 * @see Programa
 */
public class Invitado {
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    /**
     * Constructor de la clase Invitado.
     * Solicita por teclado la fecha de visita al crear el objeto.
     *
     * @param nombre El nombre del invitado
     * @param profesion La profesión o ocupación del invitado
     * @param temporada El número de temporada en la que participa
     * @see #setFecha_visita(LocalDate)
     */
    public Invitado (String nombre, String profesion, int temporada){
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la fecha de visita para " + nombre + ":");
        System.out.print("Año (ej: 2025): ");
        int año = scanner.nextInt();
        System.out.print("Mes (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Día (1-31): ");
        int dia = scanner.nextInt();

        setFecha_visita(LocalDate.of(año, mes, dia));
    }

    /**
     * Obtiene el nombre del invitado.
     *
     * @return El nombre del invitado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del invitado.
     *
     * @param nombre El nuevo nombre del invitado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la profesión del invitado.
     *
     * @return La profesión u ocupación del invitado
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * Establece la profesión del invitado.
     *
     * @param profesion La nueva profesión del invitado
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * Obtiene la fecha de visita del invitado al programa.
     *
     * @return La fecha de visita como objeto LocalDate
     * @see LocalDate
     */
    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    /**
     * Establece la fecha de visita del invitado.
     *
     * @param fecha_visita La nueva fecha de visita
     */
    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    /**
     * Obtiene la temporada en la que participó el invitado.
     *
     * @return El número de temporada
     */
    public int getTemporada() {
        return temporada;
    }

    /**
     * Establece la temporada del invitado.
     *
     * @param temporada El nuevo número de temporada
     */
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    /**
     * Devuelve una representación en cadena de la información del invitado.
     * Incluye nombre, profesión, fecha de visita y temporada.
     *
     * @return String con la información formateada del invitado
     */
    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}