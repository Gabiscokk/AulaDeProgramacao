package aula5.exercicios;

import java.util.Scanner;

//  Ler dois vetores, A e B com um número variável de conteúdo (números) (no máximo 10).
//  O programa deve solicitar antes da leitura dos vetores a quantidade de dados a serem lidos (1 a 10),
//  os dois vetores terão o mesmo número de elementos. Gerar um terceiro vetor chamado Soma (de no máximo 10
//  elementos) que seja a soma dos dados do vetor A com os do vetor B.
public class exercicio1 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.print("Digite o tamanho dos dois vetores:");
        int t = ler.nextInt();

        int[] vetor1 = new int[t];
        int[] vetor2 = new int[t];
        int[] soma = new int[t];

        for (int i=0; i<t; i++ ) {
            System.out.print("Digite o numero "+(i+1)+" do vetor 1: ");
            vetor1[i] = ler.nextInt();
        }

        for (int i=0; i<t; i++ ) {
            System.out.print("Digite o numero "+(i+1)+" do vetor 2: ");
            vetor2[i] = ler.nextInt();
        }
        for (int i=0; i<t; i++ ) {
            soma[i] = vetor1[i]+vetor2[i];
            System.out.print(" "+soma[i]);
        }

    }
}
