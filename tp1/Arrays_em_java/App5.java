package Arrays_em_java;

//  17/08/2022 data da elaboração

//Fazer um procedimento para receber as notas da primeira e da segunda prova de cinco alunos. Armazenar as notas da primeira e da segunda prova em vetores distintos. Calcular e escrever a média de cada aluno.

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        // declarar vetores
        double nota1[] = new double[5];
        double nota2[] = new double[5];
        double media;
        // cria um objeto scanner
        Scanner sc = new Scanner(System.in);
        // Entrada de dados
        System.out.println("Digite as 5 notas da primeira prova");
        for (int i = 0; i < nota1.length; i++) {
            nota1[i] = sc.nextDouble();
        }
        System.out.println("Digite as 5 notas da segunda prova");
        for (int i = 0; i < nota2.length; i++) {
            nota2[i] = sc.nextDouble();
        }
        // saida de dados
        for (int i = 0; i < nota1.length; i++) {
            // System.out.printf("A média do %dº aluno: %.2f.\n",i+1,(nota1[i] +
            // nota2[i])/2);
            media = (nota1[i] + nota2[i]) / 2;
            System.out.println("A média do " + (i + 1) + "º aluno: " + media);
        }
    }
}
