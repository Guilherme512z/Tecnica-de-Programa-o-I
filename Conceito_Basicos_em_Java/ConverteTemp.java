// 10/08/2022 data da elaboração

// leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F <-- (9 * C + 160) /5, sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.


import java.util.Scanner; // Importando a Classe Scanner

public class ConverteTemp{

     public static void main(String[] args) {
     float celsius;
     float fahrenheit;
     Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
     //Entrada de dados 
     System.out.println("Digite a temperatura em graus Celsius");
     celsius = meuScanner.nextFloat();
     //Processamento
     fahrenheit = (9 * celsius + 160) /5;
     //Saida
     System.out.println(celsius +" graus Celsius equivale a " + fahrenheit + " Fahrenheit");
    }
}