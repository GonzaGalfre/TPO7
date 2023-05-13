package com.mycompany.tp7;

public class Materia {
    Integer idMateria;
    String nombre;
    Integer anio;

    public Materia(Integer idMateria, String nombre, Integer anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
}
