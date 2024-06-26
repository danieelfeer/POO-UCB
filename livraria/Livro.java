package livraria;

public class Livro {

    public int id;
    public String titulo;
    public String nomeAutor;
    public String anoPublicacao;
    public String editora;

    //Metodo Construtor : contrói o Objeto a partir da Classe
    public Livro(int id, String titulo, String nomeAutor, String anoPublicacao, String editora){
        
        this.id = id;
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
    }

    //Extensão Java code Generator; Java code Generator > getters and setters 
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeAutor() {
        return this.nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    // Java Code Generator > Generate toString
    @Override
    public String toString() {
        return
            " \nid: " + getId() +
            " \nTitulo: " + getTitulo() +
            " \nNome do autor: " + getNomeAutor() +
            " \nAno de Publicacao: " + getAnoPublicacao() +
            " \neditora: " + getEditora() +
            "\n";
    }

   
}
