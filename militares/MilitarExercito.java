package militares;

public class MilitarExercito extends Militar {
    boolean participouGuerra;
    boolean ganhouGuerra;

    public MilitarExercito(int matricula, String patente, boolean participouGuerra, boolean ganhouGuerra) {
        super(matricula, patente);
        this.participouGuerra = participouGuerra;
        this.ganhouGuerra = ganhouGuerra;
    }

    @Override
    public boolean podeProgredir() {
        return participouGuerra && ganhouGuerra;
    }
}
