package _02_metodos.demos;

public class Quadrado {
    Double lado;

    public Double calcularArea() {
        return lado * lado;
    }

    public Double calcularPerimetro() {
        return 4 * lado;
    }
}
