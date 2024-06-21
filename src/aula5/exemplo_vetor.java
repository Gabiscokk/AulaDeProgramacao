package aula5;

import java.util.Scanner;

public class exemplo_vetor {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[10];
        int tamanho = vetor.length;

        for (int i=0; i<10; i++ ) {
            System.out.print("vetor["+i+"]: ");
            vetor[i] = ler.nextInt();
        }

        for (int i=0; i<10; i++ ) {
            System.out.print("vetor["+i+"]: ");
            vetor[i] = ler.nextInt();
        }

        for (int i=0; i< vetor.length;i++) {
            System.out.println();}


    }
    }

