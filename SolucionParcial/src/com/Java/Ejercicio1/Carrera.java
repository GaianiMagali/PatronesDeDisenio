package com.Java.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String nombre;
    private List<Materia> materias = new ArrayList<>();


    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materia materia) {
        this.materias.add(materia);
    }

    public int cargaHoraria() {
        return materias.stream().mapToInt(materia -> materia.cantidadHoras()).sum();

    }
}
