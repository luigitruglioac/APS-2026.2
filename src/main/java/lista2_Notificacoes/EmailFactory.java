package lista2_Notificacoes;

public class EmailFactory extends NotificacaoFactory{


    @Override
    Notificacao criarNotificacao() {
      return new Email();

    }
}
