public class VetorDinamico {
    private int capacidade;
    private int[] elementos;
    private int quantidade;

    public VetorDinamico(int capacidadeInicial) {
        this.capacidade = capacidadeInicial;
        this.elementos = new int[capacidadeInicial];
        this.quantidade = 0;
    }

    // Construtor Padrão: caso nenhuma capacidade foi passada inicialmente;
    public VetorDinamico() {
        this(0);
    }

    public boolean isCheio() {
        return this.capacidade == this.quantidade;
    }

    private void redimensionar() {
        this.capacidade = (this.capacidade == 0) ? 1 : this.capacidade * 2;
        int[] novoArray = new int[this.capacidade];
        for (int i = 0; i < this.quantidade; i++) {
            novoArray[i] = this.elementos[i];
        }
        this.elementos = novoArray;
    }

    public void acrescentar(int elemento) {
        if (isCheio()) {
            redimensionar();
        }
        this.elementos[this.quantidade] = elemento;
        this.quantidade++;
    }

    public int tamanho() {
        return this.quantidade;
    }

    public int obter(int indice) {
        if (indice >= 0 && indice < quantidade) {
            return elementos[indice];
        }
        throw new IndexOutOfBoundsException("Índice inválido: " + indice);
    }

    public void mostrar() {
        System.out.print("[");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(elementos[i]);
            if (i < quantidade - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}