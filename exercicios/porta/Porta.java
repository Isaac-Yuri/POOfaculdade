package exercicios.porta;

// Defina uma classe Porta com os atributos: cor, altura, largura e estaAberta. Inclua na classe um construtor, os métodos gets e sets e o método toString() para retornar a representação textual do objeto.

public class Porta {
    private String color;
    private double height;
    private double width;
    private boolean estaAberta;

    public Porta(String color, double height, double width, boolean estaAberta) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.estaAberta = estaAberta;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public boolean getEstaAberta() {
        return estaAberta;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setEstaAberta(boolean estaAberta) {
        this.estaAberta = estaAberta;
    }

    public String toString() {
        return String.format("Uma porta %s, com %s de altura e %s de largura.", getColor(), getHeight(), getWidth());
    }
}
