package org.example.Explicaciones.App;

public enum Estado {
    PENDIENTE(0), ACTIVO(1), ELIMINADO(2);

    private final int codigo;

    Estado(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
