package exercicios.ex004;

import exercicios.ex004.models.MeusFavoritos;
import exercicios.ex004.models.Musica;
import exercicios.ex004.models.Podcast;

public class Main {
    public static void main(String[] args) {

        MeusFavoritos meusFavoritos = new MeusFavoritos();
        
        Musica naquelaMesa = new Musica("Naquela Mesa", null, "Nelson Gonçalves e Rafael Rabelo", "MPB, Samba e Pagode", 9);
        
        for (int i = 0; i < 1000; i++) {
            naquelaMesa.reproduzir();
        }

        naquelaMesa.curtir();
        
        Podcast episodio1 = new Podcast("Podcast 01", "Apresentador tal", "Elon Musk", "Elon Musk envia foguete para Marte", 6);

        episodio1.reproduzir();

        for (int i = 0; i < 100; i++) {
            episodio1.curtir();
        }

        meusFavoritos.favoritar(naquelaMesa);
        meusFavoritos.favoritar(episodio1);
    }
}
