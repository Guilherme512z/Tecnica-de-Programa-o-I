package Arrays_em_java;

//  17/08/2022 data da elaboração

// Criar um vetor A do tipo inteiro de 5 elementos – Solicitar os valores para o usuário e inserir no vetor A – Criar um vetor B do tipo inteiro  – Ler o vetor A e para cada elemento lido calcular o fatorial e gravar no B – Após de todos os elementos do vetor A, mostrar os dois vetores

import java.util.Scanner;

/* 
54. Criar um vetor A do tipo inteiro de 5 elementos
– Solicitar os valores para o usuário e inserir no vetor A
– Criar um vetor B do tipo inteiro 
– Ler o vetor A e para cada elemento lido calcular o fatorial e
gravar no B
– Após de todos os elementos do vetor A, mostrar os dois vetores
*/

public class App4 {
    public static void main(String[] args) {
        // criação dos vetores
        int[] A = new int[10];
        int[] B = new int[10];
        // inicializa os vetores
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }
        // multiplica o vetor a por 2
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * 2;
        }
        // saida
        for (int i = 0; i < A.length; i++) {
            System.out.println("A: " + A[i] + " B: " + B[i]);
        }
    }
}