package com.company;

public class Encendido extends RemoteControl {

    @Override
    public void presionarEscendido(TV tv) {
        System.out.println("Estoy encendido.Estoy apagado ahora");
        tv.setEstado(new Apagado());
    }

    @Override
    public String toString() {
        return "Encendido";
    }
}
