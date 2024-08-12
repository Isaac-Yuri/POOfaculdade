public class Principal {
    public static void main(String[] args) {
        Mercadinho mercadinho = new Mercadinho();

        mercadinho.adicionaCliente(new ClienteRegular("Isaac", 450.0));
        mercadinho.adicionaCliente(new ClienteVip("Natan", 1034.0, "1234-6543-7654-6247"));
        mercadinho.adicionaCliente(new ClienteOuroVip("Daniel", 2450.0, "7563-7563-5132-4352", "Tacima"));
        mercadinho.adicionaCliente(new ClienteRegular("Nicolas", 300.0));

        mercadinho.imprimirClientes();
        System.out.println("Conta total dos clientes: " + mercadinho.calcularTotal());
    }
}
