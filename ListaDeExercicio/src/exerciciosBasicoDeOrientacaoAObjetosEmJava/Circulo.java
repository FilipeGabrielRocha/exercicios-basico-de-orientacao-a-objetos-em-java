package exerciciosBasicoDeOrientacaoAObjetosEmJava;

public class Circulo {
    private Ponto centro;
    private double raio;

    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public static void main(String[] args) {
        Ponto centroCirculo = new Ponto(5.0, 3.0);
        double raioCirculo = 3.0;

        Circulo circulo = new Circulo(centroCirculo, raioCirculo);

        System.out.println("Informações do Círculo:");
        System.out.printf("Centro: ( %s, %s )%n", circulo.getCentro().getX(), circulo.getCentro().getY());
        System.out.printf("Raio: %s%n", circulo.getRaio());
        System.out.printf("Área: %.2s%n", circulo.calcularArea());
        System.out.printf("Perímetro: %.2s%n", circulo.calcularPerimetro());
    }
}
