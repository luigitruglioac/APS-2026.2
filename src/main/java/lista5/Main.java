package lista5;

public class Main {

    public static void main(String[]args){

        //diario
        ContaEstacionamento conta1 = new ContaEstacionamento(1, 7, new CalculoPasseio(7-1));
        System.out.println("O total foi 6h: " + conta1.valorConta());

        //diaria
        ContaEstacionamento conta2 = new ContaEstacionamento(1, 14, new CalculoPasseio(14-1));
        System.out.println("O total foi 13h: " + conta2.valorConta());

        //mensal
        ContaEstacionamento conta3 = new ContaEstacionamento(1, 722, new CalculoPasseio(722-1));
        System.out.println("O total foi 721h: " + conta3.valorConta());

        conta1.atualizarSaida(3, new CalculoPasseio(3-1));
        System.out.println("novo valor de conta: " + conta1.valorConta());



    }


}



