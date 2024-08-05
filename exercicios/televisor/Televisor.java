package exercicios.televisor;

// Defina uma classe Televisor com os atributos: canal, volume e ligado. Inclua na classe um construtor, os métodos ligar, desligar, aumentarVolume, diminuirVolume, trocarCanal e o método toString() para retornar a representação textual do objeto.


public class Televisor {
    int canal;
    int volume;
    boolean ligado;

    public Televisor(int canal, int volume, boolean ligado) {
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    public void ligar() {
        if(this.ligado == false) {
            this.ligado = true;
        }
    }

    public void desligar() {
        if (this.ligado == true) {
            this.ligado = false;
        } 
    }

    public void aumentarVolume() {
        if (this.ligado && this.volume < 100) {
            this.volume += 1;
        }
    }

    public void diminuirVolume() {
        if (this.ligado && this.volume > 0) {
            this.volume -= 1;
        }
    }

    public void trocarCanal(int canal) {
        if (this.ligado) {
            this.canal = canal;
        }
    }

    public String toString() {
        String estaLigado = this.ligado ? "ligado" : "desligado";
        if (this.ligado) {
            return "Este televisor está " + estaLigado + " no canal " + this.canal + " com volume " + this.volume;
        } else {
            return "Este televisor esta desligado.";
        }
    }
}
