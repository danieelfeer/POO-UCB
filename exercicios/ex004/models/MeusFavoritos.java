package exercicios.ex004.models;

public class MeusFavoritos {
    
    public void favoritar(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " está fazendo Sucesso!");
        } else {
            System.out.println(audio.getTitulo() +" também é escutado por outros!");
        }
    }
}
