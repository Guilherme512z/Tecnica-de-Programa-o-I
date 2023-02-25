package Condicional_e_Loopings_em_Java;

import java.util.Scanner;

// 17/08/2022 data da elaboração

//  O cardápio de uma lanchonete é o seguinte:Especificação Código Preço Cachorro quente 100 1,20 Bauru simples 101 1,30 Bauru com ovo 102 1,50 Hambúrger 103 1,20 Cheeseburguer 104 1,30 Refrigerante 105 1,00 Faça um programa na Linguagem Java que leia o código do item pedido, a  quantidade e calcule o valor a ser pago por aquele lanche. Considere que a cada execução somente será calculado um item.

public class App5 {
    public static void main(String[] args) {
        int codigo, qtde;
        double valor, total;
        Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
        // Entrada de dados
        System.out.println("Cardápio");
        System.out.println("Especificação Código Preço");
        System.out.println("Cachorro Quente 100 1,20");
        System.out.println("Bauru Simples 101 1,30");
        System.out.println("Bauru com ovo 102 1,50");
        System.out.println("Hambúrger 103 1,20");
        System.out.println("Cheeseburguer 104 1,30");
        System.out.println("Refrigerante 105 1,00");
        System.out.println("Digite o código do produto");
        codigo = meuScanner.nextInt();
        System.out.println("Digite a quantidade");
        qtde = meuScanner.nextInt();
        // Processamento
        switch (codigo) {
            case 100:
                valor = 1.2;
                break;
            case 101:
                valor = 1.3;
                break;
            case 102:
                valor = 1.5;
                break;
            case 103:
                valor = 1.2;
                break;
            case 104:
                valor = 1.3;
                break;
            case 105:
                valor = 1.0;
                break;
            default:
                valor = 0.0;
        }
        total = qtde * valor;
        // Saida
        System.out.println("O total é " + total);
    }
}