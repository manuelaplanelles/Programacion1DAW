package org.example.u05_poo.Programa;

public class Empleado {
    private static int contadorEmpleados = 1; // Para el ID autogenerado
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo, Empleado director) {
        // Autogenerar ID (EP001, EP002...)
        this.id = String.format("EP%03d", contadorEmpleados++);
        this.nombre = nombre;

        // Validar cargo según el enunciado
        if (cargo.equals("director") || cargo.equals("técnico") ||
                cargo.equals("presentador") || cargo.equals("colaborador")) {
            this.cargo = cargo;
        } else {
            this.cargo = "pte"; // Valor por defecto si no es válido
        }

        // Si es director, su atributo director es nulo. Si no, apunta al director del programa.
        if (this.cargo.equals("director")) {
            this.director = null;
        } else {
            this.director = director;
        }
    }

    // Getters y Setters básicos
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCargo() { return cargo; }
    public Empleado getDirector() { return director; }

    @Override
    public String toString() {
        return "Empleado{nombre='" + nombre + "', id='" + id + "', cargo='" + cargo + "', director=" + (director != null ? director.getNombre() : "null") + "}";
    }
}
