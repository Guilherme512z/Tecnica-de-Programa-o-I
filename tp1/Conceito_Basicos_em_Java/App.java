
// 10/08/2022 data da elaboração
//cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) * TEMPO).

import java.util.Scanner;

public class App{
      public static void main(String[] args) {
     /*
    09. Faça um programa na Linguagem Java para efetuar o cálculo e a 
    apresentação do valor de uma prestação em atraso, utilizando a 
    fórmula 
    PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) * TEMPO).
    */
     double prestacao, valor, taxa;
     int tempo;
     Scanner sc = new Scanner(System.in);
    // entrada de dados
     System.out.println(" Digite o valor da prestação");
     valor = sc.nextDouble();
     System.out.println(" Digite a taxa");
     taxa = sc.nextDouble();
     System.out.println(" Digite o tempo");
     tempo = sc.nextInt();
     // Processamento
     prestacao =valor + (valor * (taxa/100) * tempo);
     // saida
     System.out.println(" O valor da prestação é: " + prestacao);

    }
}