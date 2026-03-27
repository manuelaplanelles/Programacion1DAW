package org.example.LambdaStrams;
@FunctionalInterface
public interface VerificadorVoto {
    boolean puedeVotar(String nombre, int edad);
}
