package org.example.Explicaciones.App;

public class ElementoTipoB extends Elemento implements Accion{
    private int valor;

    public ElementoTipoB(String id, String nombre, Estado estado, int valor){
        super(id, nombre, estado);
        this.valor=valor;
    }



    @Override
    public void mostrar() {

    }

    @Override
    public void procesar() {

    }

    @Override
    public String toString() {
        return "ElementoTipoB{" +
                "valor=" + valor +
                '}';
    }
}
