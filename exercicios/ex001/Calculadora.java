package exercicios.ex001;


public class Calculadora{

    double numA, numB;

    double somar(){
        return numA + numB;
    }

    double subtrair(){
        return numA - numB;
    }

    double multiplicar(){
        return numA * numB;
    }

    double dividir(){
        return numA / numB;
    }

    boolean verificarNumeroPrimo(int num){
        
        //Verifica se existe algum numero divisivel
        for(int i = 3; i < num; i+=2){
            if(num%i == 0){
                return false;
            }
        }

        return (num >=2 && num%2 == 1);
    
    }

    
}