package exerciciosvetor;
import java.util.Scanner;
import java.util.Arrays;

public class SorteGrande {
    Scanner scanner = new Scanner(System.in);
    int quantidadeApostas;
    int[][] apostas;
    int indiceApostas = 0;

    public static void main(String[] args) {
        SorteGrande apostas = new SorteGrande(3);
        apostas.addAposta(2);
        apostas.addAposta(3);
        apostas.addAposta(2);
        apostas.imprimirApostas();
    }

    public SorteGrande(int quantidadeApostas ) {
        this.quantidadeApostas = quantidadeApostas;
        this.apostas = new int[this.quantidadeApostas][];
    }

    public void addAposta(int quantidadeNumeros) {
        int[] numeros = new int[quantidadeNumeros];
        for (int n = 0; n < quantidadeNumeros; n++) {
            System.out.print("Digite os numeros da aposta " + (indiceApostas+1) + ": ");
            numeros[n] = scanner.nextInt();
        }
        System.out.println();
        apostas[indiceApostas] = numeros;
        indiceApostas++;
    }

    public void imprimirApostas() {
        for (int i = 0;i < indiceApostas;i++) {
            System.out.println("Aposta " + (i+1) + ": " + Arrays.toString(apostas[i]));
        }
    }
}
