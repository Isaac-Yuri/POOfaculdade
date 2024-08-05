package exercicios.porta;

public class Principal {
    public Porta porta1;

    public static void main(String[] args) {
        Porta porta1 = new Porta("azul", 1.80, 1.0, false);

        String res = porta1.toString();

        System.out.println(res);
    }
}
