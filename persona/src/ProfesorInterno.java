import java.util.Calendar;
public class ProfesorInterno extends Profesor{
    private Calendar FechaComienzoInterinato;
    public ProfesorInterno(Calendar fechaComienzoInterinato){
        super();
        FechaComienzoInterinato = fechaComienzoInterinato; }
    public ProfesorInterno(String nombre, String apellidos, int edad, Calendar fechaComienzoInterinato){
        super(nombre, apellidos, edad);
        FechaComienzoInterinato = fechaComienzoInterinato; }
        public Calendar getFechaComienzoInterinato(){return FechaComienzoInterinato;}
        public void MostrarDatos(){System.out.println("Datos ProfesorInterno.Comienzo interinato: "+ FechaComienzoInterinato.getTime().toString());}
}
