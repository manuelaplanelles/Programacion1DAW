package org.example.u05_poo.Programa;

public class AppProgramas {
    public static void main(String[] args) {
        // 1. Crear Cadena
        Cadena antena3 = new Cadena("Antena 3");

        // 2. Crear Programa (Se añade solo a la cadena)
        Programa elHormiguero = new Programa("El Hormiguero", antena3, "Director1");

        // 3. Insertar Empleado
        elHormiguero.insertarEmpleado("Pablo Motos", "presentador", null);

        // 4. Insertar Invitado (Pedirá fecha por consola)
        elHormiguero.insertarInvitado("Aitana", "cantante", 1);

        // 5. Ver resultados
        System.out.println(antena3);
        System.out.println(elHormiguero.getListaEmpleados());
        System.out.println(elHormiguero.getListaInvitados());
    }
}