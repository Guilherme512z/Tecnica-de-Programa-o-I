// 24/08/2022 data da elaboração

/*Fazer um programa para ler os dados de um Aluno:
• RA;
• Nome;
• Endereço;
• Curso.
Em seguida, mostrar a tela todos os atributos. Utilize classe. */

import java.util.Scanner;

public class AppAl {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.ra = "101010";
        aluno.nome = "Marcos Vasconcelos de Oliveira";
        aluno.endereco = "Rua teste, 120 ";
        aluno.curso = "DSM";
        System.out.println(aluno.MostrarAluno());
        System.out.println(aluno.MostrarCurso());
    }
}
