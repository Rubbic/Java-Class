import java.util.Calendar;

public class TestHerencia {
    public static void main(String[] Args){
        Profesor profesor1 = new Profesor("Juan","Hernandez Garcia",33);
        profesor1.setIdProfesor("Prof 22-387-11");
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2019,10,22);
        ProfesorInterno interno1 = new ProfesorInterno("Jose Luis","Morales Pérez",54,fecha1);
        ListinProfesores listin1 = new ListinProfesores();
        listin1.addProfesor(profesor1);
        listin1.addProfesor(interno1);
        listin1.listar();
    }
}
