package org.example.E3_TareasFuncionario;

import java.util.Objects;

public class Informe {
    private int codigo;
    private Descripcion descripcion;

    public Informe(int codigo, Descripcion descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Descripcion descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "codigo=" + codigo +
                ", descripcion=" + descripcion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return codigo == informe.codigo && descripcion == informe.descripcion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descripcion);
    }
}
