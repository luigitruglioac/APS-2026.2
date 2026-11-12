package treino;


public class Main {
    public static void main(String[] args) {
        Pasta documentos = new Pasta("Documentos");
        documentos.adicionar(new Arquivo("texto.txt", 50));

        Pasta fotos = new Pasta("Fotos");
        fotos.adicionar(new Arquivo("praia.jpg", 100));
        fotos.adicionar(new Arquivo("festa.jpg", 200));

        documentos.adicionar(fotos);

        System.out.println(documentos.getTamanho());
    }
}