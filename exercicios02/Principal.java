package exercicios02;

public class Principal {
    public static void main(String[] args) {
        Calendario calendario1 = new Calendario(23, 8, 2023);
        Calendario calendario2 = new Calendario(07, 8, 2024);

        calendario1.mostrarData();
        calendario2.mostrarData();
        calendario1.anoBissexto();
        calendario2.anoBissexto();
    }
}
