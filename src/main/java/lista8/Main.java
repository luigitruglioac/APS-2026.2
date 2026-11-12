package lista8;

public class Main {
    public static void main(String[] args) {
        Combo comboInfantil = new Combo("Infantil");
        comboInfantil.adicionar(new Pizza("Margherita", 30.0));
        comboInfantil.adicionar(new Pizza("Chocolate", 35.0));

        Combo comboFamilia = new Combo("Família");
        comboFamilia.adicionar(new Pizza("Calabresa", 40.0));
        comboFamilia.adicionar(new Pizza("Portuguesa", 45.0));
        comboFamilia.adicionar(comboInfantil);   // combo dentro de combo

        comboFamilia.exibir(0);
        System.out.println("Valor total: R$ " + comboFamilia.calcularPreco());
    }
}