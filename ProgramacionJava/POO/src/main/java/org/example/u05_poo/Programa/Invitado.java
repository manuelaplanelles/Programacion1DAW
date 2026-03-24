package org.example.u05_poo.Programa;

import java.time.LocalDate;
import java.util.Scanner;

    public class Invitado {
        private String nombre;
        private String profesion;
        private LocalDate fecha_visita;
        private int temporada;

        public Invitado(String nombre, String profesion, int temporada) {
            this.nombre = nombre;
            this.profesion = profesion;
            this.temporada = temporada;
            // Llamamos al método que pide la fecha como pide el paso 2a
            solicitarFecha();
        }

        private void solicitarFecha() {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce el año de visita para " + nombre + ":");
            int año = teclado.nextInt();
            System.out.println("Introduce el mes:");
            int mes = teclado.nextInt();
            System.out.println("Introduce el día:");
            int dia = teclado.nextInt();
            this.fecha_visita = LocalDate.of(año, mes, dia);
        }

        // Getters y Setters
        public String getNombre() { return nombre; }
        public String getProfesion() { return profesion; }
        public LocalDate getFecha_visita() { return fecha_visita; }
        public int getTemporada() { return temporada; }

        @Override
        public String toString() {
            return "Invitado{nombre='" + nombre + "', profesion='" + profesion + "', fecha_visita=" + fecha_visita + ", temporada=" + temporada + "}";
        }
    }