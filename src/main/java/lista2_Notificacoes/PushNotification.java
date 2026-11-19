package lista2_Notificacoes;

public class PushNotification implements Notificacao {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Push Notification: " + mensagem);
    }
}
