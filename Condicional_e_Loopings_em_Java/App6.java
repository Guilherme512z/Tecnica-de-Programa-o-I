package Condicional_e_Loopings_em_Java;

//  17/08/2022 data da elaboração

// Faça um programa na Linguagem Java que que receba um número e mostre o fatorial desse número.

import java.util.Scanner;

public class App6 {

    public static void main(String[] args) {
        int n, fat;
        Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
        //Entrada de dados 
        System.out.println("Digite um número para cálculdo do fatorial");
        n = meuScanner.nextInt();
        fat = 1;
        //Processamento
        for(int i =1; i<=n; i++){
        fat *=i;
        }
        //Saida
        System.out.println( "O fatorial de "+ n + " é " + fat);

    } 
}
