package _02_metodos.demos;

public class Main {

    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        q1.lado = 10.0;
        System.out.println(q1.calcularArea());
        System.out.println(q1.calcularPerimetro());
    }
}
