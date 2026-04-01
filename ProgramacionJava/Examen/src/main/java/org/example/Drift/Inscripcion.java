package org.example.Drift;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Scanner;

@Getter
@Setter
@ToString
public class Inscripcion {

    static Scanner teclado = new Scanner(System.in);

    private Piloto piloto;
    private CategoriaDrift categoria;
    private boolean pagado;

    public Inscripcion(Piloto piloto){
        this.piloto=piloto;
        setCategoria();
        pagado=false;
        System.out.println("Piloto " + piloto.getNombre() + " inscrito en " + categoria.name() + ". Pendiente de pago: " + categoria.getPrecio() + "€");
    }

    public void setCategoria(){

        while(true){
            System.out.println("Elige una categoria " + Arrays.toString(CategoriaDrift.values()) + ": ");
            try{
                categoria = CategoriaDrift.valueOf(teclado.next());
                break;
            }catch(Exception e){
                System.out.println("Categoría incorrecta. Elige una existente.");
            }
        }

    }

}
