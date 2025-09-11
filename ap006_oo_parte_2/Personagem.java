public class Personagem {

    // var de ref: quando tipo eh um objeto
    private String nome;

    private int energia = 10;
    private int fome = 0;
    private int sono = 0;


    // overloading de construtor
    public Personagem(){}
    // compiler knows which one to choose....
    public Personagem(String nome, int energia, int fome, int sono) {
        this(energia, fome, sono);
        this.nome = nome;
    }

    public Personagem(int energia, int fome, int sono){}

    public Personagem(String nome){
        this();
        this.nome = nome;
    }

    public void cacar() {
        if (energia >= 2) {
            System.out.printf("%s: cacando\n", nome);
            energia -= 2;
        } else {
            System.out.printf("%s: cansado sem energia para cacar...\n", nome);
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    }

    public void comer() {
        if (fome >= 1) {
            System.out.printf("%s: comendo...\n", nome);
            energia = Math.min(energia + 1, 10);
            fome -= 1;
        }
        else {
            System.out.printf("%s: sem fome...\n", nome);
        }
    }

    public void dormir() {
        if (sono >= 1) {
            System.out.printf("%s: dormindo....\n", nome);
            sono -= 1;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        }
        else {
            System.out.printf("%s: sem sono, nao tem pq dormir..\n", nome);
        }
    }

    @Override
    public String toString() {
        return String.format(
            "e: %d, f: %d, s: %d\n", 
            energia, fome, sono
        );
    }


}
