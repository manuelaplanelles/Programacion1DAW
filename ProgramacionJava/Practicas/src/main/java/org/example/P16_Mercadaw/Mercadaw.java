package org.example.P16_Mercadaw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Mercadaw {

    private static List<Cliente> clientes = new ArrayList<>();

    public Mercadaw() {
        generarClientes();
    }

    public static void generarClientes() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            StringBuilder usuario = new StringBuilder();
            StringBuilder contrasenya = new StringBuilder();
            for (int j = 0; j < 8; j++) {
                usuario.append(caracteres.charAt(random.nextInt(caracteres.length())));
                contrasenya.append(caracteres.charAt(random.nextInt(caracteres.length())));
            }
            clientes.add(new Cliente(usuario.toString(),contrasenya.toString()));
        }
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(List<Cliente> clientes) {
        Mercadaw.clientes = clientes;
    }

}
