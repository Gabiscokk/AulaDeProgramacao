/*Faça um programa em Java que calcule a área de um círculo*/

package aula2.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        float raio;

        System.out.println("Digite o raio do círculo:");
        raio = ler.nextFloat();

        float area = (float)(Math.pow(raio,2)*Math.PI);
        area = raio*raio*(float)Math.PI;


        System.out.println("A área do círculo é " +area+ "cm²");
    }
}
