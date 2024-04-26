package exercicios.ex004.models;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private double classificacao;


    public Audio(String titulo, double classificacao) {
        this.titulo = titulo;
        this.classificacao = classificacao;
    }
    

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return this.totalReproducoes;
    }

    public int getTotalCurtidas() {
        return this.totalCurtidas;
    }

    public double getClassificacao() {
        return this.classificacao;
    }

   public void curtir(){
        this.totalCurtidas ++;
   }

   public void reproduzir(){
        this.totalReproducoes++;
   }



}
