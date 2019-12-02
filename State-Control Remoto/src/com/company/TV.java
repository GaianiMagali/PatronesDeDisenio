package com.company;

public class TV {
    private RemoteControl estado;

    public RemoteControl getEstado(){
        return estado;
    }

    public void setEstado(RemoteControl estado) {
        this.estado = estado;
    }

    public TV(RemoteControl estado){
        this.estado = estado;
    }

    public void presionarEscendido(){
        estado.presionarEscendido(this);
    }

}
