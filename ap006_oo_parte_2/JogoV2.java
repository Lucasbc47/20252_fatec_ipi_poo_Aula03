import java.util.Random;

public class JogoV2 {
    public static void main(String [] args) throws Exception {
        Personagem p1 = new Personagem("Teste1");
        // Personagem p2 = new Personagem("Teste2");
        
        var gerador = new Random();


        while (true){
            // 1: cacar / 2: comer / 3: dormir
            var acaoP1 = gerador.nextInt(1, 4);
            switch (acaoP1){
                case 1:
                    p1.cacar();
                    break;
                case 2:
                    p1.comer();
                    break;
                case 3:
                    p1.dormir();
                    break;
            }
            System.out.println("*******************");
            var repr = p1.toString();
            System.out.println(repr);
            Thread.sleep(2000);

        }
    }
}