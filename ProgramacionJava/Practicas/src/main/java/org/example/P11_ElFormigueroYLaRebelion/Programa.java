package org.example.P11_ElFormigueroYLaRebelion;

import java.util.ArrayList;
/**
 * Clase que representa un programa de televisión.
 * Gestiona empleados, invitados y la relación con su cadena.
 *
 * @author Manuela Planelles Lucas
 * @version 1.0
 * @see Cadena
 * @see Empleado
 * @see Invitado
 */
public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;

    private ArrayList<Empleado>  listaEmpleado = new ArrayList<>();
    private ArrayList<Invitado> listaInvitado = new ArrayList<>();
    private Empleado director;
    /**
     * Constructor de la clase Programa.
     * Crea automáticamente el director y lo añade a la lista de empleados.
     * Si la cadena no es nula, agrega este programa a su lista.
     *
     * @param nombre El nombre del programa de televisión
     * @param cadena La cadena a la que pertenece el programa
     * @param nombreDirector El nombre del director del programa
     * @see Empleado#Empleado(String, String, Empleado)
     * @see Cadena#agregarPrograma(Programa)
     */
    public Programa(String nombre, Cadena cadena, String nombreDirector) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;

        this.director = new Empleado(nombreDirector, "director", null);
        this.listaEmpleado.add(this.director);

        if (cadena != null) {
            cadena.agregarPrograma(this);
        }
    }
    /**
     * Añade un nuevo empleado al programa.
     * Si el cargo no es director, asigna automáticamente el director del programa.
     *
     * @param nombre El nombre del empleado
     * @param cargo El cargo del empleado (director, técnico, presentador, colaborador)
     * @param director El director del empleado (null si el empleado es director)
     * @see Empleado#Empleado(String, String, Empleado)
     */
    public void añadirEmpleado(String nombre, String cargo, Empleado director) {
        if (!cargo.equalsIgnoreCase("director")) {
            director = this.director;
        }
        Empleado nuevoEmpleado = new Empleado(nombre, cargo, director);
        listaEmpleado.add(nuevoEmpleado);
    }
    /**
     * Elimina un empleado de la lista de empleados del programa.
     *
     * @param empleado El empleado a eliminar
     */
    public void eliminarEmpleado(Empleado empleado) {
        listaEmpleado.remove(empleado);
    }
    /**
     * Añade un nuevo invitado al programa solicitando datos por teclado.
     *
     * @param nombre El nombre del invitado
     * @param profesion La profesión del invitado
     * @param temporada La temporada en la que participa el invitado
     * @see Invitado#Invitado(String, String, int)
     */
    public void añadirInvitado(String nombre, String profesion, int temporada) {
        Invitado nuevoInvitado = new Invitado(nombre, profesion, temporada);
        listaInvitado.add(nuevoInvitado);
    }
    /**
     * Elimina un invitado de la lista de invitados del programa.
     *
     * @param invitado El invitado a eliminar
     */
    public void eliminarInvitado(Invitado invitado) {
        listaInvitado.remove(invitado);
    }
    /**
     * Obtiene el nombre del programa.
     *
     * @return El nombre del programa de televisión
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre del programa.
     *
     * @param nombre El nuevo nombre del programa
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene la cadena a la que pertenece el programa.
     *
     * @return La cadena de televisión asociada
     */
    public Cadena getCadena() {
        return cadena;
    }
    /**
     * Establece la cadena del programa y actualiza las relaciones bidireccionales.
     * Elimina el programa de la cadena anterior y lo agrega a la nueva.
     *
     * @param cadena La nueva cadena de televisión
     * @see Cadena#eliminarPrograma(Programa)
     * @see Cadena#agregarPrograma(Programa)
     */
    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
        if (this.cadena != null) {
            this.cadena.eliminarPrograma(this);
        }
        this.cadena = cadena;

        if (cadena != null) {
            cadena.agregarPrograma(this);
        }
    }
    /**
     * Muestra por pantalla los invitados de una temporada específica.
     * Incluye el nombre, profesión y total de invitados.
     *
     * @param temporada El número de temporada a consultar
     * @see Invitado#getTemporada()
     * @see Invitado#getNombre()
     * @see Invitado#getProfesion()
     */
    public void invitadosTemporada(int temporada) {
        int contador = 0;

        System.out.println("Invitados de la temporada " + temporada );

        for (Invitado invitado : listaInvitado) {
            if (invitado.getTemporada() == temporada) {
                contador++;
                System.out.println("- " + invitado.getNombre() + " (" + invitado.getProfesion() + ")");
            }
        }

        System.out.println("Total de invitados en temporada " + temporada + ": " + contador);
    }
    /**
     * Cuenta las veces que un invitado ha participado en el programa.
     * La búsqueda no distingue entre mayúsculas y minúsculas.
     *
     * @param nombre El nombre del invitado a buscar
     * @return El número de veces que el invitado ha participado
     * @see #rastrearInvitado(String)
     * @see #buscarInvitado(String)
     */
    public int vecesInvitado(String nombre) {
        int veces = 0;

        for (Invitado invitado : listaInvitado) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                veces++;
            }
        }

        return veces;
    }
    /**
     * Rastrea un invitado mostrando todas sus visitas al programa.
     * Muestra el número total de visitas y los detalles de cada una.
     *
     * @param nombre El nombre del invitado a rastrear
     * @see #vecesInvitado(String)
     * @see Invitado#getFecha_visita()
     * @see Invitado#getTemporada()
     */
    public void rastrearInvitado(String nombre) {
        int veces = vecesInvitado(nombre);

        System.out.println("Rastreo de " + nombre);
        System.out.println("Ha visitado el programa " + veces + " veces");

        if (veces > 0) {
            System.out.println("Detalles de las visitas:");
            for (Invitado invitado : listaInvitado) {
                if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("- Fecha: " + invitado.getFecha_visita() +
                            ", Temporada: " + invitado.getTemporada());
                }
            }
        } else {
            System.out.println(nombre + " no ha visitado el programa.");
        }
    }
    /**
     * Busca si un invitado ha participado alguna vez en el programa.
     * La búsqueda no distingue entre mayúsculas y minúsculas.
     *
     * @param nombre El nombre del invitado a buscar
     * @return true si el invitado ha participado, false en caso contrario
     * @see #vecesInvitado(String)
     * @see #rastrearInvitado(String)
     */
    public boolean buscarInvitado(String nombre) {
        for (Invitado invitado : listaInvitado) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Obtiene el número de temporadas del programa.
     *
     * @return El número de temporadas
     */
    public int getTemporadas() {
        return temporadas;
    }
    /**
     * Establece el número de temporadas del programa.
     *
     * @param temporadas El nuevo número de temporadas
     */
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    /**
     * Obtiene la lista de empleados del programa.
     *
     * @return ArrayList con los empleados del programa
     * @see Empleado
     */
    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }
    /**
     * Establece la lista completa de empleados del programa.
     *
     * @param listaEmpleado La nueva lista de empleados
     */
    public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }
    /**
     * Obtiene la lista de invitados del programa.
     *
     * @return ArrayList con los invitados del programa
     * @see Invitado
     */
    public ArrayList<Invitado> getListaInvitado() {
        return listaInvitado;
    }
    /**
     * Establece la lista completa de invitados del programa.
     *
     * @param listaInvitado La nueva lista de invitados
     */
    public void setListaInvitado(ArrayList<Invitado> listaInvitado) {
        this.listaInvitado = listaInvitado;
    }
    /**
     * Obtiene el director del programa.
     *
     * @return El empleado que es director del programa
     * @see Empleado
     */
    public Empleado getDirector() {
        return director;
    }
    /**
     * Establece el director del programa.
     *
     * @param director El nuevo director del programa
     */
    public void setDirector(Empleado director) {
        this.director = director;
    }
    /**
     * Devuelve una representación en cadena de la información del programa.
     * Incluye nombre, cadena, temporadas, director y conteos de empleados e invitados.
     *
     * @return String con la información formateada del programa
     */
    @Override
    public String toString() {
        String nombreCadena = (cadena != null) ? cadena.getNombre() : "Sin cadena";
        return "Programa: " + nombre + "\n" +
                "Cadena: " + nombreCadena + "\n" +
                "Temporadas: " + temporadas + "\n" +
                "Director: " + director.getNombre() + "\n" +
                "Empleados: " + listaEmpleado.size() + "\n" +
                "Invitados: " + listaInvitado.size() + "\n";
    }
}
