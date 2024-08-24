package batalhanaval;

import java.io.IOException;
import java.util.Scanner;

public class BatalhaNaval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("        Bem-vindo ao Jogo Batalha Naval Light!");
        System.out.println("==============================================");

        System.out.print("Nome do Jogador 1: ");
        Jogador jogador1 = new Jogador(scanner.nextLine());
        System.out.println("------------------------------------------------");
        System.out.print("Nome do Jogador 2: ");
        Jogador jogador2 = new Jogador(scanner.nextLine());

        System.out.println("\nPreparando o jogo...\n");

        System.out.println(jogador1.nome + ", posicione suas armas!");
        jogador1.iniciarTabuleiro();
        limpaConsole();
        System.out.println();
        System.out.println(jogador2.nome + ", posicione suas armas!");
        jogador2.iniciarTabuleiro();
        limpaConsole();

        while (true) {
            System.out.println("==============================================");
            System.out.println("                 Turno de " + jogador1.nome);
            System.out.println("==============================================");
            jogador1.atirar(jogador2);
            if (jogador2.verificarSePerdeu()) {
                System.out.println("==============================================");
                System.out.println("               " + jogador1.nome + " venceu a batalha!");
                System.out.println("==============================================");
                break;
            }

            limpaConsole();

            System.out.println("==============================================");
            System.out.println("                 Turno de " + jogador2.nome);
            System.out.println("==============================================");
            jogador2.atirar(jogador1);
            if (jogador1.verificarSePerdeu()) {
                System.out.println("==============================================");
                System.out.println("               " + jogador2.nome + " venceu a batalha!");
                System.out.println("==============================================");
                break;
            }

            limpaConsole();
        }

        System.out.println("\nObrigado por jogar Batalha Naval!");
        scanner.close();
    }

    public static void limpaConsole() {
        if (System.getProperty("os.name").contains("Windows"))
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        else
            try {
                Runtime.getRuntime().exec("clear");
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
