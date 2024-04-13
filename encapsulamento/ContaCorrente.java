package encapsulamento;

public class ContaCorrente {
    private int numero;
    private double saldo;

    private ContaCorrente(){}
    
    public ContaCorrente(int numeroConta){
        this.numero = numeroConta;
        this.saldo = 0;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numeroConta){
        //auditoria
        this.numero = numeroConta;
    }

    //É o mesmo que Java Code Genertor > Generate Getters and Setters
}
