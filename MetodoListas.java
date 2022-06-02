import java.util.ArrayList;
import java.util.Scanner;

public class MetodoListas extends RegistroEstudiante{
private String nombre;
private String codigoEstudiante;
private String alias;
private String correo;
private String telefono;
private String codigoCurso;
private String nombreCurso;
private String codigoGrado;
private String descripccion;
public int iterador;
    Scanner sc=new Scanner(System.in);
    ArrayList<String> listaEstudiante  = new ArrayList<String>();
    ArrayList<String> listaCurso  = new ArrayList<String>();
    ArrayList<String> listaGrado  = new ArrayList<String>();

public void registroAlumno(){
    System.out.println("Ingrese la cantidad de registros que desee realizar: ");
    int iterador=sc.nextInt();
    for (int i = 0; i <iterador; i++) {
        System.out.println("Nombre y apellido del estudiante: ");
        nombre = sc.nextLine();
        sc.nextLine();
        listaEstudiante.add(nombre);
        System.out.println("Codigo del estudiante: ");
        codigoEstudiante = sc.nextLine();
        sc.nextLine();
        listaEstudiante.add(codigoEstudiante);
        System.out.println("Ingrese el alias del estudiante: ");
        alias = sc.nextLine();
        sc.nextLine();
        listaEstudiante.add(alias);
        System.out.println("Correo del estudiante: ");
        correo = sc.nextLine();
        listaEstudiante.add(correo);
        System.out.println("Telefono del estudiante: ");
        telefono = sc.nextLine();
        listaEstudiante.add(telefono);
        System.out.println(listaEstudiante);
    }
    for (int i = 0; i <listaEstudiante.size() ; i++) {
        String A= listaEstudiante.get(i);
        System.out.println(A);
    }
}
    public void registroCurso() {
        System.out.println("Ingrese la cantidad de registros que desee realizar: ");
        int indentador = sc.nextInt();
        sc.nextLine();
    
        for (int i = 0; i <indentador; i++) {
            System.out.println("Codigo de curso: ");
            codigoCurso=sc.nextLine();
            listaCurso.add(codigoCurso);
            System.out.println("Nombre de curso: ");
            nombreCurso=sc.nextLine();
            listaCurso.add(nombreCurso);
            System.out.println(listaCurso);
        }
        for (int i = 0; i <listaCurso.size() ; i++) {
            String A= listaEstudiante.get(i);
            System.out.println(A);
        }
    }
    public void registroGrado(){
        System.out.println("Ingrese la cantidad de registros que desee realizar: ");
        int indentador=sc.nextInt();
        for (int i = 0; i <indentador; i++) {
            System.out.println("Codigo de Grado: ");
            codigoGrado=sc.nextLine();
            listaGrado.add(codigoGrado);
            System.out.println("Descripccion de grado: ");
            descripccion=sc.nextLine();
            listaGrado.add(descripccion);
            System.out.println(listaGrado);
        }
        for (int i = 0; i <listaGrado.size() ; i++) {
            String A= listaEstudiante.get(i);
            System.out.println(A);
        }
    }

}
