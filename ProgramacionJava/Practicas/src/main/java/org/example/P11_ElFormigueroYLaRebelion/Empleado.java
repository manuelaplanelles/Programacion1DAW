package org.example.P11_ElFormigueroYLaRebelion;

/**
 * Clase que representa un empleado de un programa de televisión.
 * Gestiona información personal, cargo y relación jerárquica.
 *
 * @author Manuela Planelles Lucas
 * @version 1.0
 * @see Programa
 */
public class Empleado {

    private static int contadorId = 1;
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    /**
     * Genera un identificador único autoincremental con formato EPxxx.
     *
     * @return El identificador generado en formato EP001, EP002, etc.
     */
    private String generarId(){
        String id = String.format("EP%03d", contadorId);
        contadorId++;
        return id;
    }

    /**
     * Constructor de la clase Empleado.
     * Genera automáticamente el ID y valida el cargo.
     * Si el cargo es "director", el atributo director se establece como null.
     *
     * @param nombre El nombre del empleado
     * @param cargo El cargo del empleado (director, técnico, presentador, colaborador)
     * @param director El director del empleado (null si es director)
     * @see #setCargo(String)
     */
    public Empleado(String nombre, String cargo, Empleado director) {
        this.id = generarId();
        this.nombre = nombre;
        setCargo(cargo);

        if (this.cargo.equals("director")) {
            this.director = null;
        } else {
            this.director = director;
        }
    }

    /**
     * Obtiene el contador estático de IDs.
     *
     * @return El valor actual del contador de IDs
     */
    public static int getContadorId() {
        return contadorId;
    }

    /**
     * Establece el valor del contador estático de IDs.
     *
     * @param contadorId El nuevo valor del contador
     */
    public static void setContadorId(int contadorId) {
        Empleado.contadorId = contadorId;
    }

    /**
     * Obtiene el identificador único del empleado.
     *
     * @return El ID del empleado en formato EPxxx
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador del empleado.
     *
     * @param id El nuevo identificador
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del empleado.
     *
     * @return El nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     *
     * @param nombre El nuevo nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el cargo del empleado.
     *
     * @return El cargo del empleado (director, técnico, presentador, colaborador, pte)
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Establece y valida el cargo del empleado.
     * Si el cargo no es válido, se establece como "pte" (pendiente).
     * Cargos válidos: director, técnico, presentador, colaborador.
     *
     * @param cargo El cargo a asignar al empleado
     */
    public void setCargo(String cargo) {
        String[] cargosValidos = {"director", "técnico", "presentador", "colaborador"};
        boolean esValido = false;

        for (String cargoValido : cargosValidos) {
            if (cargoValido.equalsIgnoreCase(cargo)) {
                esValido = true;
                break;
            }
        }
        if (esValido) {
            this.cargo = cargo.toLowerCase();
        } else {
            this.cargo = "pte";
        }
    }

    /**
     * Obtiene el director del empleado.
     *
     * @return El empleado director, o null si el empleado es director
     */
    public Empleado getDirector() {
        return director;
    }

    /**
     * Establece el director del empleado.
     *
     * @param director El nuevo director del empleado
     */
    public void setDirector(Empleado director) {
        this.director = director;
    }

    /**
     * Devuelve una representación en cadena de la información del empleado.
     * Muestra el nombre del director o indica si el empleado es director.
     *
     * @return String con la información formateada del empleado
     */
    @Override
    public String toString() {
        String directorInfo = (director != null) ? director.getNombre() : "Sin director (es director)";
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + directorInfo +
                '}';
    }
}