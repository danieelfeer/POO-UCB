package exercicios.ex004.models;

public class Podcast extends Audio{
    private String apresentador;
    private String entrevistado;
    private String descricao;


    public Podcast(String titulo, String apresentador, String entrevistado, String descricao, int classificacao) {
        super(titulo, classificacao);
        this.apresentador = apresentador;
        this.entrevistado = entrevistado;
        this.descricao = descricao;
    }


    public String getApresentador() {
        return this.apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getEntrevistado() {
        return this.entrevistado;
    }

    public void setEntrevistado(String entrevistado) {
        this.entrevistado = entrevistado;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalCurtidas() >= 100) {
            return 10;
        } else if(this.getTotalCurtidas() >= 50){
            return 5;
        } else{
            return 3;
        }
    }
}
