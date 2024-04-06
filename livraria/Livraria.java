package livraria;

import java.util.ArrayList;

public class Livraria {
    
    public ArrayList<Livro> livros; //Classe ArrayList <tipo> nome Classe

    //Métodos
    public Livraria(){

        this.livros = new ArrayList<>(); //new = criando novo Objeto
        
    }

    public void cadastrarLivro (Livro livro) {

        this.livros.add(livro); //add é um método do ArrayList

    }

    public String listarLivros(){

        String listaLivros = "";
        
        for (Livro l : this.livros) {

            listaLivros += l.id + "-" + l.titulo + "\n";
        
        }

        return listaLivros;


    }
}
