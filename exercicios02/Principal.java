package exercicios02;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(5463, "Isaac", "71317831454", "Sitio Capoeira", "5583981285516", 20, 300);

        System.out.println(funcionario.toString());
        System.out.println("Salario liquido: " + funcionario.calculaSalarioLiquido());
    }
}
