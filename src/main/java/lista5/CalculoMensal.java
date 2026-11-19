package lista5;

public class CalculoMensal implements CalculoValor{
    private final double valorMensal = 500;
    private double horas;

    public CalculoMensal(double horas){
            this.horas = horas;

    }

    @Override
    public double calcular() {
        double totalMeses = Math.ceil(this.horas / 720);
        return totalMeses*valorMensal;
    }
}
