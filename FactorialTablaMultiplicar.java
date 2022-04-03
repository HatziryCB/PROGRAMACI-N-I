/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg3;

/**
 *
 * @author Hatziry
 */
public class FactorialTablaMultiplicar {

public double factorial ( double numero){
int factorial = 1;
numero=0;
while(numero!=0) {
factorial *= numero;
numero--;
}
return factorial;
}
public int tablamultiplicar (int numero){
for (int i=1; i<=10; i++){
    System.out.println(numero+" X "+ i +" = "+numero*i);
}
return 0;
}   
}
