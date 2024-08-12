import java.util.ArrayList;

public class Mercadinho {
    ArrayList<Cliente> clientes = new ArrayList<>();

    public void adicionaCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public double calcularTotal() {
        double total = 0;
        for (Cliente cliente: clientes) {
            total += cliente.getValorCompra();
        }
        return total;
    }

    public void imprimirClientes() {
        for (Cliente cliente: clientes) {
            System.out.println("Cliente " + cliente.nome + " deve " + cliente.getValorCompra() + " ao mercado.");
        }
    }
}
