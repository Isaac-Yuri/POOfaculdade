public class ClienteRegular extends Cliente {

    ClienteRegular(String nome, double valorDaCompra){
        super(nome, valorDaCompra);
    }

    @Override
    public double calcularPagamento() {
        return valorDaCompra;
    }
}