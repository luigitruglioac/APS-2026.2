package lista2;

public class ConfiguracaoSistema {
    private String nomeAplicacao;
    private String versao;
    private String idioma;


    private ConfiguracaoSistema(){
        this.nomeAplicacao ="MeuAPP ";
        this.versao = "Versão 1 ";
        this.idioma ="pt-br ";
    }

    private static ConfiguracaoSistema instancia;

    public static ConfiguracaoSistema getInstancia(){
        if(instancia == null){
            instancia = new ConfiguracaoSistema();
        }
        return instancia;
    }

    public void exibirConfiguracoes(){
        System.out.println(nomeAplicacao + versao + idioma);
    }

    public void setIdioma(String idioma){
        this.idioma = idioma;
        System.out.println("idioma trocado para " +idioma);
    }


}
