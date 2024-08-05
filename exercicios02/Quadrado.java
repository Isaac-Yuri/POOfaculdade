package exercicios02;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public String imprimir() {
        return String.format("Lado: %.2f\nArea do quadrado: %.2f\nPerimetro do quadrado: %.2f", lado, calcularArea(), calcularPerimetro());
    }
}