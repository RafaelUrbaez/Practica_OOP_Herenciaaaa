package Escuela;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    private List<Curso> cursos;
    private int recuentoClases;
    private int recuentoEjercicios;

    public Profesor(String nombre) {
        super(nombre);
        this.cursos = new ArrayList<>();
        this.recuentoClases = 0;
        this.recuentoEjercicios = 0;
    }

    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
        this.recuentoClases++;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public int getRecuentoClases() {
        return recuentoClases;
    }

    public int getRecuentoEjercicios() {
        return recuentoEjercicios;
    }

    public void incrementarEjercicios() {
        this.recuentoEjercicios++;
    }
}