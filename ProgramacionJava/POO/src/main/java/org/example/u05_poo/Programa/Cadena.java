package org.example.u05_poo.Programa;

import java.util.ArrayList;

    public class Cadena {
        private String nombre;
        private ArrayList<Programa> listaProgramas;

        public Cadena(String nombre) {
            this.nombre = nombre;
            // Se crea la lista vacía por defecto como dice el paso 1
            this.listaProgramas = new ArrayList<>();
        }

        // Método para añadir programas a la lista de la cadena
        public void agregarPrograma(Programa p) {
            this.listaProgramas.add(p);
        }

        // Getters y Setters
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
        public ArrayList<Programa> getListaProgramas() { return listaProgramas; }

        @Override
        public String toString() {
            return "Cadena [nombre=" + nombre + ", listaProgramas=" + listaProgramas + "]";
        }
    }
