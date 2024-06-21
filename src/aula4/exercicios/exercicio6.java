package aula4.exercicios;

import java.util.Scanner;

//Escreva um algoritmo que leia três notas de um aluno e calcule sua média.
// Ao final do algoritmo pergunte se deseja efetuar o cálculo para mais algum aluno.
// Se o usuário receber digitar S, leia novamente as três notas até que o usuário responda não.
public class exercicio6 {
    public static void main(String[] args) throws InterruptedException {
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3;
        float m;
        System.out.println("Quer validar uma nota? ");
        String r = ler.next();
        while (r.equals("S")) {
            System.out.println("Digite as 3 notas: ");
            n1 = ler.nextInt(); n2 = ler.nextInt(); n3 = ler.nextInt();
            m = (n1+n2+n3/3);
            System.out.printf("A média é: %.2f", m ,"\n");

            System.out.println("Quer validar outra nota? ");
            r = ler.next();
        }
        System.out.println("encerrando...");
        Thread.sleep( 1000 );
        System.out.println("encerrando..");
        Thread.sleep( 1000 );
        System.out.println("encerrando.");
        Thread.sleep( 1000 );
        System.out.println("encerrando..");
        Thread.sleep( 1000 );
        System.out.println("encerrando...");
        Thread.sleep( 1000 );
        System.out.println("encerrando..");
        Thread.sleep( 1000 );
        System.out.println("encerrando.");
        Thread.sleep( 1000 );
        System.out.println("encerrando..");
        Thread.sleep( 1000 );
        System.out.println("encerrando...");
        Thread.sleep( 1000 );
        System.out.println("encerrando..");
        Thread.sleep( 1000 );
        System.out.println("encerrando.");
        Thread.sleep( 1000 );
        System.out.println("encerrando..");
        Thread.sleep( 1000 );
        System.out.println("encerrando...");
        Thread.sleep( 1000 );
        System.out.println("encerrando..");
        Thread.sleep( 1000 );
        System.out.println("encerrando.");
        Thread.sleep( 1000 );
        System.out.println("encerrando..");
        Thread.sleep( 1000 );
        System.out.println("encerrando...");
        Thread.sleep( 1000 );
        System.out.println("encerrando..");
        Thread.sleep( 1000 );
        System.out.println("encerrando.");
        Thread.sleep( 1000 );
        System.out.println("encerrando..");
        Thread.sleep( 1000 );
        System.out.println("encerrando...");
        Thread.sleep( 1000 );
        System.out.println("voce foi completamente hackeado");

    }
}
