/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg3;

import java.util.Scanner;

/**
 *
 * @author Hatziry
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int accion;
        System.out.println("Practica No. 3");
        System.out.println("1)Factorial");
        System.out.println("2)Tabla de multiplicar");
        System.out.println("3)Calculo de pares e impares");
        System.out.println("Dias laborales");
        System.out.println("Por favor seleccione la operacion que desea realizar:");
        accion= sc.nextInt();

    FactorialTablaMultiplicar clase1 = new FactorialTablaMultiplicar();
    ParesImparesDias clase2 = new ParesImparesDias();

switch(accion){
 case 1:{
double numero;
     System.out.println("Ingrese en numero que desea consultar: ");
     numero= sc.nextDouble();
     System.out.println("La factorial del numero es: "+ clase1.factorial(numero));
}
break;
case 2:{
int numero;
    System.out.println("Ingrese el numero que desea multiplicar: ");
    numero=sc.nextInt();
    System.out.println("Tabla de multiplicar del numero: "+numero);
    System.out.println(clase1.tablamultiplicar(numero));
    
}
break;
case 3:{ 
int ingreso = 0;
    System.out.println(clase2.parImpar(ingreso));

break;
}
case 4:{

}

    }
    
}
}