package lista2;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeImpressao {
    private List<String> documentos = new ArrayList<>();

    private static final GerenciadorDeImpressao instancia = new GerenciadorDeImpressao();

    private GerenciadorDeImpressao(){

    }

    public static GerenciadorDeImpressao getInstancia(){
        return instancia;
    }

    public void imprimir(String doc){
        documentos.add(doc);
    }

    public void cancelarFila(){
       documentos.clear();
    }

    public void listarFila(){
        System.out.println(documentos);
    }





}
