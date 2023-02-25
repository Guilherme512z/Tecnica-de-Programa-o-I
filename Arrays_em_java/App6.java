package Arrays_em_java;

//  17/08/2022 data da elaboração

/* 
  Criar um vetor A do tipo inteiro de 5 elementos
 – Solicitar os valores para o usuário e inserir no vetor A
 – Criar um vetor B do tipo inteiro 
 – Ler o vetor A e para cada elemento lido calcular o fatorial e
 gravar no B
 – Após de todos os elementos do vetor A, mostrar os dois vetores
 */

import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {

        int[] a = new int[5];
        int[] b = new int[5];
        int fat;
        Scanner sc = new Scanner(System.in);
        // entrada de dados
        for (int i = 0; i < a.length; i++) {
            System.out.println(" Digite um número para cálculo de Fatorial: ");
            a[i] = sc.nextInt();
        }
        // carregar valores do vetor b com a
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        // cálculo de fatorial
        for (int i = 0; i < b.length; i++) {
            fat = 1;
            for (int j = 1; j <= b[i]; j++) {
                fat = fat * j;
            }
            b[i] = fat;
        }
        // saida
        for (int i = 0; i < a.length; i++) {
            System.out.println(" Numero: " + a[i] + " Fatorial: " + b[i]);
        }
    }
}
