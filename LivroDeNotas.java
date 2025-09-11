public class LivroDeNotas {
    
    private String disciplina;

    public LivroDeNotas(String disciplina   ) {
        System.out.println("Nasci");
    }

    public void setDisciplina(String d){
        disciplina = d;
    }

    public void exibirMensagem(){
        System.out.println("Bem vindo ao livro de " + disciplina);
    }
    
    public String getDisciplina(){
        return disciplina;
    }
}