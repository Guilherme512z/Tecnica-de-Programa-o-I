package Condicional_e_Loopings_em_Java;

//  17/08/2022 data da elaboração

//  para apresentar o total da soma obtida dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100).

import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        int soma;
        Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
        // Entrada de dados
        soma = 0;

        // Processamento
        for (int i = 1; i <= 100; i++) {
            soma += i;

        }
        // Saida
        System.out.println("A soma total do 100 primeiros números é " + soma);

    }
}