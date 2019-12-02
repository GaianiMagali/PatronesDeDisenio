package com.company;

public class Main {

    public static void main(String[] args) {
	    Apagado estadoInicial = new Apagado();

	    TV tv = new TV(estadoInicial);

	    tv.presionarEscendido();

		System.out.println("Estado actual:");
		System.out.println(tv.getEstado());
    }
}
