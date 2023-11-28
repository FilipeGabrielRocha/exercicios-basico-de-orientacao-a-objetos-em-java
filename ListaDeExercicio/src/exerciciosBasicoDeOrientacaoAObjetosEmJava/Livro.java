package exerciciosBasicoDeOrientacaoAObjetosEmJava;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void exibirInformacoes() {
        System.out.printf("Livro:%nTítulo: %s%nAutor: %s%nNúmero de Páginas: %d%n", titulo, autor, numeroPaginas);
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Percy Jackson e os olimpianos, o cálice dos deuses", "Rick Riordan", 269);

        livro.exibirInformacoes();
    }
}

