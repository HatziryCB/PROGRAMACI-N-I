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
    protected String [] vector2;
    protected String [] vector3;
    Scanner sc=new Scanner(System.in);
    RegistroEstudiante registroEstudiante=new RegistroEstudiante();

    public MetodoVectores() {
        this.indentador = 0;
        this.vector = new String[100];
        this.vector2= new String [100];
        this.vector3= new String[100];
        this.indice=0;
        this.codigoEstudiante = codigoEstudiante;
        this.telefono = telefono;
        this.nombre = nombre;
        this.alias = alias;
        this.correo = correo;
    }

    public void registroAlumno() {
        System.out.println("Ingrese la cantidad de registros que desee realizar: ");
        int indentador=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <indentador; i++) {
            System.out.println("Nombre y apellido del estudiante: ");
            vector[indice]=sc.nextLine();
            indice++;
            System.out.println("Codigo del estudiante: ");
            vector[indice]=sc.nextLine();
            indice++;
            System.out.println("Ingrese el alias del estudiante: ");
            vector[indice]=sc.nextLine();
            indice++;
            System.out.println("Correo del estudiante: ");
            vector[indice]=sc.nextLine();
            indice++;
            System.out.println("Telefono del estudiante: ");
            vector[indice]=sc.nextLine();
            indice++;
            this.historial(nombre,codigoEstudiante,alias,correo,telefono);
        }
        this.historial(nombre,codigoEstudiante,alias,correo,telefono);

    }
    public void registroCurso(){
        System.out.println("Ingrese la cantidad de registros que desee realizar: ");
        int indentador=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <indentador; i++) {
            System.out.println("Codigo de curso: ");
            vector2[indice]=sc.nextLine();
            indice++;
            System.out.println("Nombre de curso: ");
            vector2[indice]=sc.nextLine();
            indice++;
            this.historial2(codigoCurso,nombreCurso);
        }
        this.historial2(codigoCurso,nombreCurso);
    }
    public void registroGrado(){
        System.out.println("Ingrese la cantidad de registros que desee realizar: ");
        int indentador=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <indentador; i++) {
            System.out.println("Codigo de Grado: ");
            vector3[indice]=sc.nextLine();
            indice++;
            System.out.println("Descripccion de grado: ");
            vector3[indice]=sc.nextLine();
            this.historial3(codigoGrado,descripcion);
        }
        this.historial3(codigoGrado,descripcion);
    }
        public void historial(String nombre,String codigoEstudiante, String alias, String correo, String telefono){
            indice=indice+1;
            vector[indice]="Nombre estudiante: "+nombre+"\nCodigo de Estudiante: "+codigoEstudiante+"\nApodo: "+alias+"\nEmail: "+correo+"\nTelefono: "+telefono;
        }
        public void historial2(String codigoCurso,String nombreCurso){
            indice=indice+1;
            vector2[indice]="Codigo de curso: "+codigoCurso+"\nNombre de curso: "+nombreCurso;
        }
        public void historial3(String codigoGrado,String descripcion){
            indice=indice+1;
            vector3[indice]="Codigo de grado: "+codigoGrado+"\nDescripcion de grado: "+descripcion;
        }
        public void mostrarDatos(){
            try{
                for(int i=0; i<vector[indice].length();i++){
                    if(vector[indice]!= null){
                        System.out.println(vector[indice]);
                    }
                }
            }catch(Exception error){
                System.out.println(error.getMessage());
            }
        }
        public void mostrarDatos2(){
            try{
                for(int i=0; i<vector2[indice].length();i++){
                    if(vector2[indice]!= null){
                        System.out.println(vector2[indice]);
                    }
                }
            }catch(Exception error){
                System.out.println(error.getMessage());
            }
        }
        public void mostrarDatos3(){
            try{
                for(int i=0; i<vector3[indice].length();i++){
                    if(vector3[indice]!= null){
                        System.out.println(vector3[indice]);
                    }
                }
            }catch(Exception error){
                System.out.println(error.getMessage());
            }
        }

}