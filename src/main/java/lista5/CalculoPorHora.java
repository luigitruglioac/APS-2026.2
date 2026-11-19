package lista5;

public class CalculoPorHora implements CalculoValor {
    private final double valorHora = 4.00;
    private double horas;

    public CalculoPorHora(double horas) {
        this.horas = Math.max(1.0, Math.ceil(horas));
    }

    @Override
    public double calcular() {
        return this.valorHora * this.horas;
    }

}