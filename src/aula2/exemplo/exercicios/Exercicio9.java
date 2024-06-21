/*Escreva uma classe Java que leia e imprima a soma e a multiplicação de dois números.*/

package aula2.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        float n1;
        float n2;
        float soma;
        float multiplicação;

        System.out.println("Digite o 1º número:");
        n1 = ler.nextFloat();

        System.out.println("Digite o 2º número:");
        n2 = ler.nextFloat();

        soma = n1 + n2;
        multiplicação = n1 * n2;

        System.out.println("A soma resulta em "+soma);
        System.out.println("A multiplicação resulta em "+multiplicação);


    }

}
