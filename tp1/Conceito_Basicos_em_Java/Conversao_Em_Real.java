//10/08/2022 data da elaboração

// efetue a apresentação do valor da conversão em real de um valor lido em dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário, para que seja apresentado o valorem moeda brasileira.

import java.util.Scanner; 

public class Conversao_Em_Real {
    public static void main(String[] args) {
        float real, dolar, qtde;
        Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
        //Entrada de dados 
        System.out.println("Qual o valor da cotacao do Dolar");
        dolar = meuScanner.nextFloat();
        System.out.println("Qual a quantidade de dolar(es)");
        qtde = meuScanner.nextFloat();
        //Processamento
        real = qtde * dolar;
        //Saida
        System.out.println( " O valor em real é " + real);
    }

}