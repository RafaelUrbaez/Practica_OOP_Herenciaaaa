package Escuela;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombreUnico;
    private List<Profesor> profesores;

    public Curso(String nombreUnico) {
        this.nombreUnico = nombreUnico;
        this.profesores = new ArrayList<>();
    }

    public String getNombreUnico() {
        return nombreUnico;
    }

    public void setNombreUnico(String nombreUnico) {
        this.nombreUnico = nombreUnico;
    }

    public void agregarProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }
}
