// 10/08/2022 data da elaboração

//Apresentar a multiplicação dos dois números.

import java.util.Scanner; // Importando a Classe Scanner

public class Multiplica{

  public static void main(String[] args) {
    int n1;
    int n2;
    int soma;


    Scanner meuScanner = new Scanner(System.in); //Cria um objeto Scanner

    System.out.println("Digite 2 números e apresente a multiplicação");
    System.out.println("Digite o primeiro número");
    n1 = meuScanner.nextInt();
    System.out.println("Digite o segundo número");
    n2 = meuScanner.nextInt();

    soma = n1 * n2;

    System.out.println("O resultado da multiplicação é: " + soma);
   
    }
  }