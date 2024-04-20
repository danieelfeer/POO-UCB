package herança.empresa;

public class Gerente {
    
    private String nome ;
    private String cpf;
    private String telefone;
    private Double salario;
    private Integer quantidadeGerenciados;

    private Gerente(){}

    public Gerente(String nome, String cpf, String telefone, Double salario, Integer quantidadeGerenciados) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
        this.quantidadeGerenciados = quantidadeGerenciados;
    }
        

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getQuantidadeGerenciados() {
        return this.quantidadeGerenciados;
    }

    public void setQuantidadeGerenciados(Integer quantidadeGerenciados) {
        this.quantidadeGerenciados = quantidadeGerenciados;
    }

    public Double getBonificacao(){
        return this.salario * 0.25;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", salario='" + getSalario() + "'" +
            ", quantidadeGerenciados='" + getQuantidadeGerenciados() + "'" +
            ", bonificação='" + getBonificacao() + "'" +
            "}";
    }

}
