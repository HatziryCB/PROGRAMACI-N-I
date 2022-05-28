import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodoFilas extends RegistroEstudiante{
private String nombre;
private String codigoEstudiante;
private String alias;
private String correo;
private String telefono;
private String codigoCurso;
private String nombreCurso;
private String codigoGrado;
private String descripccion;
Scanner sc=new Scanner(System.in);
ArrayList<String> listaEstudiante  = new ArrayList<String>();

public void registroAlumno(){
    System.out.println("Nombre y apellido del estudiante: ");
    listaEstudiante.add(nombre=sc.nextLine());
    System.out.println("Codigo del estudiante: ");

    System.out.println("Ingrese el alias del estudiante: ");
    alias=sc.nextLine();
    sc.nextLine();
    indice++;
    System.out.println("Correo del estudiante: ");
    correo=sc.nextLine();
    indice++;
    System.out.println("Telefono del estudiante: ");
    telefono=sc.nextLine();
    indice++;
}
}
