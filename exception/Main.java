package exception;

import exception.banco.Banco;
import exception.exeptions.ContaInexistenteException;
import exception.exeptions.ValorDepoistoInvalidoException;

public class Main {
    public static void main(String[] args) {
        
        Banco UCBank = new Banco();

        UCBank.abrirConta("conta 1");
        
        try {
            UCBank.depositar("conta 1", -10.0);
        } catch (ContaInexistenteException e) {
            System.out.println(e);
        } catch (ValorDepoistoInvalidoException e) {
            System.out.println(e);
        } catch (Exception e){
            System.out.println("Algo deu Errado! :(");
        }
    }
}
