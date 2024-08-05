package exercicios.televisor;

public class Main {
    public static void main(String[] args) {
        Televisor televisor1 = new Televisor(4, 15, false);
        Televisor televisor2 = new Televisor(9, 10, true);
        ControleRemoto controle = new ControleRemoto(televisor1);

        controle.ligar();
        controle.aumentarVolume();
        controle.trocarCanal(8);
        System.out.println(controle.toString());
        controle.desligar();
        
        controle = new ControleRemoto(televisor2);

        controle.ligar();
        controle.diminuirVolume();
        controle.trocarCanal(30);
        System.out.println(controle.toString());
        controle.desligar();
    }
}
