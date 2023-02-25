package Condicional_e_Loopings_em_Java;

// 17/08/2022 data da elaboração

// Faça um programa na Linguagem Java que leia 3 números inteiros e mostre o maior deles.

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        int n1, n2, n3, maior;
        String mensagem;
        Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
        // Entrada de dados
        System.out.println("Digite o primeiro número");
        n1 = meuScanner.nextInt();
        System.out.println("Digite o segundo número");
        n2 = meuScanner.nextInt();
        System.out.println("Digite o terceiro número");
        n3 = meuScanner.nextInt();
        // Processamento
        if (n1 > n2) {
            maior = n1;
        } else {
            maior = n2;
        }
        if (n3 > maior)
            // Saida
            System.out.println("O maior número é " + maior);
    }
}
