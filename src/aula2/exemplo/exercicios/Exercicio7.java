/*Faça uma classe Java que leia a altura e o peso de uma pessoa e calcule seu IMC IMC = peso/altura²*/

package aula2.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        float altura;
        float peso;
        float imc;

        System.out.println("Digite sua altura:");
        altura = ler.nextFloat();

        System.out.println("Digite seu peso:");
        peso = ler.nextFloat();

        imc = peso / (float)(Math.pow(altura,2));

        System.out.printf("Seu índice de massa corporal é de %.2f\n", imc);

    }
}
