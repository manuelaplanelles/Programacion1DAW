package org.example.P13_LombokInstituto;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
@Getter @Setter
@ToString
public class Curso {

    @NonNull
    private String nombre;
    private int horas;

    @Override
    public boolean equals(Object otroCurso) {
        if (this == otroCurso) return true;
        if (otroCurso == null || getClass() != otroCurso.getClass()) return false;
        Curso curso = (Curso) otroCurso;
        return horas == curso.horas && nombre.equals(curso.nombre);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nombre, horas);
    }
}
