package Condicional_e_Loopings_em_Java;

import java.util.Scanner;

// 17/08/2022 data da elaboração

// efetue a leitura de um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar.

public class App4 {
    public static void main(String[] args) {
        int n1;
        String mensagem;
        Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
        // Entrada de dados
        System.out.println("Digite um número");
        n1 = meuScanner.nextInt();
        // Processamento
        if (n1 % 2 == 0) {
            mensagem = "O número é par";
        } else {
            mensagem = "O número é impar";
        }
        // Saida
        System.out.println(mensagem);

    }
}
