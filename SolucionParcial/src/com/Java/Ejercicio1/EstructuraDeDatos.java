package com.Java.Ejercicio1;

public class EstructuraDeDatos extends Materia {

    public EstructuraDeDatos(int horasSemanales, boolean cuatrimestral, String nombre) {
        super(horasSemanales, cuatrimestral, nombre);
    }

    public boolean semestral(){
        return true;
    }
}
