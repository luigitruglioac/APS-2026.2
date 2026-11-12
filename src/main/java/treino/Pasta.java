package treino;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Item {
    private String nome;
    private ArrayList<Item> itemPasta = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(Item item){
        itemPasta.add(item);
    }

    public int getTamanho(){
        int total = 0;
        for(Item a : itemPasta){
            total += a.getTamanho();
        }
        return total;

    }

}
