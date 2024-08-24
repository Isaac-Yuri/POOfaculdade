package batalhanaval;

import java.util.Scanner;

public class Jogador {
    Scanner scanner = new Scanner(System.in);
    String nome;
    char[][] meuJogo;
    char[][] jogoAdversario;
    int submarinos;
    int cruzadores;
    int portaavioes;

    private static final String RESET_COR = "\u001B[0m";
    private static final String AZUL = "\u001B[34m";
    private static final String VERMELHO = "\u001B[31m";
    private static final String VERDE = "\u001B[32m";
    private static final String LETRAS = "ABCDEFGH";

    Jogador(String nome) {
        this.nome = nome;
        this.meuJogo = new char[8][8];
        this.jogoAdversario = new char[8][8];
        this.submarinos = 3;
        this.cruzadores = 2;
        this.portaavioes = 1;
    }

    public void iniciarTabuleiro() {
        System.out.println("Agora você irá posicionar suas armas no tabuleiro.");
        System.out.println("Digite as coordenadas no formato 'Linha Coluna' (exemplo: 0 3).");
        System.out.println("As coordenadas devem estar entre 0 e 7 para ambos os valores.");

        for (int n = 0; n < 3; n++) {
            System.out.print(nome + " onde deseja posicionar os 3 submarinos? Submarino numero " + (n + 1) + ": ");
            String[] res = scanner.nextLine().strip().split(" ");

            int x = Integer.parseInt(res[0]);
            int y = Integer.parseInt(res[1]);

            if (x >= 0 && x < meuJogo.length && y >= 0 && y < meuJogo[0].length && meuJogo[x][y] == '\u0000') {
                meuJogo[x][y] = 's';
            } else {
                System.out.println("Coordenada errada ou já ocupada, informe uma válida!");
                n--;
            }
        }

        System.out.println();

        for (int n = 0; n < 2; n++) {
            System.out.print(nome + " onde deseja posicionar os 2 cruzadores? Cruzador numero " + (n + 1) + ": ");
            String[] res = scanner.nextLine().split(" ");

            int x = Integer.parseInt(res[0]);
            int y = Integer.parseInt(res[1]);

            if (x >= 0 && x < meuJogo.length && y >= 0 && y < meuJogo[0].length && meuJogo[x][y] == '\u0000') {
                meuJogo[x][y] = 'c';
            } else {
                System.out.println("Coordenada errada ou já ocupada, informe uma válida!");
                n--;
            }
        }

        System.out.println();

        for (int n = 0; n < 1; n++) {
            System.out.print(nome + " onde deseja posicionar o porta avioes? Porta avioes numero " + (n + 1) + ": ");
            String[] res = scanner.nextLine().split(" ");

            int x = Integer.parseInt(res[0]);
            int y = Integer.parseInt(res[1]);

            if (x >= 0 && x < meuJogo.length && y >= 0 && y < meuJogo[0].length && meuJogo[x][y] == '\u0000') {
                meuJogo[x][y] = 'p';
            } else {
                System.out.println(VERMELHO + "Coordenada errada ou já ocupada, informe uma válida!" + RESET_COR);
                n--;
            }
        }
    }

    private void mostrarTabuleiro() {
        String letras = "ABCDEFGH";
        int numero = 0;
        System.out.println("|-0-+-1-+-2-+-3-+-4-+-5-+-6-+-7-|");

        for (char[] linha : this.jogoAdversario) {
            System.out.print(letras.charAt(numero) + " ");
            numero++;
            for (char espaco : linha) {
                if (espaco == 'x') {
                    System.out.print(VERMELHO + "x" + RESET_COR + " | ");
                } else if (espaco == 'o') {
                    System.out.print(VERDE + "o" + RESET_COR + " | ");
                } else {
                    System.out.print(AZUL + "~" + RESET_COR + " | ");
                }
            }
            System.out.println();
            System.out.println("|---+---+---+---+---+---+---+---|");
        }
    }

    public void atirar(Jogador jogadorAdversario) {
        for (int n = 0; n < 2; n++) {
            mostrarTabuleiro();

            String coordenada;

            while(true) {
                System.out.print(this.nome + ", informe onde deseja atirar seu " + (n == 0 ? "primeiro"
                        : "segundo") + " tiro (exemplo: A2): ");
                coordenada = scanner.nextLine().strip().toUpperCase();
    
                if(!coordenada.equals("")) {
                    break;
                }
            }


            int tiroX = LETRAS.indexOf(coordenada.charAt(0));
            int tiroY = Character.getNumericValue(coordenada.charAt(1));

            System.out.println("------------------------------------------------");

            if (jogadorAdversario.verificarSeAcertou(tiroX, tiroY)) {
                System.out.println(VERDE + "Acertou uma arma inimigo!" + RESET_COR);
                registrarTiro(tiroX, tiroY, jogadorAdversario);
            } else {
                System.out.println(VERMELHO + "Acertou a água!" + RESET_COR);
                registrarTiro(tiroX, tiroY, jogadorAdversario);
            }
        }

        mostrarTabuleiro();
        System.out.println("Seu jogo ficou assim (aperte enter para continuar)");
        scanner.nextLine();
    }

    public boolean verificarSeAcertou(int coordX, int coordY) {
        if (this.meuJogo[coordX][coordY] == 's' || this.meuJogo[coordX][coordY] == 'c'
                || this.meuJogo[coordX][coordY] == 'p') {
            return true;
        }
        return false;
    }

    public void registrarTiro(int coordX, int coordY, Jogador jogadorAdversario) {
        if (jogadorAdversario.meuJogo[coordX][coordY] == 's') {
            jogadorAdversario.submarinos--;
            this.jogoAdversario[coordX][coordY] = 'o';
        } else if (jogadorAdversario.meuJogo[coordX][coordY] == 'c') {
            jogadorAdversario.cruzadores--;
            this.jogoAdversario[coordX][coordY] = 'o';
        } else if (jogadorAdversario.meuJogo[coordX][coordY] == 'p') {
            jogadorAdversario.portaavioes--;
            this.jogoAdversario[coordX][coordY] = 'o';
        } else {
            this.jogoAdversario[coordX][coordY] = 'x';
        }
    }

    public boolean verificarSePerdeu() {
        if (submarinos == 0 && cruzadores == 0 && portaavioes == 0) {
            return true;
        }
        return false;
    }
}
