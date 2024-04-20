package herança.empresa;

public class Engenheiro {
    
    private String nome;
    private String cpf;
    private String telefone;
    private String crea;
    private String projeto;
    private Double salario;

    //Privando Engenheiro
    private Engenheiro(){}

    //Disponibilizando Construtor da Classe Engenheiro
    public Engenheiro(String nome, String cpf, String telefone, String crea, String projeto, Double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.crea = crea;
        this.projeto = projeto;
        this.salario = salario;
    }

    //Getters and Setters
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

    public String getCrea() {
        return this.crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public String getProjeto() {
        return this.projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public Double getSalario(){
        return this.salario;
    }

    public void setSalario(Double salario){
        salario = this.salario;
    }

    public Double getBonificacao(){
        return this.salario * 0.15;
    }


    @Override //Sobre Escrita da Classe String
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", crea='" + getCrea() + "'" +
            ", projeto='" + getProjeto() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificação='" + getBonificacao() + "'" +
            "}";
    }

}
