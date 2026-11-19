package lista5;

public class CalculoPasseio implements CalculoValor {
    private double horas;

    private CalculoValor calculoHora;
    private CalculoValor calculoDiaria ;
    private CalculoValor calculoMensal;

    public CalculoPasseio(double horas) {
        if (horas <= 0) {
            throw new IllegalArgumentException("A hora não pode ser 0");
        }
        this.horas = horas;
    }

    @Override
    public double calcular() {
        double valorTotal = 0;
        if (horas <= 12) {
            calculoHora = new CalculoPorHora(horas);
            valorTotal = calculoHora.calcular();
        }
        else if (horas >= 12 && horas <= 360) {
            calculoDiaria = new CalculoDiaria(horas);
            valorTotal = calculoDiaria.calcular();
        }
        else{
            calculoMensal = new CalculoMensal(horas);
            valorTotal = calculoMensal.calcular();
        }
        return valorTotal;


    }



}
