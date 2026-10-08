package AtividadeSem07.AtvII;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void matricular(Aluno aluno) {
        // TODO: adicione aluno na lista "alunos"
        alunos.add(aluno);
    }

    public double calcularMedia() {
        // TODO: percorra "alunos", some as notas e divida pela quantidade de alunos
        // (cuidado com o caso de a turma estar vazia!)
        if (alunos.isEmpty()) {
            return 0.0;
        }

        double somaNotas = 0;
        for (Aluno a : alunos) {
            somaNotas += a.getNota();
        }
        return somaNotas / alunos.size();
    }

    public Aluno encontrarMelhorAluno() {
        // TODO: percorra "alunos" e retorne o Aluno com a maior nota
        if (alunos.isEmpty()) {
            return null;
        }

        Aluno melhor = alunos.get(0);
        for (int i = 1; i < alunos.size(); i++) {
            Aluno atual = alunos.get(i);
            if (atual.getNota() > melhor.getNota()) {
                melhor = atual;
            }
        }
        return melhor;
    }
}
