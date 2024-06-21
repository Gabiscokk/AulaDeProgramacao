package aula4.exercicios;

import java.util.Scanner;

//Escreva um algoritmo que leia 10 valores
// conte quantos deles estão no intervalo entre 10 e 20. Depois escreva essa informação
public class exercicio2 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont = 0;
        int i;
        while (cont <= 10) {
            System.out.print("Digite um numero: ");
            i = ler.nextInt();
            if (i > 10 && i < 20) {
                System.out.println("O numero "+i+" esta no intervalo");
            }

            else {
                System.out.println("O numero "+i+" não esta no intervalo");
            }
            cont++;
        }

    }}
