package com.Java.Ejercicio4.Estados;

import com.Java.Ejercicio4.Television;

public class Silenciado extends EstadoTelevision {

    public Silenciado(Television television) {
        super(television);
    }

    @Override
    public void encender() {
        System.out.println("Ya esta encendida");
    }

    @Override
    public void apagar() {
        television.setEstadoApagado();
    }

    @Override
    public void subirVolumen(int cantidad) {
        System.out.println("TV silenciada");
    }



    @Override
    public void bajarVolumen(int cantidad) {
        System.out.println("TV silenciada");
    }

    @Override
    public void silenciar() {
        System.out.println("TV silenciada");
    }

    @Override
    public void activarSonido() {
        television.setEstadoEncendido();
    }


}
