package org.example.SimulacroMayo26.huelga;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

public class CentroEducativo {
   static Random aleatoreo = new Random();

    private String nombre;
    private int plantillaTotal;
    private double descuentoSalarialDiario;
    private HashSet<Docente> huelguistas;

    public CentroEducativo(String nombre, int plantillaTotal, double descuentoSalarialDiario) {
        this.nombre = nombre;
        this.plantillaTotal = plantillaTotal;
        this.descuentoSalarialDiario = descuentoSalarialDiario;
        huelguistas = new HashSet<>();

    }
    public String generarDniAleatorio(){
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String dni="";
        for (int i=0; i<8; i++){
            dni+=numeros.charAt(aleatoreo.nextInt(numeros.length()));
        }
        dni+= letras.charAt(aleatoreo.nextInt(letras.length()));

        return dni;
    }
    public void generarHuelguistasAleatorios(){
        int cuantos = aleatoreo.nextInt(10)+5;

        for(int i = 0; i<cuantos;i++){
            String dni = generarDniAleatorio();
            int dias = aleatoreo.nextInt(8)+1;
            huelguistas.add(new Docente(dni, dias, EstadoDocente.EN_HUELGA));
        }
    }
    public void mostrarHuelguistasActuales(){
        int contador=0;
        for(Docente docente : huelguistas){
            System.out.println(++contador+" DNI: "+docente.getDni()+ " - días huelga: "
                    +docente.getDiasHuelga()+" - estado: "+docente.getEstado());
        }
    }
    public Docente validarDocente(String dni){return null; }
    public void sortearServiciosMinimos(){}
    public void limpiarRegistro(){}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPlantillaTotal() {
        return plantillaTotal;
    }

    public void setPlantillaTotal(int plantillaTotal) {
        this.plantillaTotal = plantillaTotal;
    }

    public double getDescuentoSalarialDiario() {
        return descuentoSalarialDiario;
    }

    public void setDescuentoSalarialDiario(double descuentoSalarialDiario) {
        this.descuentoSalarialDiario = descuentoSalarialDiario;
    }

    public HashSet<Docente> getHuelguistas() {
        return huelguistas;
    }

    public void setHuelguistas(HashSet<Docente> huelguistas) {
        this.huelguistas = huelguistas;
    }

    @Override
    public String toString() {
        return "CentroEducativo{" +
                "nombre='" + nombre + '\'' +
                ", plantillaTotal=" + plantillaTotal +
                ", descuentoSalarialDiario=" + descuentoSalarialDiario +
                ", huelguistas=" + huelguistas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CentroEducativo that = (CentroEducativo) o;
        return plantillaTotal == that.plantillaTotal && Double.compare(descuentoSalarialDiario, that.descuentoSalarialDiario) == 0 && Objects.equals(nombre, that.nombre) && Objects.equals(huelguistas, that.huelguistas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, plantillaTotal, descuentoSalarialDiario, huelguistas);
    }
}
