package lista2_Notificacoes;

public class Main {

    public static void main(String[] args){
        NotificacaoFactory not = new PushFactory();
        NotificacaoFactory not2 = new EmailFactory();
        NotificacaoFactory not3 = new SMSFactory();

        Notificacao n1 = not.criarNotificacao();

        n1.enviarMensagem("Olá");
        





    }
}
