package tp7;
import java.util.HashSet;
import java.util.Set;

public class Alumno {
    Integer legajo;
    String apellido;
    String nombre;
    Set<Materia> materias;

    public Alumno(Integer legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias = new HashSet<>();
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

public void agregarMateria(Materia m) throws Exception {
        if (!materias.contains(m)) {
            this.materias.add(m);
        } else {
            throw new Exception();
        }
    }

    public Alumno() {
    }

    public Integer cantidadMaterias() {
        return materias.size();
    }
}
