package lista8;

public class Pizza implements ItemPedido {
    private String nome;
    private double preco;

    public Pizza(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularPreco() { return preco; }

    @Override
    public void exibir(int nivel) {
        System.out.println("  ".repeat(nivel) + "Pizza " + nome + " - R$ " + preco);
    }
}
