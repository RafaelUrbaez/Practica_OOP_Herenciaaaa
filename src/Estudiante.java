public class Estudiante extends Persona {
    private int numeroUnico;

    public Estudiante(String nombre, int numeroUnico) {
        super(nombre);
        this.numeroUnico = numeroUnico;
    }

    public int getNumeroUnico() {
        return numeroUnico;
    }

    public void setNumeroUnico(int numeroUnico) {
        this.numeroUnico = numeroUnico;
    }
}
