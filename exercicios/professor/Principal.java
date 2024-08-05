package exercicios.professor;

public class Principal {
    public Professor prof1;
    public Professor prof2;

    public static void main(String[] args) {
        Professor prof1 = new Professor("12345678", "Barros", "TSI");
        Professor prof2 = new Professor("876543121", "Otacilio", "TSI");

        prof1.printInformation();
        prof2.printInformation();
    }
}