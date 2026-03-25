package org.example.P15_SistemaModernizacionMutxamel;

abstract class MutxamelFC implements FuncionesIntegrantes{
    private String nombre;
    private int edad;

    public MutxamelFC(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    @Override
    public void concentrarse() {
        System.out.println(nombre + " se esta concentrando.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(nombre + " viaja a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("¡GOOOOOOOOOOOL! "+ this.nombre +" celebra el gol!");
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "MutxamelFC{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

