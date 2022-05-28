import java.util.Arrays;
import java.util.Scanner;
public class MetodoVectores extends RegistroEstudiante{
    protected String codigoEstudiante;
    protected String codigoCurso;
    protected String codigoGrado;
    protected String telefono;
    protected String nombre, alias, correo,nombreCurso, descripcion;
    protected int indentador=0;
    protected int indice;
    protected String [] vector;
    Scanner sc=new Scanner(System.in);
    RegistroEstudiante registroEstudiante=new RegistroEstudiante();

    public MetodoVectores() {
        this.indentador = 0;
        this.vector = new String[20];
        this.indice=0;
        this.codigoEstudiante = codigoEstudiante;
        this.telefono = telefono;
        this.nombre = nombre;
        this.alias = alias;
        this.correo = correo;
    }
    @Override
    public String toString() {
        return "Codigo estudiante: '" + codigoEstudiante + '\'' +
                ", Nombre: '" + nombre + '\'' +
                ", Alias: '" + alias + '\'' +
                ", Correo: '" + correo + '\'' +
                ", Telefono: '" + telefono + '\'';
    }

    public void registroAlumno() {
        System.out.println("Ingrese la cantidad de registros que desee realizar: ");
        int indentador=sc.nextInt();
        for (int i = 0; i <indentador; i++) {
            System.out.println("Nombre y apellido del estudiante: ");
            nombre=sc.nextLine();
            sc.nextLine();
            indice++;
            System.out.println("Codigo del estudiante: ");
            codigoEstudiante=sc.nextLine();
            indice++;
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
    public void registroCurso(){
        System.out.println("Ingrese la cantidad de registros que desee realizar: ");
        int indentador=sc.nextInt();
        for (int i = 0; i <indentador; i++) {
            System.out.println("Codigo de curso: ");
            codigoCurso=sc.nextLine();
            indice++;
            System.out.println("Nombre de curso: ");
            nombreCurso=sc.nextLine();
            indice++;
        }
    }
    public void registroGrado(){
        System.out.println("Ingrese la cantidad de registros que desee realizar: ");
        int indentador=sc.nextInt();
        for (int i = 0; i <indentador; i++) {
            System.out.println("Codigo de Grado: ");
            codigoGrado=sc.nextLine();
            indice++;
            System.out.println("Descripccion de grado: ");
            descripcion=sc.nextLine();
        }

    }
        public void mostrarDatos(){
            try{
                for(int i=0; i<vector[indice].length();i++)
                    if(vector[indice]!= null){
                        System.out.println(vector[indice]);
                    }
                }
            }catch(Exception error){
                System.out.println(error.getMessage());
            }
        }
}