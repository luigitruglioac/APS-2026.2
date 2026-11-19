package lista5;

public class ContaEstacionamento {
    private double horaEntrada;
    private double horaSaida;
    private double tempoPermanencia;
    private CalculoValor calculoValor;

    public ContaEstacionamento(double horaEntrada, double horaSaida, CalculoValor calculoValor) {
        // Requisito 7: A saída não pode ser anterior à entrada
        if (horaSaida < horaEntrada) {
            throw new IllegalArgumentException("A hora de saída não pode ser anterior à entrada.");
        }

        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.tempoPermanencia = horaSaida - horaEntrada;
        this.calculoValor = calculoValor;
    }


    public void atualizarSaida(double novaHoraSaida, CalculoValor novoCalculoValor) {
        if (novaHoraSaida < this.horaEntrada) {
            throw new IllegalArgumentException("A nova saída não pode ser anterior à entrada.");
        }
        this.horaSaida = novaHoraSaida;
        this.tempoPermanencia = novaHoraSaida - this.horaEntrada;
        this.calculoValor = novoCalculoValor;
    }

    public double valorConta() {
        return this.calculoValor.calcular();
    }
}




