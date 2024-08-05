package exercicios02;

public class Fita {
    private String titulo;
    private double aluguel;

    public Fita(String titulo, double aluguel) {
        this.titulo = titulo;
        this.aluguel = aluguel;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getAluguel() {
        return aluguel;
    }

    public double getValorAluguel(int numeroDeDiasAlugada) {
        return aluguel * numeroDeDiasAlugada;
    }

    public String toString() {
        return String.format("Titulo: %s\nAluguel: %.2f", getTitulo(), getAluguel());
    }
}
