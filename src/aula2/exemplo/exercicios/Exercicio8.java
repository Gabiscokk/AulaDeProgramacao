/*Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a
temperatura em graus Celsius. C = (5 * (F-32) / 9) */

package aula2.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        float tempF;
        float tempC;

        System.out.println("Digite a temperatura em Fahrenheit:");
        tempF = ler.nextFloat();

        tempC = (5 * (tempF-32) / 9);

        System.out.printf("A conversão da temperatura em graus Fahrenheit para graus Celsius, resulta em %.2f", tempC ,"Cº");



    }

}
