package com.aromero;

public abstract class ClaseAbstracta {

    volatile int numero;

    transient  int trans = 1;

    public ClaseAbstracta() {

    }

    public abstract void metodoAbstracto();

    public synchronized void metodoConcreto(int num) {
        numero += num;
    }
}
