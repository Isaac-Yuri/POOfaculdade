import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String nome;
        Scanner r = new Scanner(System.in);
        nome = r.next();
        r.close();

        System.out.println("Seu nome é " + nome);
    }
}
