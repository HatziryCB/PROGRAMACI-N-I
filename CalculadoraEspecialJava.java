package calculadoraespecial.java;
import java.util.Scanner;
public class CalculadoraEspecialJava {

    public static void main(String[] args) {
        System.out.println("Calculadora");
        System.out.println("Digite el numero de la funcion que desea realizar");
        int accion;
        Scanner leerAccion = new Scanner (System.in);
        System.out.println("Funciones Basicas");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("Funciones Especiales");
        System.out.println("5. Valor Absoluto");
        System.out.println("6. Raiz");
        System.out.println("7. Tangente");
        System.out.println("8. Seno");
        accion = leerAccion.nextInt();
        
        FuncionesBasicas calculadora = new FuncionesBasicas(); 
        FuncionesEspeciales calculadoraEspecial = new FuncionesEspeciales();
        Scanner sc = new Scanner(System.in);
        
switch (accion) {          
            case 1:
                double sum1, sum2;
                System.out.println("Ingrese el primer valor");
                sum1 = sc.nextDouble();               
                System.out.println("Ingrese el segundo valor");
                sum2 = sc.nextDouble();               
                System.out.println(calculadora.suma(sum1, sum2));
                break;
            case 2:
                double resta1,resta2;             
                System.out.println("Ingrese el primer valor");
                resta1 = sc.nextDouble();               
                System.out.println("Ingrese el segundo valor");
                resta2 = sc.nextDouble();               
                System.out.println(calculadora.resta(resta1, resta2));
                break;
            case 3:
                double mult1, mult2;              
                System.out.println("Ingrese el primer valor");
                mult1 = sc.nextDouble();                
                System.out.println("Ingrese el segundo valor");
                mult2 = sc.nextDouble();               
                System.out.println(calculadora.multiplicacion(mult1, mult2));
                break;               
            case 4:
                double division1, division2;
                System.out.println("Ingrese el primer valor");
                division1 = sc.nextDouble();              
                System.out.println("Ingrese el segundo valor");
                division2 = sc.nextDouble();               
                System.out.println(calculadora.division(division1, division2));
                break;              
            case 5:              
                double abs;
                System.out.println("Ingrese el numero del cual quiera saber su valor absoluto");
                abs = sc.nextDouble();               
                System.out.println(calculadoraEspecial.valorAbsoluto(abs));
                break;               
            case 6:
                double raiz;
                System.out.println("Ingrese el numero del cual desea conocer su raiz");
                raiz = sc.nextDouble();                
                System.out.println(calculadoraEspecial.raiz(raiz));
                break;               
            case 7:
                double tan;
                System.out.println("Ingrese el numero del cual desea saber su tangente");
                tan = sc.nextDouble();            
                System.out.println(calculadoraEspecial.tangente(tan));
                break;   
            case 8:
                double sin;
                System.out.println("Ingrese el numero del que desee saber su seno");
                sin = sc.nextDouble();
                                System.out.println(calculadoraEspecial.seno(sin));
                break;       
        }
                calculadora.division(4, 2);
                calculadora.suma(12, 44);
                calculadora.resta(129, 734);
                calculadora.multiplicacion(5, 14);
                calculadora.suma(54, 22);
                calculadoraEspecial.raiz(20);
                calculadoraEspecial.seno(3);
                calculadoraEspecial.tangente(24);
                calculadoraEspecial.valorAbsoluto(100);
                calculadora.division(18, 4);
                calculadora.suma(10, 32);
                calculadora.resta(200, 140);
                calculadora.multiplicacion(10, 14);
                calculadora.suma(122, 289);
                calculadoraEspecial.raiz(32);
                calculadoraEspecial.seno(105);
                calculadoraEspecial.tangente(23);
                calculadoraEspecial.valorAbsoluto(88);

                calculadora.mostrarDatos(); // Llamado del metodo que muestran los datos en cada una de las calculadoras
                calculadoraEspecial.mostrarTransaccion();
    }
}
