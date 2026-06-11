package org.example.Simulacro26;

import java.util.Collection;
import java.util.HashSet;

public class CentroEducativo {

    private String nombre;
    private int plantillaTotal;
    private double descuentoSalarialDiario;
    private Collection<Docente> huelguistas = new HashSet<>();

    public CentroEducativo(String nombre, int plantillaTotal, double descuentoSalarialDiario) {
        this.nombre = nombre;
        this.plantillaTotal = plantillaTotal;
        this.descuentoSalarialDiario = descuentoSalarialDiario;
    }
    public void generarHuelguistasAleatorios(){}
    public void mostrarHuelguistasActuales(){}
    public Docente validarDocente(String dni){
        return null;
    }
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

    public Collection<Docente> getHuelguistas() {
        return huelguistas;
    }

    public void setHuelguistas(Collection<Docente> huelguistas) {
        this.huelguistas = huelguistas;
    }

    @Override
    public String toString() {
        return "CentroEducativo: " + nombre +'/'+
                "Plantilla Total=" + plantillaTotal +'/'+
                "Descuento Salarial Diario: " + descuentoSalarialDiario +'/'+
                "Huelguistas: " + huelguistas;
    }
}
