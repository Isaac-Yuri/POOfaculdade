public abstract class Cliente {
    String nome;
    double valorDaCompra;

    Cliente(String nome, double valorDaCompra){
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }

    public abstract double calcularPagamento(double valorDaCompra);

    public double getValorCompra() {
        return calcularPagamento(valorDaCompra);
    };
}
