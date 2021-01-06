package com.aromero;

public class InicializarClase {

    static {
        System.out.println("Bloque static");
    }

    {
        System.out.println("Bloque instance");
    }

    public InicializarClase() {
        System.out.println("Bloque constructor");
    }

    public void imprime(int numero) {
        System.out.println("int" + numero);
    }

    public void imprime(Integer numero) {
        System.out.println("Integer" + numero);
    }

    public void imprime(Number numero) {

    }

    public void imprime(Double numero) {

    }

    public void imprime(Float numero) {

    }

    public void imprime(Object numero) {

    }
}
