package calculadoraespecial.java;
public class FuncionesBasicas {
public String[ ] vectorTransacciones; // Declaración de un vector tipo string
public int indiceVector=0;
//Constructor para inicializar las variables 
    public FuncionesBasicas() {
        this.vectorTransacciones = new String[100000]; //Se inicializa el vector y se le da un tamaño
        this.indiceVector = 0;
    }
    public String[] getVectorTransacciones() { //Es necesario crear getters para las variables de clase que se puedan utilizar a lo largo del código
        return vectorTransacciones;
    }
    public int getIndiceVector() {
        return indiceVector;
    }
//metodos de suma, resta, multiplicacion y division
    public double suma (double numero1, double numero2) {
        double resultado = numero1+numero2;
        this.registrandoTransacciones("Suma", numero1, numero2, resultado); //con this se hace llamado a la variable de instancia que es previamente inicializada
        return resultado;
    }
    public double resta (double numero1, double numero2) {
        double resultado = numero1-numero2;
        this.registrandoTransacciones("Resta", numero1, numero2, resultado);
        return numero1 - numero2;
    }
    public double multiplicacion (double numero1, double numero2) {
        double resultado=numero1*numero2;    
        this.registrandoTransacciones("Multiplicacion", numero1, numero2, resultado);
        return numero1 * numero2;
    }
    public double division (double numero1, double numero2) {
        double resultado=numero1/numero2;
        this.registrandoTransacciones("Division", numero1, numero2, resultado);
        return numero1 / numero2;
    }
//Se crea un metodo que nos ayude a registrar los datos que deseamos ingresar en el arreglo
    public void registrandoTransacciones(String operacion, double numero1, double numero2, double resultado){
    indiceVector=indiceVector+1; //Aumentamos el indice + 1
    vectorTransacciones[indiceVector]=operacion+" entre "+numero1+" y "+numero2+" es= "+resultado; //Creamos la conformación del arreglo a como deseamos mostrarlo en pantalla
    }
// metodo void para mostrar datos donde recorrerá todo el programa en busca de errores
    public void mostrarDatos(){
                try{ // Donde el indice va aumentando uno en uno hasta que el indicador sea menor al tamaño del arreglo
                        for (int i= 1; i<vectorTransacciones.length; i++){
                                if(vectorTransacciones[i] != null){ // Si no es nulo, mostrarlo en pantalla
                                    System.out.println(vectorTransacciones[i]);
                                }
                        }
                }catch(Exception error){ // Si hay una excepcion, mostrar error en pantalla
                    System.out.println(error.getMessage()); 
                 }
    }
}
