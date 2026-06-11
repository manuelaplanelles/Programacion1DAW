package org.example.App;

public abstract class Elemento {
    private String id;
    private String nombre;
    private Estado estado;

    public Elemento(String id, String nombre, Estado estado){
        this.id=id;
        this.nombre=nombre;
        this.estado=estado;
    }
    public abstract void mostrar();

    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public Estado getEstado(){
        return estado;
    }
    public void setId(){
    }
    public void setNombre(){
    }
    public void setEstado(Estado estado){
        this.estado=estado;
    }
}