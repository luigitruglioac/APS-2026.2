package lista2_Notificacoes;

public class SMS implements Notificacao{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Notificação do SMS: " + mensagem);
    }
}
