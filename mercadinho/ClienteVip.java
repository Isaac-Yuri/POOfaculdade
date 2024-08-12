public class ClienteVip extends Cliente {
    String numeroCartao;

    ClienteVip(String nome, double valorDaCompra, String numeroCartao) {
        super(nome, valorDaCompra);
        this.numeroCartao = numeroCartao;
    }
    
    @Override
    public double calcularPagamento(double valorDaCompra) {
        return valorDaCompra - (0.1 * valorDaCompra);
    };
}
