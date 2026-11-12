package atvAdapter;

public class Wav extends Som {
    @Override
    public void rodarSom() { System.out.println("Tocando som WAV"); }
    @Override
    public void gravarSom() { System.out.println("Gravando som WAV"); }
}