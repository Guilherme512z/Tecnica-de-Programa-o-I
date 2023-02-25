
// 10/08/2022 data da elaboração
//leia a idade de uma pessoa expressa em ano, mês e dia e mostre-as em dias.

import java.util.Scanner;

public class ano_mes_dia {
     public static void main(String[] args) {
      int ano, mes, dia, dias;
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite quantos anos você tem?");
      ano = sc.nextInt();
      System.out.println("Digite quantos mes(es) você tem");
      mes = sc.nextInt();
      System.out.println("Digite quantos dia(s) você tem");
      dia = sc.nextInt();
      dias = (ano * 360) + (mes * 30) + dia;
      System.out.println("Você tem "+ dias );
     }
} 