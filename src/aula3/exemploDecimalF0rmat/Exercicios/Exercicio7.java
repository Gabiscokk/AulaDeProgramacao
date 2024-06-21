/*Crie um algoritmo que pergunte ao usuário se ele deseja
converter uma temperatura de graus Celsius em graus
Fahrenheit ou Fahrenheit em Celsius. Em seguida mostre
na tela o valor final correspondente à opção escolhida
pelo usuário. F = 1.8 * C + 32 | C = (F – 32) / 1.8;
 */

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma opção de conversão:");
        System.out.println("1 - De graus Celsius para Fahrenheit");
        System.out.println("2 - De graus Fahrenheit para Celsius");
        int opc = ler.nextInt();

        switch(opc) {
            case 1 -> {
                System.out.println("Digite a temperatura em graus Celsius:");
                double tempC = ler.nextDouble();
                double tempF = 1.8 * tempC + 32;
                System.out.println("A conversão de " +tempC+ " graus Celsius para Fahrenheit, resulta em " +tempF+ " ºF");
            }
            case 2 -> {
                System.out.println("Digite a temperatura em graus Fahrenehit:");
                double tempF = ler.nextDouble();
                double tempC = (tempF - 32) / 1.8;
                System.out.println("A conversão de " +tempF+ " graus Fahrenheit, resulta em " +tempC+ " ºC");
            }
            default -> System.out.println("[ERROR]");
        }
    }
}
