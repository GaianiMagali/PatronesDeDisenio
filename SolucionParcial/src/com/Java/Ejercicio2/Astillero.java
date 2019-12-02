package com.Java.Ejercicio2;

public class Astillero {

    public void probarEnrollar(Vela vela) {
        if (vela.enrrollada()) {
            throw new RuntimeException("Vela enrrollada");
        }
        vela.enrollar();
    }

    public void probarDesenrrollar(Vela vela) {
        if (vela.enrrollada()) {
            throw new RuntimeException("Vela apagado");
        }
        vela.desenrollar();
    }

    public void probarEnrrolladoParcial(Vela vela, long superficie) {
        if (vela.enrrollada()) {
            throw new RuntimeException("Vela enrrollada");
        }
        vela.enrollar();
        vela.enrollar(superficie);
    }

    public void probarDesenrrolladoParcial(Vela vela, long superficieIncrementada, long superficieDecrementada) {
        if (vela.enrrollada()) {
            throw new RuntimeException("Vela enrrollada");
        }
        vela.enrollar();
        vela.enrollar(superficieIncrementada);
        vela.desenrollar(superficieDecrementada);
    }
}
