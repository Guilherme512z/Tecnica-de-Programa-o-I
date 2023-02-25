package Condicional_e_Loopings_em_Java;

//  17/08/2022 data da elaboração

// apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O programa deve apresentar os valores das duas temperaturas.

import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        // Saida
        System.out.println("Conversão de graus Celsius em Fahrenheit, de 10 em 10 até 100 graus");
        for (int i = 10; i <= 100; i = i + 10) {
            System.out.println("Graus Celsius: " + i);
            System.out.println("Fahrenheit: " + (9 * i + 160) / 5 + "°F");
            System.out.println("");
        }
    }
}