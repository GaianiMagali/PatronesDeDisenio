package com.Java.Ejercicio4.Estados;

import com.Java.Ejercicio4.Television;

public abstract class EstadoTelevision {
    protected Television television;

    public EstadoTelevision(Television television) {
        this.television = television;
    }

    public abstract void encender();
    public abstract void apagar();
    public abstract void subirVolumen(int cantidad);
    public abstract void bajarVolumen(int cantidad);
    public abstract void silenciar();
    public abstract void activarSonido();
}
