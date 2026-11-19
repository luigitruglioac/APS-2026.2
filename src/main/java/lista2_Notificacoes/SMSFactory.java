package lista2_Notificacoes;

public class SMSFactory extends NotificacaoFactory{


    @Override
    Notificacao criarNotificacao() {
        return new SMS();
    }
}
