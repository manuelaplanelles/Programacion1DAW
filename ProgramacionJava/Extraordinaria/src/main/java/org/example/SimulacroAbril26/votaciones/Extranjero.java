package org.example.SimulacroAbril26.votaciones;

public class Extranjero extends Votante{
    private String nie;
    private String pais;

    public Extranjero(String poblacion, String nombre, String nie, String pais) {
        super(poblacion, nombre);
        this.nie=nie;
        this.pais=pais;
    }
    public Extranjero(String nie, String pais){
        this.nie=nie;
        this.pais=pais;
    }

    @Override
    public String votar() {             //pregunta
        return "";
    }

    public String getNie() {
        return nie;
    }

    public void setNie(String nie) {
        this.nie = nie;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Extranjero --> NIE:'" + nie + ", pais='" + pais;
    }
}
