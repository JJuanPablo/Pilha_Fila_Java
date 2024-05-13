import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        System.out.println("Adicionando: " + fila.adicionar("Abelha"));
        System.out.println("Adicionando: " + fila.adicionar("Bernardo"));
        System.out.println("Adicionando: " + fila.adicionar("Casa"));
        System.out.println("Adicionando: " + fila.adicionar("Dragrão"));
        System.out.println("Adicionando: " + fila.adicionar("Enzo"));

        System.out.println("A fila está vazia? " + fila.isEmpy());

        System.out.println("Primeiro elemento da fila: " + fila.primeiro());
        System.out.println("Tamanho da fila " + fila.tamanho());

        while (!fila.isEmpy()){
            System.out.println("Removendo da fila: " + fila.remover());
        }
        System.out.println("A fila está vazia? " + fila.isEmpy());

        //Testandi pilha
        Pilha pilha = new Pilha(5);
        System.out.println();

        System.out.println("Adicionando: " + pilha.empilhar("Abelha"));
        System.out.println("Adicionando: " + pilha.empilhar("Bernardo"));
        System.out.println("Adicionando: " + pilha.empilhar("Casa"));
        System.out.println("Adicionando: " + pilha.empilhar("Dragrão"));
        System.out.println("Adicionando: " + pilha.empilhar("Enzo"));

        System.out.println("A piljha está vazia? " + pilha.estaVazia());

        System.out.println("Primeiro elemento da pilha: " + pilha.topo());
        System.out.println("Tamanho da pilha " + pilha.tamanho());

        while (!pilha.estaVazia()){
            System.out.println("Removendo da pilha: " + pilha.desempilhar());
        }
        System.out.println("A pilah está vaia");

    }
}
