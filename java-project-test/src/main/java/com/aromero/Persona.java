package com.aromero;

public class Persona {

    private String nombre;
    private Integer ojos = 2;
    private Integer piernas = 2;
    private Integer brazos = 2;
    private transient String profesion;

    public final static String METODO = "METODO";

    public Persona() { }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getOjos() {
        return ojos;
    }

    public void setOjos(Integer ojos) {
        this.ojos = ojos;
    }

    public Integer getPiernas() {
        return piernas;
    }

    public void setPiernas(Integer piernas) {
        if(piernas > 2)
            throw new IllegalArgumentException("No puedes tener mas de 2 piernas");
        this.piernas = piernas;
    }

    public Integer getBrazos() {
        return brazos;
    }

    public void setBrazos(Integer brazos) {
        this.brazos = brazos;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    protected void metodoProtected(){
        System.out.println("metodo Protected");
    }

    public  void cantarPersona() {
        System.out.println("Cantar Persona");
    }

    private void cantarPersona(String cancion) {
        System.out.println("Cantar Persona: " + cancion);
    }

    void cantarPersona(String cancion, Integer duracion) {
        cantarPersona(cancion);
        System.out.println("Cantar Persona: " + cancion + " duarante " + duracion);
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", ojos=" + ojos +
                ", piernas=" + piernas +
                ", brazos=" + brazos +
                ", profesion='" + profesion + '\'' +
                '}';
    }
}
