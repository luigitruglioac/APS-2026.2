package lista2_Notificacoes;

public class Email implements Notificacao{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Notificação do EMAIL: " + mensagem);
    }
}
