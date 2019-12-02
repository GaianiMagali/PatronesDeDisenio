package com.Java.Ejercicio5.TiposDeEnvios;

import com.Java.Ejercicio5.TiposDePaquetes.TipoPaquete;

public class Express extends TipoEnvio {

    public Express(TipoPaquete paquete) {
        super(paquete);
    }

    @Override
    protected double costoEnvio(long kms) {
        return Math.pow(kms, 3)*1000;
    }
}
