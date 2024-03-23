package teste;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Usuario user = new Usuario();
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        user.nome = scan.nextLine();

        System.out.println("Escreva sua idade: ");
        user.idade = scan.nextInt();

        System.out.println("Seu nome é " + user.nome);
        System.out.println("Sua idade é " + user.idade);

    }

}