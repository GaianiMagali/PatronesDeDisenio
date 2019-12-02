package com.company;

public class Apagado extends RemoteControl {


    @Override
    public void presionarEscendido(TV tv) {
        System.out.println("Estoy apagado. Encendido ahora");
        tv.setEstado(new Encendido());
    }

    @Override
    public String toString() {
        return "Apagado";
    }
}
