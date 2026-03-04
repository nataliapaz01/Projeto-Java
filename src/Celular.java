// Celular é um DispositivoDeMidia (Herança).
public class Celular extends DispositivoDeMidia {

    private String musicaAtual;
    private String artista;

    public Celular(String nome, String musica, String artista) {
        // Chamando o construtor da classe mãe.
        super(nome);
        this.musicaAtual = musica;
        this.artista = artista;
    }

    @Override // sobrescreve o metodo que herdou da classe mae
    public void reproduzir() {
        System.out.println("O " + this.nomeDoDispositivo + " está tocando a música: '" + this.musicaAtual + "' de " + this.artista + ".");
    }
}
