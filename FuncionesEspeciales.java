package calculadoraespecial.java;

public class FuncionesEspeciales extends FuncionesBasicas {
FuncionesBasicas basico = new FuncionesBasicas();
//constructor de clase FuncionesEspeciales
    public double valorAbsoluto (double numero) {
        double resultado=Math.abs(numero);
        this.registroOperaciones("El valor absoluto", numero, resultado);
        return resultado;
    }
    public double raiz (double raiz) {
        double resultado=Math.sqrt(raiz);
        this.registroOperaciones("La raiz", raiz, resultado);
        return resultado;
    }
    public double tangente (double tan) {
        double resultado= Math.tan(tan);
        this.registroOperaciones("La tangente", tan, resultado);
        return resultado;
    }
    public double seno (double sin) {
        double resultado=Math.sin(sin);
        this.registroOperaciones("El seno", sin, resultado);
        return resultado;
    }
    String [] vector = basico.getVectorTransacciones(); // Lllamado del vector de la clase funciones basicas
    public void registroOperaciones(String operacion, double numero, double resultado){
        basico.indiceVector=basico.indiceVector+1; // Aumentando indice uno a uno de la clase funciones basicas
        vector[basico.indiceVector]=operacion+" de "+numero+" es= "+resultado;
    }
    public String mostrarTransaccion(){
                    try{
                            for (int i= 1; i<this.vector.length; i++){
                                    if(vector[i] != null){
                                        System.out.println(vector[i]);
                                    }
                            }
                    }catch(Exception error){
                        System.out.println(error.getMessage()); 
                     }
    return null;
        }  
}
