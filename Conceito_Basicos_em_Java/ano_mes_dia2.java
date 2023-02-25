// 10/08/2022 data da elaboração
//Contrário

import java.util.Scanner;

public class ano_mes_dia2 {
    public static void main(String[] args) {
        int ano, mes, dias; //criacao de variáveis
        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite sua idade em dias?");//entrada de  dados
        dias = sc.nextInt();
        ano = dias / 360;
        dias = dias % 360;
        mes = dias /30;
        dias = dias % 30;
        System.out.println("Você tem "+ ano + " ano(s) " + mes + "  Mes(es) " + dias + " dias" ); //saida
   
   
    } 
} 
    
