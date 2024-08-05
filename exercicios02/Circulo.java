package exercicios02;

public class Circulo {
    private double raio;
    private double pi = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return pi * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * pi * raio;
    }

    public String imprimir() {
        return String.format(
                "Raio do circulo: %.2f\nArea do Circulo: %.2f\nPerimetro do circulo: %.2f",
                raio, calcularArea(), calcularPerimetro());
    }
}
