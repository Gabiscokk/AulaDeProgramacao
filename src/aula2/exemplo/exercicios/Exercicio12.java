/*Crie uma classe java que leia dois números inteiros e que depois mostre:
O primeiro valor elevado ao segundo valor use Math.pow(número, expoente)
O primeiro valor vezes o segundo valor
O número inverso do primeiro valor (1/número)
A soma do segundo número com a metade do primeiro número
A diferença do primeiro número com o segundo
O número oposto ao primeiro valor (número *(-1))
*/

package aula2.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        int valorUm;
        int valorDois;

        System.out.println("Digite o primeiro número:");
        valorUm = ler.nextInt();

        System.out.println("Digite o segundo número:");
        valorDois = ler.nextInt();

        int exp;
        exp = (int)(Math.pow(valorUm,valorDois));
        System.out.println("A exponenciação resulta em " +exp);

        int mult;
        mult = valorUm * valorDois;
        System.out.println("A multiplicação dos valores resulta em " +mult);

        double inver;
        inver = 1 / (float)valorUm;
        System.out.println("O inverso do 1º valor é " +inver);

        float soma;
        soma = valorDois + (float)valorUm/2;
        System.out.println("A soma do 2º valor com a metade do primeiro resulta em " +soma);

        int dif;
        dif = valorUm - valorDois;
        System.out.println("A diferença do primeiro valor com o segundo resulta em " +dif);

        float opos;
        opos = (valorUm *(-1));
        System.out.println("O oposto do primeiro valor resulta em " +opos);
    }
}
