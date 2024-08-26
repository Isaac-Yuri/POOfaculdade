package militares;

public class MilitarMarinha extends Militar {
    boolean participouConcertoAviao;

    public MilitarMarinha(int matricula, String patente, boolean participouConcertoAviao) {
        super(matricula, patente);
        this.participouConcertoAviao = participouConcertoAviao;
    }

    @Override
    public boolean podeProgredir() {
        return participouConcertoAviao;
    }
}
