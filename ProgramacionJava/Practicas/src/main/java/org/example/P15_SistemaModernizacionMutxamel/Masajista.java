package org.example.P15_SistemaModernizacionMutxamel;

public class Masajista extends MutxamelFC{
    private String titulacion;
    private int anyosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anyosExperiencia){
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anyosExperiencia=anyosExperiencia;
    }



    public void darMasaje(Jugador jugador){
        System.out.println("El masajista " + this.getNombre() + " esta dando un masaje al jugador " + jugador.getNombre());
    }


    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }



    @Override
    public void concentrarse() {
        System.out.println("El masajista " + this.getNombre() + " se ha ido a la concentracion con el equipo.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista " + this.getNombre() + " acompaña al equipo en el viaje a " + ciudad + " para el partido.");
    }

    @Override
    public void celebrarGol() {
        System.out.println("¡GOOOOOOOOOOOL! "+ this.getNombre() +" celebra el gol!");
    }
}
