package com.company;

public class Vibrador implements CelularEstadoAlerta {

    @Override
    public void alerta() {
        System.out.println("Vibrador");
    }
}
