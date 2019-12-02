package com.Java.Ejercicio1;

public class Matematica extends Materia {

    public Matematica(int horasSemanales, boolean cuatrimestral, String nombre) {
        super(horasSemanales, cuatrimestral, nombre);
    }

    public boolean semestral(){
        return true;
    }
}
