public class Main {
    public static void main(String[] args) {
        // instancias de Estudiantes
        Estudiante estudiante1 = new Estudiante("Ana García", 1);
        Estudiante estudiante2 = new Estudiante("Juan Pérez", 2);

        // instancias de Profesores
        Profesor profesor1 = new Profesor("Dr. Carlos López");
        Profesor profesor2 = new Profesor("Dra. Marta Jiménez");

        // instancia de Curso
        Curso curso1 = new Curso("Matemáticas");
        Curso curso2 = new Curso("Historia");

        // Agregar los profesores a los cursos
        curso1.agregarProfesor(profesor1);
        curso2.agregarProfesor(profesor2);

        // Agregar los cursos a los profesores
        profesor1.agregarCurso(curso1);
        profesor2.agregarCurso(curso2);

        // Crear una instancia de Clase
        Clase clase1 = new Clase("6to D");

        // Agregar estudiantes a la clase
        clase1.agregarEstudiante(estudiante1);
        clase1.agregarEstudiante(estudiante2);

        // Agregar profesores a la clase
        clase1.agregarProfesor(profesor1);
        clase1.agregarProfesor(profesor2);

        // Imprimir información sobre la clase
        System.out.println("Identificador de la clase: " + clase1.getIdentificador());
        System.out.println("\nEstudiantes en la clase:");

        for (Estudiante estudiante : clase1.getEstudiantes()) {
            System.out.println(" - " + estudiante.getNombre() + " (Número Único: " + estudiante.getNumeroUnico() + ")");
        }

        System.out.println("\nProfesores en la clase:");
        for (Profesor profesor : clase1.getProfesores()) {
            System.out.println(" - " + profesor.getNombre() + " (Recuento de clases: " + profesor.getRecuentoClases() + ")");
        }

        // Imprimir información sobre los cursos
        System.out.println("\nCursos impartidos por los profesores:");
        for (Curso curso : profesor1.getCursos()) {
            System.out.println(" - " + curso.getNombreUnico() + " impartido por " + profesor1.getNombre());
        }
        for (Curso curso : profesor2.getCursos()) {
            System.out.println(" - " + curso.getNombreUnico() + " impartido por " + profesor2.getNombre());
        }
    }
}
