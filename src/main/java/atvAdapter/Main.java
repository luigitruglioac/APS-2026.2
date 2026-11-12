package atvAdapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> legado = new Vector<>();
        legado.add("A");
        legado.add("B");
        legado.add("C");

        Enumeration<String> enumeration = legado.elements();
        Iterator<String> it = new EnumerationIteratorAdapter<>(enumeration);

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        try {
            it.remove();
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        VideoTarget avi = new Avi();
        avi.rodarVideo();
        avi.gravarVideoCam();

        VideoTarget mid = new SomVideoAdapter(new Mid());
        mid.rodarVideo();
        mid.gravarVideoCam();

        VideoTarget wav = new SomVideoAdapter(new Wav());
        wav.rodarVideo();
        wav.gravarVideoCam();
    }
}

