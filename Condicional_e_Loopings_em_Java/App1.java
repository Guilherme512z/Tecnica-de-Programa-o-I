package Condicional_e_Loopings_em_Java;

// 17/08/2022 data da elaboração

// leia quatros valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o valor da média do aluno para qualquer condição.

import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, media;
        String mensagem;
        Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
        // Entrada de dados
        System.out.println("Digite a primeira nota");
        nota1 = meuScanner.nextFloat();
        System.out.println("Digite a segunda nota");
        nota2 = meuScanner.nextFloat();
        System.out.println("Digite o terceira nota");

        nota3 = meuScanner.nextFloat();
        System.out.println("Digite o terceira nota");
        nota4 = meuScanner.nextFloat();
        // Processamento
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media >= 7) {
            mensagem = "Aluno aprovado com média " + media;
        } else {
            mensagem = "Aluno não foi aprovado - média " + media;
        }
        // Saida
        System.out.println(mensagem);

    }
}
