public class Profesor extends persona{
    private String IdProfesor;
    public Profesor(){ super();
    IdProfesor = "Unknow";}
    public Profesor(String nombre, String apellidos, int edad){
    super(nombre, apellidos, edad);
    IdProfesor="Unknow"; }
    public void setIdProfesor (String IdProfesor){ this.IdProfesor = IdProfesor; }
    public String getIdProfesor(){return IdProfesor; }
    public void MostrarDatos(){
        System.out.println("Datos Profesor.Profesor de Nombre: "+getNombre()+" "+getApellidos()+" con Id de profesor: "+getIdProfesor());}
    }
