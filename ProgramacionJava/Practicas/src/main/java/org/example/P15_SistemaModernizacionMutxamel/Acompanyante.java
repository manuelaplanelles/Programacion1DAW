package org.example.P15_SistemaModernizacionMutxamel;

public class Acompanyante extends MutxamelFC {
    private Jugador integrante;
    private String parentesco;

     public Acompanyante(String nombre, int edad, Jugador integrante,String parentesco){
         super(nombre,edad);
         this.integrante=integrante;
         this.parentesco=parentesco;
     }
     public void animarEquipo(){
         System.out.println("¡"+this.parentesco+" de " + integrante + " animando al equipo! ¡VAMOS MUTXAMEL!");
     }


    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }


    @Override
    public void concentrarse() {
        System.out.println(this.getNombre() + " se ha ido a compañar al equipo a la concentración.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println( this.getNombre() + " viaja con el equipo a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("¡GOOOOOOOOOOOL! "+ this.getNombre() +" celebra el gol!");
    }

}
