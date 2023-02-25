//10/08/2022 data da elaboração

//para ler dois valores inteiros para as variáveis A e B e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

import java.util.Scanner;

public class App2 {
     public static void main(String[] args) {
    /*
     * 11. Faça um programa na Linguagem Java para ler dois valores 
     inteiros para as
     * variáveis A e B e efetuar a troca dos valores de forma que a 
     variável A passe
     * a
     * possuir o valor da variável B e a variável B passe a possuir o 
     valor da
     * variável A.
     * Apresentar os valores trocados.
     */
     int a;
     int b;
     int aux;

     Scanner sc = new Scanner(System.in);
     // entrada de dados
     System.out.println(" Digite o valor de A");
     a = sc.nextInt();
     System.out.println(" Digite o valor de B");
     b = sc.nextInt();
     // Processamento
     aux = a;
     a = b;
     b = aux;
     // saida
     System.out.println(" Numero A: " + a);
     System.out.println(" Numero B: " + b);


    }
}
