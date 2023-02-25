// 10/08/2022 data da elaboração

// calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: VOLUME <-- 3.14159 * RAIO2 * ALTURA.

import java.util.Scanner; // Importando a Classe Scanner

public class Volume{

    public static void main(String[] args) {
        float volume, raio, altura;
        Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
        //Entrada de dados 
        System.out.println("Digite o raio da circunferência");
        raio = meuScanner.nextFloat();
        System.out.println("Digite a altura");
        altura = meuScanner.nextFloat();
        //Processamento
        volume = 3.14159f * raio * raio * altura;
        //Saida
        System.out.println( " O volume é " + volume);

    }

}