package org.example.P16_Mercadaw;

import java.util.List;
import java.util.Scanner;

public class AppZonaClientes {

    private static Cliente cliente;
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Mercadaw.generarClientes();
        autenticacion(Mercadaw.getClientes());
    }
    static public void autenticacion(List<Cliente> clientes){
        System.out.println("*** COMPRA ONLINE DE MERCADAW ***");
        for (int intentos = 0; intentos < 3; intentos++) {

            System.out.println("Usuario:");
            String usuarioIntroducido = teclado.next();
            System.out.println("Contraseña:");
            String contrasenyaIntroducido = teclado.next();

            for (Cliente cliente : clientes) {
                if (cliente.getUsuario().equals(usuarioIntroducido) && cliente.getContrasenya().equals(contrasenyaIntroducido)) {
                    System.out.println("Usuaria y contraseña correctas.");
                    iniciarCompra();
                }
            }
            System.out.println("Algo no coincide o no existe! Vuelve a intentarlo...");
        }
        System.out.println("ERROR DE AUTENTICACIÓN.");
    }
    static public void iniciarCompra(){

    }
    static public void imprimirProductos(){

    }
    static public void imprimirDespedida(){

    }
}
