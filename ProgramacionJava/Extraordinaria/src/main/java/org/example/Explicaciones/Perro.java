package org.example.Explicaciones;

public class Perro {
    private String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public void ladrar() {                      // de INSTANCIA: usa SU nombre
        System.out.println(nombre + " dice: ¡Guau!");
    }

    public static void describirEspecie() {     // STATIC: info general
        System.out.println("Los perros son mamiferos domesticos.");
    }

    public static void main(String[] args) {
        Perro.describirEspecie();

        Perro perro1 = new Perro("Toby");
        perro1.ladrar();
        System.out.println(perro1.nombre);
    }
}
