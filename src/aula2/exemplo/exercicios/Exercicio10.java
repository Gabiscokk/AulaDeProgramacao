/*Escreva um programa que calcule a área e o perímetro de um quadrado*/

package aula2.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        float medLado;
        float area;
        float perimetro;

        System.out.println("Digite a medida do lado do quadrado:");
        medLado = ler.nextFloat();

        area = (float)(Math.pow(medLado, 2));
        perimetro = 4 * medLado;

        System.out.println("A área do quadrado é de " +area+ "cm²");
        System.out.println("O perímetro do quadrado é de " +perimetro+ "cm");


    }
}
