package lista2_Notificacoes;

public class PushFactory extends NotificacaoFactory{


    @Override
    Notificacao criarNotificacao() {
        return new PushNotification();
    }
}
