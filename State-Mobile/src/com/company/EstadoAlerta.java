package com.company;

public class EstadoAlerta {
    private CelularEstadoAlerta celularEstadoAlerta;

    public EstadoAlerta(){
        celularEstadoAlerta = new Vibrador();
    }

    public void setEstado(CelularEstadoAlerta estado){
        celularEstadoAlerta = estado;
    }

    public void alerta(){
        celularEstadoAlerta.alerta();
    }
}
