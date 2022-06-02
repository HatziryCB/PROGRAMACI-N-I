import java.util.Scanner;

public class RegistroEstudiante {
    protected static String []vector;
    protected static int indice;

    public RegistroEstudiante() {
        this.vector= new String[100];
        this.indice=0;
    }
    public static String[] getVector() {
        return vector;
    }
    public static int getIndice() {
        return indice;
    }
    static MetodoVectores metodoVectores = new MetodoVectores();
    static MetodoListas metodoListas = new MetodoListas();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("REGISTRO DE ESTUDIANTES DE INGENIERIA EN SISTEMAS");
        System.out.println("*************************************************");
        System.out.println("Seleccione el tipo de registro que desea utilizar: ");
        System.out.println("\n1) Registro por Arrays.");
        System.out.println("2) Registro por Listas. ");
        System.out.println("3) Salir de programa");
        int eleccion = sc.nextInt();
        switch (eleccion){
            case 1:
                System.out.println("        REGISTRO POR MEDIO DE VECTORES       ");
                System.out.println("\nREGISTRO DE ESTUDIANTE");
                metodoVectores.registroAlumno();
                System.out.println("\nREGISTRO DE CURSO");
                metodoVectores.registroCurso();
                System.out.println("\nREGISTRO DE GRADO");
                metodoVectores.registroGrado();
                metodoVectores.mostrarDatos();
                metodoVectores.mostrarDatos2();
                metodoVectores.mostrarDatos3();
                break;
            case 2:
                System.out.println("         REGISTRO POR MEDIO DE LISTAS          ");
                System.out.println("\nREGISTRO DE ESTUDIANTE");
                metodoListas.registroAlumno();
                System.out.println(metodoListas.listaEstudiante);
                System.out.println("\nREGISTRO DE CURSO");
                metodoListas.registroCurso();
                System.out.println(metodoListas.listaCurso);
                System.out.println("\nREGISTRO DE GRADO");
                metodoListas.registroGrado();
                System.out.println(metodoListas.listaGrado);

                break;
            case 3:
                System.out.println("    MUCHAS GRACIAS POR UTILIZAR NUESTRO PROGRAMA DE REGISTRO    ");
                break;
        }

    }
}
