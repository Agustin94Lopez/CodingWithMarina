package herenciaSimpleActividad;

public class Estudiante extends Persona{

    private String Curso;
    private String asignaturas;
    private String Escuela;
    private float notas;

    public String getCurso() {
        return Curso;
    }
    public void setCurso(String curso) {
         Curso = curso;
    }

    public String getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String getEscuela() {
        return Escuela;
    }

    public void setEscuela(String escuela) {
        Escuela = escuela;
    }

    public float getNotas() {
        return notas;
    }

    public void setNotas(float notas) {
        this.notas = notas;
    }
}

