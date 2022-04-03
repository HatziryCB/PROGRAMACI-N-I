/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg3;
import java.util.Scanner;
/**
 *
 * @author Hatziry
 */
public class ParesImparesDias {
Scanner lector = new Scanner(System.in);
public int parImpar (int ingreso){
int n;
int i = 1;
int sumapares = 0;
int sumaimpares =0; 
int promedio; 
while(i<=10){
i++;
System.out.println("Ingrese un numero entero: ");
ingreso=lector.nextInt();
if(ingreso%2 == 0){
    System.out.println("El numero es par");
    ingreso+=ingreso;
    sumapares= ingreso;
} else {  
    System.out.println("El numero es impar");
    ingreso+=ingreso;
    sumaimpares= ingreso;
}
}
    promedio= sumapares/sumaimpares;
    System.out.println("La suma de los numeros pares ingresados es: "+ sumapares);
    System.out.println("La suma de los numeros impares ingresados es: "+ sumaimpares);
    System.out.println("El promedio de impares es: "+ promedio);

return 0;
}
public int dia;
public double numeros;
    public int diasLaborales(int opcion){
        System.out.println("Por favor seleccione el día que desea consulta");   
        System.out.println("1) Lunes");
        System.out.println("2) Martes");
        System.out.println("3) Miercoles");
        System.out.println("4) Jueves");
        System.out.println("5) Viernes");
        System.out.println("6) Sabado");
        System.out.println("7) Domingo");
        opcion= lector.nextInt();
if(opcion<6){
    System.out.println("Este es un dia laboral");
}else {
    System.out.println("Este no es un dia laboral");
}
    return 0;
}
}