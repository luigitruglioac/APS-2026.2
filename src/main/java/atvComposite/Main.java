package atvComposite;

public class Main {
    public static void main(String[] args) {
        Musica m1 = new Musica("musica1", "artista1");
        Musica m2 = new Musica("musica2", "artista2");

        Playlist rock = new Playlist("Rock");
        rock.adicionar(m1);

        Playlist favoritas = new Playlist("favoritas");
        favoritas.adicionar(m2);
        favoritas.adicionar(rock);

        favoritas.setVelocidadeReproducao(2);
        favoritas.tocar();

        favoritas.remover(m2);
        System.out.println("--- depois de remover ---");
        favoritas.tocar();
    }
}
