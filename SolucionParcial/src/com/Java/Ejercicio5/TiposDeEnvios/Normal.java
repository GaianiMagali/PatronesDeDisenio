package com.Java.Ejercicio5.TiposDeEnvios;

import com.Java.Ejercicio5.TiposDePaquetes.TipoPaquete;

public class Normal extends TipoEnvio {

    public Normal(TipoPaquete paquete) {
        super(paquete);
    }

    @Override
    protected double costoEnvio(long kms) {
        return kms*1000;
    }
}
