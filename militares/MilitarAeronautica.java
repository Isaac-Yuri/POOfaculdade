package militares;

public class MilitarAeronautica extends Militar {
    int anosPatente;
    int horasVoo;

    public MilitarAeronautica(int matricula, String patente, int anosPatente, int horasVoo) {
        super(matricula, patente);
        this.anosPatente = anosPatente;
        this.horasVoo = horasVoo;
    }

    @Override
    public boolean podeProgredir() {
        return anosPatente > 2 && horasVoo > 100;
    }
}