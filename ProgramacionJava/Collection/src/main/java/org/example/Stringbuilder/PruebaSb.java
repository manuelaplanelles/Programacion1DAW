package org.example.Stringbuilder;

public class PruebaSb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();     //sirve para modificar constantemente el string, porque si lo haces con string cada cambio ocupa diferente espacio, con este edita el mismo espacio.

        sb.append("Es el vecino ");                     //para escribir
        sb.append(" el que elige ").append(" al alcalde "); //se puede concatenar en la misma linea
        sb.insert(13, " alcalde");  // en la posicion 13 inserta alcalde
        sb.replace(20,25, " vecinos ");     // remplazar lo que hay entre la 20 y la 25 por vecinos
        sb.delete(13,17);           //borrar de la 13 al 17
        System.out.println(sb);
        sb.reverse();               //que lo ponga al reves
        System.out.println(sb);
    }
}
