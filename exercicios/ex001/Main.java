package exercicios.ex001;


public class Main{

    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();

        calculadora.numA = 2.0;
        calculadora.numB = 3.0;


        System.out.println("Soma: " + calculadora.somar());
        System.out.println("Subtração: " + calculadora.subtrair());
        System.out.println("Multiplicação: " + calculadora.multiplicar());
        System.out.println("Divisão: " + calculadora.dividir());
        
        
        for(int i = 0; i <= 5; i++){
            System.out.println( i + " é primo? " + calculadora.verificarNumeroPrimo(i));
        }
        
        
    }

}