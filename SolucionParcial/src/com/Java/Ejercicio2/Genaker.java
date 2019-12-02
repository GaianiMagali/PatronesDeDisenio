package com.Java.Ejercicio2;

public class Genaker implements Vela {
    private long superficie;
    private boolean arrancado;

    public void enrollar() {
        arrancado = true;
    }

    public void desenrollar() {
        arrancado = false;
    }

    public void enrollar(long superficie) {
        this.superficie +=superficie;
    }

    public void desenrollar(long superficie) {
        this.superficie -=superficie;
    }

    public boolean enrrollada() {
        return arrancado;
    }

    public long superficie() {
        return superficie;
    }
}
