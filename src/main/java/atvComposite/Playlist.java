    package atvComposite;

    import java.util.ArrayList;

    public class Playlist implements Componente{
        private String nomePlaylist;
        private ArrayList<Componente> itens = new ArrayList<>();

        public Playlist(String nomePlaylist) {
            this.nomePlaylist = nomePlaylist;
        }


        public void adicionar(Componente componente){
            itens.add(componente);
        }

        public void remover(Componente componente){
            itens.remove(componente);
            System.out.println("a música: " + componente.getName() + " foi REMOVIDA");

        }

        public void tocar(){
            System.out.println("tocando playlist: " + nomePlaylist);
            for (Componente c : itens){
                c.tocar();
            }
        }

        @Override
        public void setVelocidadeReproducao(float velocidade) {
            for(Componente c : itens){
                c.setVelocidadeReproducao(velocidade);
            }

        }

        @Override
        public String getName() {
            return nomePlaylist;
        }


    }
