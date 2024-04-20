package herança.empresa;

public class Diretor {

    private String nome;
    private String cpf;
    private String telefone;
    private Double salario;
    private Integer quantidadeGerencias;

    private Diretor(){}

    public Diretor(String nome, String cpf, String telefone, Double salario, Integer quantidadeGerencias) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
        this.quantidadeGerencias = quantidadeGerencias;
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

    public Integer getQuantidadeGerencias() {
        return this.quantidadeGerencias;
    }

    public void setQuantidadeGerencias(Integer quantidadeGerencias) {
        this.quantidadeGerencias = quantidadeGerencias;
    }

    public Double getBonificacao(){
        return this.salario * 0.35;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", salario='" + getSalario() + "'" +
            ", quantidadeGerencias='" + getQuantidadeGerencias() + "'" +
            ", bonificação ='" + getBonificacao() + "'" +
            "}";
    }




}

