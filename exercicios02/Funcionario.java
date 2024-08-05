package exercicios02;

public class Funcionario {
    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private double salario;

    public Funcionario(
            int codigo, String nome, String cpf, String endereco,
            String telefone, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double calculaSalarioLiquido() {
        return salario - (0.11 * salario);
    }

    public String toString() {
        return "Código: " + codigo + 
        "\nNome: " + nome + 
        "\nCPF: " + cpf + 
        "\nEndereço: " + endereco + 
        "\nTelefone: " + telefone + 
        "\nIdade: " + idade + 
        "\nSalário: " + salario;
    }
}
