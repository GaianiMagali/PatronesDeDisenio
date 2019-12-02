package com.Java.Ejercicio5.TiposDeEnvios;

import com.Java.Ejercicio5.TiposDePaquetes.TipoPaquete;

public abstract class TipoEnvio {
    private final TipoPaquete paquete;

    public TipoEnvio(TipoPaquete paquete) {
        this.paquete = paquete;
    }

    public double costo(long kms) {
        return costoEnvio(kms) + paquete.costo();
    }

    protected abstract double costoEnvio(long kms);

}
