// 10/08/2022 data da elaboração

// efetuar a leitura de um número inteiro e apresentar o resultado do quadrado desse número.

import java.util.Scanner;

public class App3 {

    public static void main(String[] args) {
        /*
        * 12. Faça um programa na Linguagem Java para 
       efetuar a leitura de um número
        * inteiro e apresentar o resultado do quadrado 
       desse número.
        */
        int a, quadrado;
        Scanner sc = new Scanner(System.in);
        // entrada de dados
        System.out.println(" Digite o valor de A");
        a = sc.nextInt();
        // Processamento
        quadrado = a * a;
        // saida
        System.out.println(" Quadrado de A: " + 
       quadrado);

       
    }
}
    

