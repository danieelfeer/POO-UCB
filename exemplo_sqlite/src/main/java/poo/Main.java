package poo;

import poo.dao.PessoaDAO;  
import poo.model.Pessoa; 

public class Main {
    public static void main(String[] args) {
        
        PessoaDAO dao = new PessoaDAO();
        
        Pessoa p1 = new Pessoa("Jota", "jotinha@gmail.com");
        Pessoa p2 = new Pessoa("Pedro", "predrinho@gmail.com");

        dao.cadastrarPessoa(p1);
        dao.cadastrarPessoa(p2);
    }
}
