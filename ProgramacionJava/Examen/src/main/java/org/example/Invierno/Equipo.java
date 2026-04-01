package org.example.Invierno;

import java.util.ArrayList;

public class Equipo {

    private String pais;
    private ArrayList<Deportista> listaDeportistas;

    public Equipo (){
        listaDeportistas = new ArrayList<>();
    }

    public Equipo (String pais){
        this.pais=pais;
        listaDeportistas = new ArrayList<>();
    }

    public void inscribirDeportista(Deportista deportista){
        listaDeportistas.add(deportista);
        deportista.setEquipo(this);
    }

    public int medallasTotales(){

        int medallas = 0;

        for (Deportista deportista :  listaDeportistas){
            medallas += deportista.getMedallas();
        }

        return medallas;
    }

    public void verMedallero(){

        System.out.println("\n Deportistas que han conseguido medallas para " + pais);

        for (Deportista deportista : listaDeportistas){
            if (deportista.getMedallas()!=0){
                System.out.println("- " + deportista.getNombre() + " con " + deportista.getMedallas() + " medallas.");
            }
        }

    }

    public Deportista deportistaTOP(){

        Deportista top = listaDeportistas.get(0);

        for (Deportista deportista : listaDeportistas){
            if (deportista.getMedallas()>top.getMedallas()){
                top = deportista;
            }
        }

        return top;

    }

    public void verMedallasDeportista(Deportista deportista){

        if (listaDeportistas.contains(deportista)){
            if (deportista.getMedallas()==0){
                System.out.println("\n El deportista " + deportista.getNombre() + " de " + pais + " no ha ganado ninguna medalla durante estos JJOO.");
            }else{
                System.out.println("\n El deportista " + deportista.getNombre() +  " ha ganado " + deportista.getMedallas() + " medallas.");
            }
        }else{
            System.out.println("\n El deportista " + deportista.getNombre() + " no pertenece al equipo de " + pais);
        }

    }

    public Deportista deportistaMasJoven(){

        Deportista joven = listaDeportistas.get(0);

        for (Deportista deportista : listaDeportistas){
            if (joven.getFecha_nacimiento().isBefore(deportista.getFecha_nacimiento())){
                joven = deportista;
            }
        }

        return joven;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Deportista> getListaDeportistas() {
        return listaDeportistas;
    }

    public void setListaDeportistas(ArrayList<Deportista> listaDeportistas) {
        this.listaDeportistas = listaDeportistas;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "pais='" + pais + '\'' +
                ", listaDeportistas=" + listaDeportistas +
                '}';
    }

}
