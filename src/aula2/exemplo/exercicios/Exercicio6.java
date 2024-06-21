/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês*/

package aula2.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        float valorHora;
        float horaMes;
        float salario;

        System.out.println("Qual o valor você recebe por hora:");
        valorHora = ler.nextFloat();

        System.out.println("Quantas horas você trabalha por mês:");
        horaMes = ler.nextFloat();

        salario = valorHora * horaMes;

        System.out.println("Seu salário equivale em R$ " +salario);
    }
}
