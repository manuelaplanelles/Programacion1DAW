package org.example.TareaPistaDeportiva;

import java.time.LocalDateTime;

public class Reserva {
    private Usuario usuario;
    private Pista pista;
    private LocalDateTime fechaHora;

    public Reserva(Usuario usuario, Pista pista, LocalDateTime fechaHora) {
        this.usuario = usuario;
        this.pista = pista;
        this.fechaHora = fechaHora;
    }

    public Usuario getUsuario() { return usuario; }
    public Pista getPista() { return pista; }
    public LocalDateTime getFechaHora() { return fechaHora; }

    @Override
    public String toString() {
        return "Reserva{usuario=" + usuario + ", pista=" + pista + ", fechaHora=" + fechaHora + "}";
    }
}
