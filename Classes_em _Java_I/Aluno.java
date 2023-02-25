// 24/08/2022 data da elaboração

/*Fazer um programa para ler os dados de um Aluno:
• RA;
• Nome;
• Endereço;
• Curso.
Em seguida, mostrar a tela todos os atributos. Utilize classe. */

public class Aluno {
    String ra;
    String nome;
    String endereco;
    String curso;

    public String MostrarAluno() {

        return "RA: " + ra + " Nome: " + nome + " Endereço: " + endereco + " Curso:" + curso;

    }

    public String MostrarCurso() {
        return " Curso: " + curso;
    }
}
