package exerciciosBasicoDeOrientacaoAObjetosEmJava;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private ArrayList<String> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }

    public void contratarFuncionario(String nomeFuncionario) {
        funcionarios.add(nomeFuncionario);
        System.out.printf("Funcionário '%s' contratado pela empresa %s.%n", nomeFuncionario, nome);
    }

    public void demitirFuncionario(String nomeFuncionario) {
        if (funcionarios.remove(nomeFuncionario)) {
            System.out.printf("Funcionário '%s' demitido pela empresa %s.%n", nomeFuncionario, nome);
        } else {
            System.out.printf("Funcionário '%s' não encontrado na empresa %s.%n", nomeFuncionario, nome);
        }
    }

    public void exibirFuncionarios() {
        System.out.printf("Funcionários da Empresa %s:%n%s%n", nome, funcionarios.isEmpty() ? "Sem funcionários" : funcionarios);
    }

    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa("Rocha's Ltda", "40028922");
        minhaEmpresa.contratarFuncionario("Filipe");
        minhaEmpresa.contratarFuncionario("Nathan");
        minhaEmpresa.contratarFuncionario("Lara");
        minhaEmpresa.exibirFuncionarios();
        minhaEmpresa.demitirFuncionario("Nathan");
        minhaEmpresa.exibirFuncionarios();
    }
}

