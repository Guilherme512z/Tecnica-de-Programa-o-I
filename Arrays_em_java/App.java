package Arrays_em_java;

//  17/08/2022 data da elaboração

//. Criar uma coleção na linguagem Java com 10 elementos – Inserir os elementos de 1 a 10 no vetor– Após a inserção, somente após a inserção mostrar o vetor.Obs. Não efetuar a leitura de 10 elementos

public class App {
    public static void main(String[] args) {
        // criação dos vetores
        int[] A = new int[10];
        // inicializa os vetores
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }
        // saida
        for (int i = 0; i < A.length; i++) {
            System.out.println("A: " + A[i]);
        }
    }
}
