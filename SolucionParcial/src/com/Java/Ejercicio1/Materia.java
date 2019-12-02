package com.Java.Ejercicio1;

public class Materia {
    private static final int semanas_cuatrimestre = 17;
    private int horasSemanales;
    private boolean cuatrimestral;
    private String nombre;

    public Materia(int horasSemanales, boolean cuatrimestral, String nombre) {
        this.horasSemanales = horasSemanales;
    }

    public String getNombre() {
        return nombre;
    }

    public int horaSemanales(){
        return this.horasSemanales;
    }

    public int cantidadHoras(){
        // Horas x 17
        int horasCuatrimestrales = horasSemanales * semanas_cuatrimestre;
        // Pregunta si es cuatrimetral , tambien quiere decir que es semestral
        // Si es cuatrimestral retorna el valor de arriba
        // si no, quiere decir que es anual entonces se lo multiplica por 2
        int horasTotales = this.cuatrimestral ? horasCuatrimestrales : horasCuatrimestrales * 2;
        return horasTotales;
    }
}

