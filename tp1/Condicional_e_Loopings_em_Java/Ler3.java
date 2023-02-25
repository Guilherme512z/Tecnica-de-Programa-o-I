package Condicional_e_Loopings_em_Java;

// 17/08/2022 data da elaboração

// programa na Linguagem Java que leia 3 (três) valores inteiros e apresente os 3 números em ordem crescente.

import java.util.Scanner;

public class Ler3 {
    public static void main(String[] args) {
    int n1,n2,n3, aux;
    Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
    //Entrada de dados 
    System.out.println("Digite o primeiro número");
    n1 = meuScanner.nextInt();
    System.out.println("Digite o segundo número");
    n2 = meuScanner.nextInt();
    System.out.println("Digite o terceiro número");
    n3 = meuScanner.nextInt();
        
    //Processamento

    if(n1 > n2){
        aux = n1;
        n1 =n2;
        n2 = aux;
            
     }
     if (n2> n3){
        aux = n2;
        n2 =n3;
        n3 = aux;
     }
        if(n1 > n2){
        aux = n1;
        n1 =n2;
        n2 = aux;
            
     }
            
            
     //Saida

     System.out.println( " O primeiro número é " + n1);
     System.out.println( " O primeiro número é " + n2);
     System.out.println( " O primeiro número é " + n3);


    }
    
}
