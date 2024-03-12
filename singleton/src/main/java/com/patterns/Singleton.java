package com.patterns;

// public abstract class Singleton {

//     private static Singleton singleton;

//     static {
//         singleton = new Singleton() {
//             private String saludo;

//             public String string() {
//                 return saludo;
//             }

//             public void setString(String string) {
//                 this.saludo = string;
//             }
//         };
//     }

//     public static Singleton gSingleton() {
//         return singleton;
//     }

// }

public enum Singleton {
    INSTANCIA;

    // Aquí puedes agregar tus métodos de instancia.
    public void miMetodo() {
        // ...
    }

    // También puedes tener atributos de instancia.
    private Object miAtributo;

    // Métodos para trabajar con los atributos, etc.
    public void setMiAtributo(Object valor) {
        this.miAtributo = valor;
    }

    public Object getMiAtributo() {
        return miAtributo;
    }
}