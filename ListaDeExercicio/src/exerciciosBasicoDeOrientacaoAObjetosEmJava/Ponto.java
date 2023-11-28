package exerciciosBasicoDeOrientacaoAObjetosEmJava;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void exibirCoordenadas() {
        System.out.printf("Coordenadas: ( %s, %s )%n", x, y);
    }

    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(3.0, 4.0);

        System.out.println("Coordenadas iniciais:");
        ponto1.exibirCoordenadas();

        ponto1.setX(1.3);
        ponto1.setY(7);

        System.out.println("Coordenadas após modificação:");
        ponto1.exibirCoordenadas();
    }
}

