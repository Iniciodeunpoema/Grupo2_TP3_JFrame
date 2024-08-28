
package tp3_jframe;

public class Alumno {
    private int matricula;
    private String apellido, nombre;

    public Alumno(int matricula, String apellido, String nombre) {
        this.matricula = matricula;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "matricula=" + matricula + ", apellido=" + apellido + ", nombre=" + nombre + '}';
    }
    
}
