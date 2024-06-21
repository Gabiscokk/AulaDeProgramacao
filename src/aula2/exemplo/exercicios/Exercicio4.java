/*Escreva uma classe Java que converta metros para centímetros*/

package aula2.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);
        float medMetros;

        System.out.println("Digite a medida em metros:");
            medMetros = ler.nextFloat();

            float converCm = medMetros * 100;

            System.out.println("A conversão resulta em " +converCm+" centímetros");

    }
}
