package exercicios02;

public class Retangulo {
    private int comprimento;
    private int largura;

    public Retangulo(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int calcularArea() {
        return comprimento * largura;
    }

    public int calcularPerimetro() {
        return (2 * comprimento) + (2 * largura);
    }

    public String imprimir() {
        return String.format("Comprimento: %d\nLargura: %d\nArea do retangulo: %d\nPerimetro do retangulo: %d", comprimento,largura, calcularArea(), calcularPerimetro());
    }
}
