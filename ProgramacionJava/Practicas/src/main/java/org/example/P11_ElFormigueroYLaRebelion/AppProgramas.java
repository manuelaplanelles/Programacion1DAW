package org.example.P11_ElFormigueroYLaRebelion;

public class AppProgramas {
    public static void main(String[] args) {
       /* Empleado director = new Empleado("Director1", "director", null);
        Empleado empleado1 = new Empleado("María García", "actor", director);
        System.out.println(empleado1);
        Empleado empleado2 = new Empleado("Pedro Sánchez", "director", director);
        System.out.println(empleado2);
        Empleado empleado3 = new Empleado("Luis Martínez", "", director);
        System.out.println(empleado3);

        Invitado inv1 = new Invitado("Aitana", "cantante", 1);
        System.out.println(inv1.getNombre());
        System.out.println(inv1.getFecha_visita());
        System.out.println(inv1);

        */

        // Creamos cadena → Antena 3 y comprobamos que donde inicia.
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println("Cadena creada → " + antena3.getNombre());
        System.out.println("Programas iniciales → " + antena3.getListaPrograma().size());
        System.out.println();

        // Creamos programa SIN cadena y añadimos manualmente
        Programa prog1 = new Programa("El Hormiguero", null, "Director1");
        System.out.println("Programa creado sin cadena → " + prog1.getNombre());
        antena3.agregarPrograma(prog1);
        System.out.println("Programa añadido manualmente → programas en cadena: " + antena3.getListaPrograma().size());
        System.out.println();

        // Intentamos añadir el mismo programa
        antena3.agregarPrograma(prog1);
        System.out.println("Intentar añadir duplicado → programas en cadena: " + antena3.getListaPrograma().size());
        System.out.println();

        // Intentamos añadir null
        antena3.agregarPrograma(null);
        System.out.println("Intentar añadir null → programas en cadena: " + antena3.getListaPrograma().size());
        System.out.println();

        // Creamos otro programa y lo añadimos
        Programa prog2 = new Programa("La Rebelión", null, "Director2");
        antena3.agregarPrograma(prog2);
        System.out.println("Segundo programa añadido → programas en cadena: " + antena3.getListaPrograma().size());
        System.out.println();


       // Mostrar la cadena con toString
        System.out.println("--- toString de Cadena ---");
        System.out.println(antena3);

/*
        // Elimnamos un programa
        antena3.eliminarPrograma(prog1);
        System.out.println("Programa eliminado → programas en cadena: " + antena3.getListaPrograma().size());
        System.out.println(antena3);

 */




    }
}
