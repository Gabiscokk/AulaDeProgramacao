/*Escreva um programa que calcula a área de um triângulo*/

package aula2.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float base;
        float altura;
        float areaTri;

        System.out.println("Digite a base do triângulo:");
        base = ler.nextFloat();

        System.out.println("Digite a altura do triângulo:");
        altura = ler.nextFloat();

        areaTri = base * altura / 2;

        System.out.println("A área do triângulo é de " +areaTri+ " cm²");
    }
}
