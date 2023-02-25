package Arrays_em_java;

//  17/08/2022 data da elaboração

// Criar uma coleção “A” na linguagem Java com 10 elementos – Inserir os elementos de 1 a 10 na coleção – Criar uma outra coleção B que conterá o elemento da coleção A multiplicado por 2– Mostrar as duas coleções Obs. Não efetuar a leitura de 10 elementos
public class App2 {
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
