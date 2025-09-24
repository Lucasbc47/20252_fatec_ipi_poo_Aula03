public class App {
    public static void main(String[] args) throws Exception {

        VetorDinamico vetor = new VetorDinamico(2);
        vetor.acrescentar(10);
        vetor.acrescentar(20);
        vetor.mostrar();
        vetor.acrescentar(20);
        vetor.mostrar();
        int numero = vetor.obter(0);
        System.out.printf("numero: %d\n", numero);
    }
}
