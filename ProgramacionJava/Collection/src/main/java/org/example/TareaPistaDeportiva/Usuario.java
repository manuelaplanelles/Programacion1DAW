package org.example.TareaPistaDeportiva;

public class Usuario {
    private String nombre;
    private int id;

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() { return nombre; }
    public int getId() { return id; }

    @Override
    public String toString() {
        return "Usuario{nombre=" + nombre + ", id=" + id + "}";
    }
}
