package org.example.ExtraordinariaJunio25.PiscinaMunicipal;

public class Nino extends Banyista{

    private String telefono_contacto_adulto;

    public Nino(String nombre, int edad, TipoUsuario tipo, String telefono_contacto_adulto) {
        super(nombre, edad, tipo);
        this.telefono_contacto_adulto=telefono_contacto_adulto;
    }

    @Override
    void pagar() {
        System.out.println("Niño pagando " + getTipo().getPrecio() + "€");
    }

    public String getTelefono_contacto_adulto() {
        return telefono_contacto_adulto;
    }

    public void setTelefono_contacto_adulto(String telefono_contacto_adulto) {
        this.telefono_contacto_adulto = telefono_contacto_adulto;
    }

    @Override
    public String toString() {
        return "Nino: " +
                "Numero: " + getNumero()+
                ", Nombre: " + getNombre()+
                ", Edad: " + getEdad() +
                ", Tipo Usuario: " + getTipo()+
                ", Telefono contacto adulto: " + telefono_contacto_adulto;
    }
}
