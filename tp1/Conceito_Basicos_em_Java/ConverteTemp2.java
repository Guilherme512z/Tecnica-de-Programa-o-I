// 10/08/2022 data da elaboração

//leia uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A formula de conversão é C <-- (F - 32) * (5/9), sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner; // Importando a Classe Scanner

public class ConverteTemp2{

     public static void main(String[] args) {
     float celsius;
     float fahrenheit;
     Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
     //Entrada de dados 
     System.out.println("Digite a temperatura em graus Fahrenheit");
     fahrenheit = meuScanner.nextFloat();
     //Processamento
     celsius = (fahrenheit-32) * (5f/9f ) ;
     //Saida
     System.out.println(fahrenheit +" graus Fahrenheit equivale a " + celsius + " Celsius");

   }
} 