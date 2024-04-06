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

   
}
