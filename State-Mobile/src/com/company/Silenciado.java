package com.company;

public class Silenciado implements CelularEstadoAlerta {

    @Override
    public void alerta() {
        System.out.println("Silenciado");
    }
}
