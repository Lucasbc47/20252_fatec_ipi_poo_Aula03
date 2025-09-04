public class LivroDeNotas {

    public LivroDeNotas() {

    }
    private String disciplina;


    public void setDisciplina(String d){
        disciplina = d;
    }
    public void getDisciplina(String d){
        return disciplina;
    }
    public void exibirMensagem(){
        System.out.println("Disciplina: ", disciplina);
    }

}