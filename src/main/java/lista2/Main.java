package lista2;

public class Main {

    public static void main(String[]args){


        System.out.println("referencia 1 imprime: ");
        ConfiguracaoSistema config1 = ConfiguracaoSistema.getInstancia();

        System.out.println("referencia 2 imprime: ");
        ConfiguracaoSistema config2 = ConfiguracaoSistema.getInstancia();


        System.out.println("mudança de idioma: ");
        config1.setIdioma("en-us");

        System.out.println("exibindo configuração: ");
        config2.exibirConfiguracoes();

        System.out.println(config1 == config2);


        System.out.println ("==-=-=-=-");

        GerenciadorDeImpressao imp1 = GerenciadorDeImpressao.getInstancia();
        GerenciadorDeImpressao imp2 = GerenciadorDeImpressao.getInstancia();

        imp1.imprimir("imp1");
        imp2.imprimir("imp2");
        imp2.imprimir("imp3");

        imp1.listarFila();

        System.out.println(imp1 == imp2);



    }


}
