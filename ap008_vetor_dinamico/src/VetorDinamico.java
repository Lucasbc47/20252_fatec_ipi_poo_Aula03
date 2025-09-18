public class VetorDinamico {
    private int capacidade;
    private int[] elementos;
    private int quantidade;

    public VetorDinamico(int[] elementos, int quantidade){
        this.capacidade = 0;
        this.elementos = elementos;
        this.quantidade = quantidade; 
    }

    public boolean isCheio() {
        return this.capacidade == this.quantidade;
    }

    // if is cheio cap x 2
    public void acrescentar(){
        if (isCheio()) {
            this.capacidade *= 2;
        }
    }

}   