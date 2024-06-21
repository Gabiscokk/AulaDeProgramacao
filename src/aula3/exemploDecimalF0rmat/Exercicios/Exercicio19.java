/*Escreva um algoritmo que leia o código de uma figura geométrica
(1 - triângulo, 2 - quadrado, 3 - círculo, 4 - retângulo). Depois
de escolhida a figura, leia as informações necessárias para calcular
a área da figura correspondente, calcule e escreva o valor da área.*/

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio19 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma opção para calcular a área:");
        System.out.println("1 -> Triângulo");
        System.out.println("2 -> Quadrado");
        System.out.println("3 -> Círculo");
        System.out.println("4 -> Retângulo");
        int opc = ler.nextInt();

        switch (opc) {
            case 1 -> {
                System.out.println("Digite a medida da base do triângulo");
                float base = ler.nextFloat();
                System.out.println("Digite a medida da altura do triângulo:");
                float alt = ler.nextFloat();
                float areaTrian = base * alt / 2;
                System.out.println("Área do triângulo: "+areaTrian);
            }
            case 2 -> {
                System.out.println("Digite a medida do lado do quadrado:");
                float lado = ler.nextFloat();
                float areaQuad = lado * lado;
                System.out.println("Área do quadrado: "+areaQuad);
            }
            case 3 -> {
                System.out.println("Digite a medida do raio do círculo:");
                float raio = ler.nextFloat();
                float areaCirc =  (float)(Math.PI * Math.pow(raio, 2));
                System.out.println("Área do círculo: "+areaCirc);
            }
            case 4 -> {
                System.out.println("Digite a medida da base do retângulo:");
                float base = ler.nextFloat();
                System.out.println("Digite a medida da altura do retângulo:");
                float alt = ler.nextFloat();
                float areaRetan = base * alt;
                System.out.println("Área do retângulo: "+areaRetan);
            }
            default -> {
                System.out.println("[ERROR] Opção inválida!");
            }
        }
    }
}
