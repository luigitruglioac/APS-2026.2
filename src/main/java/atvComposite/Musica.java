package atvComposite;

public class Musica implements Componente {
    private String nome;
    private String artista;
    private float velocidade = 1.0f;


    public Musica(String nomeMusica, String artistaMusica){
        this.nome = nomeMusica;
        this.artista = artistaMusica;

    }

    @Override
    public void tocar() {
        System.out.println("tocando música: " + nome + " do artista: " +
                artista + " Na velocidade " + velocidade);

    }

    @Override
    public void setVelocidadeReproducao(float velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String getName() {
        return nome;
    }
}
