public class Personagem {
    
    private int energia;
    private int fome;
    private int sono;

    // var de ref: quando tipo eh um objeto
    String nome;

    void cacar() {
        System.out.println("Cacar....");
    }
    
    void comer() {
        System.out.println("Comendo...");
    }

    void dormir(){
        System.out.println("Dormindo");
    }

}