public class ClienteOuroVip extends ClienteVip {
    String endereco;

    ClienteOuroVip(String nome, double valorDaCompra, String numeroCartao, String endereco) {
        super(nome, valorDaCompra, numeroCartao);
        this.endereco = endereco;
    }
    
    @Override
    public double calcularPagamento() {
        return valorDaCompra - (0.15 * valorDaCompra);
    }
}
