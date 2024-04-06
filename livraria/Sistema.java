package livraria;

import java.util.Scanner;

public class Sistema {
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //Criando a Classe Scanner 
        int opcao = 0; 
        Livraria livraria = new Livraria();

        //Menu
        while(opcao != 4){
            
            System.out.println("===== LIVRARIA =====\n");

            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Detalhar Livro");
            System.out.println("4. Sair");
            
            System.out.println("\n====================");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("Adicionando Livro...");
                    int id;
                    String titulo, nomeAutor, anoPublicacao, editora;

                    System.out.println("\nId: ");
                    id = sc.nextInt();

                    sc.nextLine(); // limpa o Buffer
                    
                    System.out.println("Título: ");
                    titulo = sc.nextLine();
                    
                    System.out.println("Nome Autor: ");
                    nomeAutor = sc.nextLine();
                    
                    System.out.println("Ano Publicação: ");
                    anoPublicacao = sc.nextLine();
                    
                    System.out.println("Editora: ");
                    editora = sc.nextLine();

                    Livro l =  new Livro(id, titulo, nomeAutor, anoPublicacao, editora);
                    livraria.cadastrarLivro(l);

                    break;
            
                case 2:
                    System.out.println("Listando Livros...");
                    System.out.println(livraria.listarLivros());
                    break;
            
                case 3:
                    System.out.println("Detalhando Livro");
                    break;
            
                case 4:
                    System.out.println("Saindo... Até mais ;)");
                    break;
            
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        
        }

        sc.close(); //Fechando Scanner 

    }

}
