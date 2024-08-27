package militares;

public class Principal {
    public static void main(String[] args) {
        CadastroMilitar cadastroMilitar = new CadastroMilitar();

        cadastroMilitar.adicionarMilitar(new MilitarAeronautica(1001, "Soldado", 3, 150));
        cadastroMilitar.adicionarMilitar(new MilitarAeronautica(1002, "Cabo", 3, 110));
        cadastroMilitar.adicionarMilitar(new MilitarAeronautica(1003, "Tenente", 5, 200));
        cadastroMilitar.adicionarMilitar(new MilitarExercito(2001, "Soldado", true, true));
        cadastroMilitar.adicionarMilitar(new MilitarExercito(2002, "Cabo", true, false));
        cadastroMilitar.adicionarMilitar(new MilitarExercito(2003, "Tenente", false, false));
        cadastroMilitar.adicionarMilitar(new MilitarMarinha(3001, "Soldado", true));
        cadastroMilitar.adicionarMilitar(new MilitarMarinha(3002, "Cabo", false));
        cadastroMilitar.adicionarMilitar(new MilitarMarinha(3003, "Tenente", true));

        System.out.println("Militares aptos a progredir de patente:");
        cadastroMilitar.imprimePodeProgredir();

        System.out.println("\nRealizando progressão dos militares aptos:");
        cadastroMilitar.realizarProgressao();
    }
}
