package com.aromero;

public class Mecanico extends Persona {
    public void repararAuto(){
        System.out.println("Reparar Auto");

        metodoProtected();
    }

    @Override
    public void cantarPersona() {
        super.cantarPersona();
        System.out.println("Cantar Mecanico");
    }

    public void cantarPersona(String cancion) {
        System.out.println("Cantar Mecanico: " + cancion);
    }

    public void cantarPersona(String cancion, Integer duracion) {
        System.out.println("Cantar Mecanico: " + cancion + " duarante " + duracion);
    }
}
