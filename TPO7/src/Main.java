public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno(123, "juan", "juan");
        Materia materia = new Materia(1, "matematica", 1);
        alumno.agregarMateria(materia);
        alumno.agregarMateria(materia);
    }
}