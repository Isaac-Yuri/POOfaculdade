package exercicios.televisor;

// Defina também uma classe ControleRemoto com o atributo Televisor e os mesmos métodos da classe Televisor.

public class ControleRemoto {
    Televisor televisor;

    public ControleRemoto(Televisor televisor) {
        this.televisor = televisor;
    }

    public void ligar() {
        if(this.televisor.ligado == false) {
            this.televisor.ligado = true;
        }
    }

    public void desligar() {
        if (this.televisor.ligado == true) {
            this.televisor.ligado = false;
        } 
    }

    public void aumentarVolume() {
        if (this.televisor.ligado && this.televisor.volume < 100) {
            this.televisor.volume += 1;
        }
    }

    public void diminuirVolume() {
        if (this.televisor.ligado && this.televisor.volume > 0) {
            this.televisor.volume -= 1;
        }
    }

    public void trocarCanal(int canal) {
        if (this.televisor.ligado) {
            this.televisor.canal = canal;
        }
    }

    public String toString() {
        return this.televisor.toString();
    }
}
