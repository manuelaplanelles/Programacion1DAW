package org.example.u06_herencia.RedesSociales;

public class RedSocial {


        public static void main(String[] args) {

          Usuario ana = new Usuario("Ana", 30, "@ana", 231);

            Influencer luis = new Influencer("Luis", 25, "@luis_influencer", 50000);

            luis.agregarColaboracion("MediaMarkt");
            luis.agregarColaboracion("Yoigo");
            luis.agregarColaboracion("Temu");

            Streamer carlos = new Streamer("Carlos", 27, "@carlos_stream", 0, 150, 2000);

            Basico pedro = new Basico("Pedro", 22, "@pedro123", 455);

            System.out.println();
            ana.mostrarInfo();

            System.out.println();
            luis.mostrarInfo();

            System.out.println();
            carlos.mostrarInfo();

            System.out.println();
            pedro.mostrarInfo();

        }
    }
