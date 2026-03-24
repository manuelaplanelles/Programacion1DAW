package org.example.u05_poo.Imserso;
import java.util.ArrayList;
import java.util.Arrays;
public class AutobusImserso {

    private String matricula;
    private String destino;
    private ArrayList<Abuelo> listaAbuelos;

    public AutobusImserso (String matricula, String destino){
        this.matricula=matricula;
        this.destino=destino;
        listaAbuelos = new ArrayList<>();
    }

    public void insertarAbuelo(Abuelo... abuelo){
        listaAbuelos.addAll(Arrays.asList(abuelo));
    }

    public void borrarAbuelo(Abuelo abuelo){
        listaAbuelos.remove(abuelo);
    }

    public void mostrarPasajeros(){

        System.out.println("Lista de pasajeros del viaje a " + destino + ":");
        for (Abuelo abuelo : listaAbuelos){
            System.out.println("- " + abuelo.getNombre());
        }

    }

    public void mostrarMayores(int edad){

        System.out.println("Pasajeros mayores a " + edad + " años:");

        for (Abuelo abuelo : listaAbuelos){
            if (abuelo.getEdad() >= edad){
                System.out.println("- " + abuelo.getNombre());
            }
        }

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ArrayList<Abuelo> getListaAbuelos() {
        return listaAbuelos;
    }

    public void setListaAbuelos(ArrayList<Abuelo> listaAbuelos) {
        this.listaAbuelos = listaAbuelos;
    }

    @Override
    public String toString() {
        return "AutobusImserso{" +
                "matricula='" + matricula + '\'' +
                ", destino='" + destino + '\'' +
                ", listaAbuelos=" + listaAbuelos +
                '}';
    }

}
