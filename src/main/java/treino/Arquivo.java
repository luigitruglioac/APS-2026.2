package treino;

public class Arquivo implements Item {
    private String nome;
    private int tamanho;

    public Arquivo(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }
}