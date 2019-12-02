package com.Java.Ejercicio5;

import com.Java.Ejercicio5.TiposDeEnvios.TipoEnvio;

public class EnvioYa {

    public double calculoCostoEnvio(TipoEnvio tipoEnvio, long kms) {
       return tipoEnvio.costo(kms);
    }
}
