import java.util.ArrayList;
import java.util.List;

public class Clase {
    private String identificador;
    private List<Estudiante> estudiantes;
    private List<Profesor> profesores;

    public Clase(String identificador) {
        this.identificador = identificador;
        this.estudiantes = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    public String getIdentificador() {
        return identificador;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    public void agregarProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }
}
