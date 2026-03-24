package org.example.P13_LombokInstituto;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import java.util.ArrayList;
import java.util.Objects;

@Getter @ToString
public class Instituto {

    @NonNull
    private final String nombre;
    @Setter
    private String poblacion;

    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Curso> listaCursos;

    public Instituto(String nombre) {
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
        this.listaEstudiantes = new ArrayList<>();
        this.listaCursos = new ArrayList<>();
    }
    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante != null) {
            this.listaEstudiantes.add(estudiante);
        } else {
            System.out.println("No se puede agregar un estudiante nulo.");
        }
    }
    public void agregarCurso(Curso curso) {
        if (curso == null) {
            System.out.println("No se puede agregar un curso nulo.");
            return;
        }
        if (!listaCursos.contains(curso)) {
            this.listaCursos.add(curso);
        } else {
            System.out.println("El curso ya existe en el instituto.");
        }
    }
}
