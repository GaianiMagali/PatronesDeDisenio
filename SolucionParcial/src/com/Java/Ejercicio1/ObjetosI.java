package com.Java.Ejercicio1;

public class ObjetosI extends Materia {

    public ObjetosI(int horasSemanales, boolean cuatrimestral, String nombre) {
        super(horasSemanales, cuatrimestral, nombre);
    }

    public boolean cuatrimestral(){
        return true;
    }
}
