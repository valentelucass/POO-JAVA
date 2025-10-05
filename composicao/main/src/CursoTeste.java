public class CursoTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Lucas");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("João");



        Curso c1 = new Curso("Matematica");
        Curso c2 = new Curso("Portugues");
        Curso c3 = new Curso("Geografia");

        c1.adicionarAluno(a1);
        c1.adicionarAluno(a2);

        c2.adicionarAluno(a1);


        a1.adicionarCurso(c3);
        a2.adicionarCurso(c3);
        a3.adicionarCurso(c3);

        for (Aluno aluno : c3.alunos) {
            System.out.println("Estou matriculado no curso "
                    + c3.nome + " e meu nome é " + aluno.nome + ".");
        }

        System.out.println(a1.cursos.get(0).alunos);

        Curso cursoEncontrado = a1.obterCursoPorNome("Pimpolha");

        if(cursoEncontrado != null) {
            System.out.println("Curso encontrado: " + cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        } else {
            System.out.println("Curso não encontrado.");
        }

    }
}
