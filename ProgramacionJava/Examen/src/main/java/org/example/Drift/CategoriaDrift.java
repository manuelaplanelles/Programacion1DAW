package org.example.Drift;

public enum CategoriaDrift {

    STREET(50.0), PRO(150.0), HYPER_DRIFT(300.0);

    private double precio;

    CategoriaDrift(double precio){
        this.precio=precio;
    }

    public double getPrecio(){
        return precio;
    }

}
