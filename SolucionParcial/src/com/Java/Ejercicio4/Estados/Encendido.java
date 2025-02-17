package com.Java.Ejercicio4.Estados;

import com.Java.Ejercicio4.Television;

public class Encendido extends EstadoTelevision {

    public Encendido(Television television) {
        super(television);
    }

    @Override
    public void encender() {
        System.out.println("TV encendida");
    }

    @Override
    public void apagar() {
        television.setEstadoApagado();
    }

    @Override
    public void subirVolumen(int cantidad) {
        if (television.getNivelVolumen() < Television.VOLUMEN_MAXIMO) {
            television.setNivelVolumen(television.getNivelVolumen() + cantidad);;
            if (television.getNivelVolumen() > Television.VOLUMEN_MAXIMO)
                television.setNivelVolumen(Television.VOLUMEN_MAXIMO);
        } else {
            System.out.println("TV volumen máximo");
        }
    }

    @Override
    public void bajarVolumen(int cantidad) {
        if (television.getNivelVolumen() > Television.VOLUMEN_MINIMO) {
            television.setNivelVolumen(television.getNivelVolumen() - cantidad);;
            if (television.getNivelVolumen() < Television.VOLUMEN_MINIMO)
                television.setNivelVolumen(Television.VOLUMEN_MINIMO);
        } else {
            System.out.println("TV volumen mínimo");
        }
    }

    @Override
    public void silenciar() {
        television.setEstadoSilenciado();
    }

    @Override
    public void activarSonido() {
        television.setEstadoEncendido();
    }

    @Override
    public String toString() {
        return "Encendido";
    }
}
