package exerciciosBasicoDeOrientacaoAObjetosEmJava;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;

    public Aluno(String nome, int matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = Arrays.copyOf(notas, notas.length);
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return Arrays.copyOf(notas, notas.length);
    }

    public double calcularMedia() {
        if (notas.length == 0) {
            return 0.0;
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public static void main(String[] args) {
        double[] notasAluno = { 9.5, 7.0, 8.9 };
        Aluno aluno = new Aluno("Filipe", 40028922, notasAluno);

        System.out.printf("Nome: %s%n", aluno.getNome());
        System.out.printf("Matrícula: %d%n", aluno.getMatricula());
        System.out.printf("Notas: %s%n", Arrays.toString(aluno.getNotas()));
        System.out.printf("Média: %.2f%n", aluno.calcularMedia());
    }
}

