package aula4.exercicios;

import java.util.Scanner;

// Escreva um algoritmo para pedir que o usuário digite números positivos, ou seja, ele pode digitar quantos
// números positivos ele quiser. Para parar de digitar números, ele deve digitar -1. Após o usuário digitar
// -1, o programa deve escrever na tela quantos números o usuário digitou (a quantidade de números lidos) e
// a soma total dos números que ele digitou.
public class exercicio8 {
    public static void main(String[] args) throws InterruptedException {
        Scanner ler = new Scanner(System.in);
        double n1, n2 = 0;
        int c = 1;
        double s;

        System.out.println("Digite um numero positivo:");
        n1 = ler.nextDouble();
        while (n1 > 0) {
            System.out.println("Digite outro numero:");
            n2 = ler.nextDouble();
            c++;
        }


    }
}
