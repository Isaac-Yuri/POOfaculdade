package exerciciodebito;

public class Debito {
    public static void main(String[] args) {
        String[] arr = {"1001,D,300", "1002,C,200", "1001,D,300"};

        System.out.println(balance(arr));
    }

    public static int balance(String[] balances) {
        int conta = 0;
        for(String elemento: balances) {
            String[] vetor = elemento.split(",");
            
            if(vetor[1].equals("D")) {
                conta -= Integer.parseInt(vetor[2]);
            } else if (vetor[1].equals("C")) {
                conta += Integer.parseInt(vetor[2]);
            }
        }
        return conta;
    }
}
