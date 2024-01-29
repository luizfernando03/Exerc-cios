public class NotaAluno {

    public static void main(String[] args) {
        double[][] alunos = {
                {7.5, 8.0, 6.5, 6.0},  // aluno1
                {8.0, 1.5, 5.5, 3.8},  //
                {1.5, 3.0, 2.0, 1.5}  //
        };
        double media = 0;
        int linha;
        for (linha = 0; linha < alunos.length; linha++) {
            double somaNotas = 0;
            for (int conluna = 0; conluna < alunos[linha].length; conluna++) {
                somaNotas = somaNotas + alunos[linha][conluna];
            }

            media = somaNotas / alunos[linha].length;

        }
        if (media >= 6.5) {
            System.out.println("aluno " + (+ +1) + "Foi aprovado");

        } else {
            System.out.println("aluno " + (+ +1) + "Foi Reprovado ");
        }
    }

}
