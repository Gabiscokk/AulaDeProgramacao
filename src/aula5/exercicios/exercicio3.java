package aula5.exercicios;
// Ler um vetor de números, de 10 elementos.
// Declarar outro vetor inverso, copiar todos os elementos de números de trás para frente para o vetor inverso.

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] vetorI = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor "+(i+1)+ " :" );
            vetor[i] = ler.nextInt();
        }
        for (int i = 0, j = 9; j < 10; i++, j--) {
            vetorI[i] = vetor[j];
            System.out.println(" "+vetorI[j]);
        }


    }
}
