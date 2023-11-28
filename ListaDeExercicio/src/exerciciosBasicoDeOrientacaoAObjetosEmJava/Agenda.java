package exerciciosBasicoDeOrientacaoAObjetosEmJava;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<String> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String contato) {
        contatos.add(contato);
        System.out.printf("Contato '%s' adicionado com sucesso.%n", contato);
    }

    public void removerContato(String contato) {
        if (contatos.remove(contato)) {
            System.out.printf("Contato '%s' removido com sucesso.%n", contato);
        } else {
            System.out.printf("Contato '%s' não encontrado na agenda.%n", contato);
        }
    }

    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("Contatos na Agenda:");
            for (String contato : contatos) {
                System.out.println(contato);
            }
        }
    }

    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        minhaAgenda.adicionarContato("Lara");
        minhaAgenda.adicionarContato("Clara");
        minhaAgenda.adicionarContato("Carlos");
        minhaAgenda.adicionarContato("Lucas");
        minhaAgenda.adicionarContato("Filipe");
        minhaAgenda.adicionarContato("Ana");
        
        minhaAgenda.exibirContatos();

        minhaAgenda.removerContato("Clara");

        minhaAgenda.exibirContatos();
    }
}

