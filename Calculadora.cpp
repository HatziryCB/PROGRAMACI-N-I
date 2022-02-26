#include <iostream>
using namespace std;

int main(){
	
    char S,R,M,D,op;
    float result,x,y;
    
    cout<<"Bienvenido a la Calculadora en linea"<<endl;
    cout<<"Por favor, seleccione la funcion que desea realizar:"<<endl;
	cout<<"Suma= S"<<endl;
	cout<<"Resta= R"<<endl;
	cout<<"Multiplicacion= M"<<endl;
	cout<<"Division= D"<<endl;
    cin>>op;

    cout<<"Ingrese el primer número a operar"<<endl;
    cin>>x;
    cout<<"Ingrese el segundo número a operar"<<endl;
    cin>>y;

    if (op = S){
        result = x+y;}
    else{
        if (op=R){
            result=x-y;}
        else{
            if (op=M){
                result=x*y;}
            else{
                if (op=D){
                    result=x/y;}
            }
        }
    }
    cout<<"El resultado de la operacion es: "<<result<<endl;
    cout<<"Gracias por utilizar nuestros servicios";
	
    return (0);
}

