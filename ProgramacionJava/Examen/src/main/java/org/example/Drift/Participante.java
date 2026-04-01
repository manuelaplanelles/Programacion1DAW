package org.example.Drift;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@ToString
public abstract class Participante {

    static Scanner teclado = new Scanner(System.in);

    private String nombre;
    private String pais;

    public Participante(){
        System.out.println("\nInscribiendo participante...");
        setNombre();
        setPais();
    }

    public void setNombre(){
        System.out.println("Nombre: ");
        nombre = teclado.nextLine();
    }

    public void setPais(){
        System.out.println("País: ");
        pais = teclado.nextLine();
    }


}
