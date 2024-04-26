package exercicios.ex004.models;

public class Musica extends Audio {
    private String album;
    private String nomeArtista;
    private String genero;


    public Musica(String titulo, String album, String nomeArtista, String genero, int classificacao) {
        super(titulo, classificacao);
        this.album = album;
        this.nomeArtista = nomeArtista;
        this.genero = genero;
    }


    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getNomeArtista() {
        return this.nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public double getClassificacao() {
        if(this.getTotalReproducoes() >= 1000){
            return 10;
        } else if(this.getTotalReproducoes() >= 500){
            return 5;
        } else{
            return 3;
        }
    }    

}
