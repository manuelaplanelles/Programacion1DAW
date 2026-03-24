package org.example.u05_poo;

public class clienteApp {
    public static void main(String[] args) {
        cliente cliente1 = new cliente(01, "Manuela", "Planelles", 19);
        cliente cliente2 = new cliente(02,"Maria", "Juan", 16);


       System.out.println(cliente1.getNombre() + " " + cliente2.getApellidos() + " " + cliente1.getId());
        cliente1.setNombre("Rodrigo");
        System.out.println(cliente1.getNombre());

        if (cliente1.mayorEdad()){
            System.out.println("El cliente 1, es mayor de edad.");
        }else{
            System.out.println("No es mayor de edad.");
        }
    }

}
