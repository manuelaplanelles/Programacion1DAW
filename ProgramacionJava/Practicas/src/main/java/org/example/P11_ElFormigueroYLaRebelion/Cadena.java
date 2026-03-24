package org.example.P11_ElFormigueroYLaRebelion;

import java.util.ArrayList;
/**
 * Clase que representa una cadena de televisión.
 * Gestiona una lista de programas asociados a la cadena.
 *
 * @author Manuela Planelles Lucas
 * @version 1.0
 */
public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaPrograma;
    /**
     * Constructor de la clase Cadena.
     * Inicializa la lista de programas vacía.
     *
     * @param nombre El nombre de la cadena de televisión
     */
    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaPrograma = new ArrayList<>();
    }
    /**
     * Agrega un programa a la lista de programas de la cadena.
     * No agrega el programa si es nulo o ya existe en la lista.
     *
     * @param programa El programa a agregar a la cadena
     * @see Programa
     */
    public void agregarPrograma(Programa programa) {
        if (programa != null && !listaPrograma.contains(programa)) {
            listaPrograma.add(programa);
        }
    }
    /**
     * Elimina un programa de la lista de programas de la cadena.
     *
     * @param programa El programa a eliminar de la cadena
     * @see #agregarPrograma(Programa)
     */
    public void eliminarPrograma(Programa programa) {
        listaPrograma.remove(programa);
    }

    /**
     * Obtiene el nombre de la cadena.
     *
     * @return El nombre de la cadena de televisión
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre de la cadena.
     *
     * @param nombre El nuevo nombre de la cadena
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene la lista de programas de la cadena.
     *
     * @return ArrayList con los programas asociados a la cadena
     * @see Programa
     */
    public ArrayList<Programa> getListaPrograma() {
        return listaPrograma;
    }

    public void setListaPrograma(ArrayList<Programa> listaPrograma) {
        this.listaPrograma = listaPrograma;
    }
    /**
     * Devuelve una representación en cadena de la información de la cadena.
     * Incluye el nombre y el listado de programas.
     *
     * @return String con la información formateada de la cadena
     */
    @Override
    public String toString() {
        String resultado = "Cadena: " + nombre + "\n" +
                "Programas: " + listaPrograma.size() + "\n";
        for (Programa programa : listaPrograma) {
            resultado += "  - " + programa.getNombre() + "\n";
        }
        return resultado;
    }
}
