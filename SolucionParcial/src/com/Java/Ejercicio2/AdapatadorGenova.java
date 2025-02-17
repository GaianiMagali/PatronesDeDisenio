package com.Java.Ejercicio2;

public class AdapatadorGenova implements Vela{
    private Genova genova;

    public AdapatadorGenova(Genova genova) {
        this.genova = genova;
    }

    @Override
    public boolean enrrollada() {
        return genova.getEnrollada();
    }


    @Override
    public long superficie() {
        return genova.getArea();
    }

    @Override
    public void enrollar() {
        genova.enrollar(genova.getArea());
        genova.setEnrollada(true);
    }

    @Override
    public void desenrollar() {
        genova.desenrollar(genova.getArea());
        genova.setEnrollada(false);
    }

    @Override
    public void enrollar(long superficie) {
        genova.enrollar(superficie);
    }

    @Override
    public void desenrollar(long superficie) {
        genova.desenrollar(superficie);
    }
}
