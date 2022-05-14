
package ejerciciovectores;

public class EjercicioVectores {

    public static void main(String[] args) {
    int [] numeros= new int [] {24, 2, 13, 48, 54, 89, 46, 52, 10, 15, 62, 78, 81, 22, 18};
    int suma = 0;
    for(int i=0; i<numeros.length; i++){
        System.out.println("Numero "+(i+1) +" = "+numeros[i]);
        suma += numeros[i];
    }
        System.out.println("La suma total de todos los numeros es: "+suma);
        System.out.println("El promedio es: "+(suma/numeros.length));
    

    }
    
}
