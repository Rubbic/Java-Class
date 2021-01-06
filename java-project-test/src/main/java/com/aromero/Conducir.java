package com.aromero;

public abstract interface Conducir {

    public static final String atributo = "atributo";
    public void acelerar();
    public void reversa();
    public void parar();

    default public void encender() {
        System.out.println("Encender auto");
    }

}
