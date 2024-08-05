package helicoptero;
public class Helicoptero {
    private boolean ligado = false;
    private int altitude = 0;
    private int capacidade;
    private int pessoasDentro;

    public Helicoptero(int capacidade) {
        this.capacidade = capacidade;
    }

    public void entra() {
        if (pessoasDentro < capacidade) {
            pessoasDentro++;
        }
    }

    public void sai() {
        while (pessoasDentro > 0) {
            pessoasDentro--;
        }
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
        }
    }

    public void decolar(int altitude) {
        if (ligado && this.altitude == 0) {
            setAltitude(altitude);
        }
    }

    public void aterrissar() {
        if (ligado && this.altitude > 0) {
            setAltitude(0);
        }
    }

    public void desligar() {
        if (ligado && altitude == 0) {
            ligado = false;
        }
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasDentro() {
        return pessoasDentro;
    }

    public void setPessoasDentro(int pessoasDentro) {
        this.pessoasDentro = pessoasDentro;
    }

    public String toString() {
        String isLigado = ligado ? "ligado" : "desligado";
        if (ligado && getAltitude() > 0) {
            return "O Helicoptero com capacidade maxima de " + getCapacidade() + " pessoas esta " + isLigado
                    + " voando numa altitude de " + getAltitude() + " metros com "
                    + getPessoasDentro() + " pessoas dentro.";
        } else {
            return "O Helicoptero com capacidade maxima de " + getCapacidade() + " pessoas esta " + isLigado + " com "
                    + getPessoasDentro() + " pessoas dentro.";
        }
    }
}
