package exercicios.ex001;


public class Calculadora{

    Double numA, numB;

    Double somar(){
        return numA + numB;
    }

    Double subtrair(){
        return numA - numB;
    }

    Double multiplicar(){
        return numA * numB;
    }

    Double dividir(){
        return numA / numB;
    }

    boolean verificarNumeroPrimo(int num){
        return (num >=2 && num%2 == 1);
    }

    
}