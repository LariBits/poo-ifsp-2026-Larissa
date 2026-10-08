package AtividadeSem07.AtvII;

public class TesteTurma {
    public static void main(String[] args) {
        // 1. Cria a instância da Turma
        Turma turma = new Turma();

        // 2. Matricula pelo menos 4 objetos Aluno com notas diferentes
        turma.matricular(new Aluno("Ana", 8.5));
        turma.matricular(new Aluno("Bruno", 6.0));
        turma.matricular(new Aluno("Carlos", 9.8));
        turma.matricular(new Aluno("Diana", 7.2));

        // 3. Imprime o resultado de calcularMedia()
        double media = turma.calcularMedia();
        System.out.println("Média da turma: " + media);

        // 4. Imprime o nome e a nota do melhor aluno retornado por encontrarMelhorAluno()
        Aluno melhorAluno = turma.encontrarMelhorAluno();
        if (melhorAluno != null) {
            System.out.println("Melhor aluno: " + melhorAluno.getNome() + " (Nota: " + melhorAluno.getNota() + ")");
        }
    }
}
