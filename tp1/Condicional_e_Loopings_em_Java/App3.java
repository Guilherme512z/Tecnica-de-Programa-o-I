package Condicional_e_Loopings_em_Java;

// 17/08/2022 data da elaboração

// efetue a leitura de cinco números inteiros e identificar o maior e o menor valor. Não execute a ordenação de valores.

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        int n1, n2, n3, n4, n5, maior, menor;
        String mensagem;
        Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner

        // Entrada de dados
        System.out.println("Digite o primeiro número");
        n1 = meuScanner.nextInt();
        System.out.println("Digite o segundo número");
        n2 = meuScanner.nextInt();
        System.out.println("Digite o terceiro número");
        n3 = meuScanner.nextInt();
        System.out.println("Digite o quarto número");
        n4 = meuScanner.nextInt();
        System.out.println("Digite o quinto número");
        n5 = meuScanner.nextInt();

        // Processamento
        if (n1 > n2) {
            maior = n1;
            menor = n2;
        } else {
            maior = n2;
            menor = n1;
        }
        if (n3 > maior)
            maior = n3;
        if (n4 > maior)
            maior = n4;
        if (n5 > maior)
            maior = n5;
        if (n3 < menor)
            menor = n3;
        if (n4 < menor)
            menor = n4;
        if (n5 < menor)
            menor = n5;
        // Saida

        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
    }
}
