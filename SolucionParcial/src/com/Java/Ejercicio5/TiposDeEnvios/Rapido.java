package com.Java.Ejercicio5.TiposDeEnvios;

import com.Java.Ejercicio5.TiposDePaquetes.TipoPaquete;

public class Rapido extends TipoEnvio {

    public Rapido(TipoPaquete paquete) {
        super(paquete);
    }

    @Override
    protected double costoEnvio(long kms) {
        return Math.pow(kms, 2) + 10000;
    }
}
