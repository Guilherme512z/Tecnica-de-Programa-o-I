// 10/08/2022 data da elaboração

// ava que receba um número e mostre o resto da divisão por 6.


import java.util.Scanner; 

public class App4 {
    public static void main(String[] args) {
        /*
        13. Faça um programa na Linguagem Java que 
       receba um número e mostre o 
        resto da divisão por 6.
        */
        int a, resto;
        Scanner sc = new Scanner(System.in);
        // entrada de dados
        System.out.println(" Digite um número");
        a = sc.nextInt();
        // Processamento
        resto = a % 6;
        // saida
        System.out.println(" O resto da divisão por 6 é: " + resto);

        
    }
}
    

