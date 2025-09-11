

public class TesteLivroDeNotas {
    static public void main(String[] args) {
        String disciplina1 = "POO";
        String disciplina2 = "PEM";
        LivroDeNotas livro1 = new LivroDeNotas(disciplina1);
        livro1.setDisciplina(disciplina1);
        livro1.exibirMensagem();
        LivroDeNotas livro2 = new LivroDeNotas(disciplina2);
        livro2.setDisciplina(disciplina2);
        System.out.println(livro2.getDisciplina());
        livro2.exibirMensagem();
        //livro1 = livro2;
    }
}
