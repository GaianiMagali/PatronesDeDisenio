package com.Java.Ejercicio1;

public class Intro extends Materia {

    public Intro(int horasSemanales, boolean cuatrimestral, String nombre) {
        super(horasSemanales, cuatrimestral, nombre);
    }

    public boolean anual(){
        return true;
    }
}
