
//10/08/2022 data da elaboração

//calcule a área da circunferência.

import java.util.Scanner; 

public class area{

     public static void main(String[] args) {
        float area, raio;
        Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
        //Entrada de dados 
        System.out.println("Digite o raio da circunferência");
        raio = meuScanner.nextFloat();
        //Processamento
        area = 3.14159f * raio * raio;
        //Saida
        System.out.println( " O area é " + area);
    
    }
    
}
