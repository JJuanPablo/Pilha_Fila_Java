public class Fila {

    private Object[] elementos;
    private int tamanho;
    private int capacidade;
    private int inicio;
    private int fim;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = -1;
    }

    public Object adicionar(Object elemento) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("A Fila está cheia.");
        }
        fim = (fim + 1) % capacidade;

    }


    public Object remover(){
        if (tamanho == 0){
            throw new IllegalStateException("A fila esá vazia.");
        }

        Object removido = elementos[inicio];
        inicio = (inicio + 1);
        tamanho--;
        return removido;
    }

    public Object primeiro(){
        if (tamanho == 0){
            throw  new IllegalStateException("A fila está vazia.");
        }
        return elementos[inicio];
    }

    public boolean isEmpy(){
        return tamanho == 0;
    }

    public int tamanho(){
        return tamanho;
    }

}
