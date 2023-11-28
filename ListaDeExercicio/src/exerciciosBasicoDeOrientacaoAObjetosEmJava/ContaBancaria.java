package exerciciosBasicoDeOrientacaoAObjetosEmJava;

public class ContaBancaria {
    private double saldo;
    private String numeroConta;
    
    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 1000.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado com sucesso. Novo saldo: R$%.2f%n", valor, saldo);
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso. Novo saldo: R$%.2f%n", valor, saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo da Conta %s: R$%.2f%n", numeroConta, saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("40028922");

        conta.exibirSaldo();

        conta.depositar(1000000.0);

        conta.sacar(50000.0);

        conta.exibirSaldo();
    }
}

