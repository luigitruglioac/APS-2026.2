package lista5;

public class CalculoDiaria implements CalculoValor {
    private final double valorDiaria = 40.00;
    private double horas;

    public CalculoDiaria(double horas) {
        this.horas = horas;
    }

    @Override
    public double calcular() {
        double diarias = Math.ceil(this.horas / 24.0);
        return this.valorDiaria * diarias;
    }
}

