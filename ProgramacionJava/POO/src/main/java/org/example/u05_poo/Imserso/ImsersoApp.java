package org.example.u05_poo.Imserso;

public class ImsersoApp {
    static void main() {

        Abuelo pepe = new Abuelo("pepe",83);
        Abuelo marisa = new Abuelo("marisa",68);
        Abuelo juan = new Abuelo("juan",75);
        Abuelo josefina = new Abuelo("fina",100);

        AutobusImserso alsa = new AutobusImserso("1234DFC","MALLORCA");

        alsa.insertarAbuelo(pepe);
        alsa.insertarAbuelo(marisa, juan, josefina);

        System.out.println(alsa.getListaAbuelos());

        alsa.borrarAbuelo(juan);

        System.out.println(alsa.getListaAbuelos());

        alsa.mostrarPasajeros();

        alsa.mostrarMayores(80);







    }
}
