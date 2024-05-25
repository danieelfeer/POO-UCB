package exception.exeptions;

public class ValorDepoistoInvalidoException extends Exception{
    
    public ValorDepoistoInvalidoException(){
        super("Valor do depósito inválido. Insira um valor positivo!");
    }
}
