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
public double factorial ( double num){
double i = 1;
double factorial;
while(num!=0){
factorial=i*num; num--;//factorial*=numero //numero se resta a si mismo
return factorial;
}

public int tablamultiplicar(int numero1){
for (int i=1; i<=10;i++){
resultado= numero1*i;
return resultado;
System.out.println(numero1+" X "+ i" = "+ resultado);
}
}


    
}
