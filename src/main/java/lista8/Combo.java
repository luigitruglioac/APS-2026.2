package lista8;
import java.util.ArrayList;
import java.util.List;

public class Combo implements ItemPedido {
    private String nome;
    private List<ItemPedido> itens = new ArrayList<>();

    public Combo(String nome) { this.nome = nome; }

    public void adicionar(ItemPedido item) { itens.add(item); }

    @Override
    public double calcularPreco() {
        double total = 0;
        for (ItemPedido i : itens) {
            total += i.calcularPreco();
        }
        return total;
    }

    @Override
    public void exibir(int nivel) {
        System.out.println("  ".repeat(nivel) + "Combo " + nome + " - R$ " + calcularPreco());
        for (ItemPedido i : itens) {
            i.exibir(nivel + 1);
        }
    }
}
