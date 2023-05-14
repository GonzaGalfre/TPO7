package tp7;

import java.util.ArrayList;
import java.util.List;

public class Colegio {
    
    //private HashMap<String, Cliente> registro = new HashMap<String, Cliente>();
    private List <Materia> listMaterias=new ArrayList();
    private List <Alumno> listAlumnos=new ArrayList();

    public void agregarMateria(Materia materia){
       listMaterias.add(materia);
   }
   public void agregarAlumno(Alumno alumno){
       listAlumnos.add(alumno);
   }
   public void agregarMateriaAAlumno(Alumno alumno, Materia materia) throws Exception{
       alumno.agregarMateria(materia);
   }
   public Integer cantidadMaterias(Alumno alumno){
       return alumno.cantidadMaterias();
   }

    public List<Materia> getListMaterias() {
        return listMaterias;
    }

    public List<Alumno> getListAlumnos() {
        return listAlumnos;
    }
    
    public List<String> nombresAlumnos(){
       List<String> nombres = new ArrayList();
       listAlumnos.forEach((alumno) -> {
           nombres.add(alumno.getNombre());
       });
       return nombres;
   }
    public List<String> nombresMaterias(){
       List<String> nombres = new ArrayList();
       listMaterias.forEach((materia)-> {
          nombres.add(materia.getNombre()); 
       });
       return nombres;
   }
    
    public Materia buscarMateria(String materia){
       Materia result = new Materia();
       for(Materia m : listMaterias){
           if(m.getNombre().equals(materia)){
               result = m;
               break;
           }
       }
       return result;
   }
   public Alumno buscarAlumno(String alumno) {
       Alumno result = new Alumno();
       for(Alumno a : listAlumnos) {
           if(a.getNombre().equals(alumno)){
               result = a;
               break;
           }
       }
       return result;
   }
}