package militares;

import java.util.ArrayList;

public class CadastroMilitar {
    private ArrayList<Militar> militares;

    public CadastroMilitar() {
        militares = new ArrayList<>();
    }

    public void adicionarMilitar(Militar militar) {
        militares.add(militar);
    }

    public void imprimePodeProgredir() {
        for (Militar militar : militares) {
            System.out.println(
                    "Militar de matricula " + militar.getMatricula() + " e patente " + militar.getPatente() + " está "
                            + (militar.podeProgredir() ? "Apto" : "Inapto")
                            + " para subir de patente.");
        }
    }

    public void realizarProgressao() {
        for (Militar militar : militares) {
            if (militar.podeProgredir()) {
                if (militar.progredirPatente()) {
                    System.out.println("Militar de matricula " + militar.getMatricula() + " subiu de patente e agora é "
                            + militar.getPatente());
                }
            }
        }
    }
}

