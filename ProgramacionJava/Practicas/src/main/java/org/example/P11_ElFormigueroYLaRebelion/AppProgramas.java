package org.example.P11_ElFormigueroYLaRebelion;

public class AppProgramas {
    public static void main(String[] args) {
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);

        Programa el_hormiguero = new Programa("El Hormiguero", antena3, "Director1");
        System.out.println(el_hormiguero);
        System.out.println(antena3);

        el_hormiguero.añadirEmpleado("Pablo Motos", "presentador", null);
        System.out.println(el_hormiguero);

        System.out.println(el_hormiguero.getListaEmpleado());

        el_hormiguero.añadirInvitado("Aitana", "cantante", 1);

        System.out.println(el_hormiguero.getListaInvitado());
    }
}
