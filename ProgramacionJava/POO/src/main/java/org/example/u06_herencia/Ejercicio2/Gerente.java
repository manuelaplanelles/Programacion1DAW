package org.example.u06_herencia.Ejercicio2;

public class Gerente extends Empleados {
    @Override
    public void realizarTarea(){
        System.out.println("Supervisando el proyecto y organizando reuniones.");
    }
}
