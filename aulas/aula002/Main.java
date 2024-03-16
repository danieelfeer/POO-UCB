package aulas.aula002;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.numero1 = 10.0;
        calc.numero2 = 5.0;

        System.out.println("Soma: " + calc.somar());       
        System.out.println("Subtração: " + calc.subtrair());       
        System.out.println("Multiplicação: " + calc.multiplicar());       
        System.out.println("Divisão: " + calc.dividir());       
    }
}