public class persona {
    private String nombre; private String apellidos; private int edad;
    public persona(){nombre = "";apellidos = "";edad = 0;}
    public persona (String nombre,String apellidos,int edad){
        this.nombre = nombre;this.apellidos =apellidos;this.edad = edad;}
    public String getNombre(){return nombre;}
    public String getApellidos(){return apellidos;}
    public int getEdad(){return edad;}
}
