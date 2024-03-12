package com.patterns;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {

        MySingleton mySingleton = MySingleton.INSTANCIA;
        MySingleton mySingleton2 = MySingleton.INSTANCIA;

        mySingleton.mostrar();
        mySingleton.nombre = "pepe";
        mySingleton2.mostrar();

        // Singleton singleton1 = Singleton.gSingleton();

        // Singleton singleton2 = new Singleton() {

        // };

        // System.out.println(singleton1.getClass());

        // Singleton singleton = Singleton.crearSingleton();

        // singleton.setNombre("Jorge");

        // System.out.println(singleton.getNombre());

        // Singleton singleton2 = Singleton.crearSingleton();
        // System.out.println(singleton2.getNombre());

        // System.out.println(singleton.getNombre());
        // singleton.setNombre("Bruno");

        // singleton = new Singleton();

        // System.out.println(singleton.getNombre());

        // Singleton singleton = Singleton.INSTANCIA;
        // Singleton singleton2 = Singleton.INSTANCIA;

        // singleton.setMiAtributo("hola");
        // System.out.println(singleton.getMiAtributo());
        // System.out.println(singleton2.getMiAtributo());

        // singleton.setMiAtributo("Adios");

        // System.out.println(singleton.getMiAtributo());
        // System.out.println(singleton2.getMiAtributo());

    }
}