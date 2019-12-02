package com.Java.Ejercicio2;

/**
 * No se puede modificar
 */

public class Genova {
    private long area;
    private boolean enrollada;

    public void enrollar(long area) {
        this.area +=area;
    }

    public void desenrollar(long area) {
        this.area -=area;
    }


    public void setEnrollada(boolean enrollada) { this.enrollada = enrollada; }

    public boolean getEnrollada() {
        return enrollada;
    }



    public long getArea() {
        return area;
    }
}
