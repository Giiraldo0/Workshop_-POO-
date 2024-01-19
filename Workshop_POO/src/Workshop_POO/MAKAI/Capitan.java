package Workshop_POO.MAKAI;

public class Capitan {
    private String nombre;
    private String apellido;
    private int matriculaNavegacion;

    public Capitan(String nombre, String apellido, int matriculaNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getMatriculaNavegacion() {
        return matriculaNavegacion;
    }

    public void mostarInfoCapitan(){
        System.out.println("Nombre del Capitan: " + nombre + " " + apellido + "\n" +
                "Matricula: " + matriculaNavegacion);
    }
}
