package com.patterns;

public enum MySingleton {
    INSTANCIA;

    String nombre = "juan";

    void mostrar() {
        System.out.println(nombre);
    }
}
