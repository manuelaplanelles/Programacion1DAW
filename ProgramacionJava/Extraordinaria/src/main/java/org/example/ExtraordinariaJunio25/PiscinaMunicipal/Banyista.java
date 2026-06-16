package org.example.ExtraordinariaJunio25.PiscinaMunicipal;

import java.util.Objects;
import java.util.Scanner;

public abstract class Banyista {
    static private Integer contador = 0;
    private Integer numero;
     private String nombre;
     private int edad;
     private TipoUsuario tipo;

    public Banyista(String nombre, int edad, TipoUsuario tipo) {
        contador++;
        this.numero = contador;
        this.nombre = nombre;
        this.tipo = tipo;
        setEdad(edad);

    }

    abstract void pagar();

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad)  {
        Scanner teclado = new Scanner(System.in);
        while (edad<0) {
            System.out.println("ERROR. No puede insertar bañistas que no han nacido.");
            edad = teclado.nextInt();
        }
        this.edad = edad;

    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Banyista: " +
                "Numero: " + numero +
                ", Nombre: " + nombre + '\'' +
                ", Edad: " + edad +
                ", Tipo: " + tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Banyista banyista = (Banyista) o;
        return Objects.equals(numero, banyista.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }
}
