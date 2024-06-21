package aula5.exercicios;

import java.util.Scanner;
//Declarar um vetor de até 100 números inteiros positivos, pedir para o usuário digitar elementos para o vetor
// até que ele digite um 0 ou que o vetor esteja cheio, que encerra a leitura. Mostrar o vetor lido.
public class exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int t = 100;
        int[] cem = new int[t];
        for (int i = 1; i < t; i++) {
            System.out.print("Digite o numero ");
            cem[i] = ler.nextInt();
            if (cem[i] == 0) {
            t = i;}


        }
        for (int i = 1; i < t; i++)
            System.out.print(" " + cem[i]);
    }
    }



