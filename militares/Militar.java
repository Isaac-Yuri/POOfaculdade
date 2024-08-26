package militares;

public abstract class Militar implements Carreira {
    protected int matricula;
    protected String patente;

    public Militar(int matricula, String patente) {
        this.matricula = matricula;
        this.patente = patente;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getPatente() {
        return patente;
    }

    protected boolean progredirPatente() {
        switch (patente) {
            case "Soldado":
                this.patente = "Cabo";
                return true;
            case "Cabo":
                this.patente = "Tenente";
                return true;
            default:
                return false;
        }
    }
}
