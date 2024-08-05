package helicoptero;

public class Principal {
    public static void main(String[] args) {
        Helicoptero helicoptero1 = new Helicoptero(5);
        Helicoptero helicoptero2 = new Helicoptero(8);

        System.out.println(helicoptero1.toString());
        System.out.println(helicoptero2.toString());

        helicoptero1.entra();
        helicoptero1.entra();
        helicoptero1.entra();
        helicoptero1.entra();
        helicoptero2.entra();
        helicoptero2.entra();
        helicoptero2.entra();
        helicoptero2.entra();
        helicoptero2.entra();
        helicoptero2.entra();

        helicoptero1.ligar();
        helicoptero2.ligar();

        helicoptero1.decolar(50);
        helicoptero2.decolar(200);

        System.out.println(helicoptero1.toString());
        System.out.println(helicoptero2.toString());

        helicoptero1.aterrissar();
        helicoptero2.aterrissar();

        helicoptero1.desligar();
        helicoptero2.desligar();

        helicoptero1.sai();
        helicoptero2.sai();

        System.out.println(helicoptero1.toString());
        System.out.println(helicoptero2.toString());
    }
}
