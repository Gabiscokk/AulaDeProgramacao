/*Crie um programa que teste se o valor que usuário digitou
está entre 10 e 15 e exibe alguma mensagem na tela. */

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = ler.nextInt();

        if(n>=10 && n<=15){
            System.out.println("Número aceito");
        }
        else{
            System.out.println("Número negado");
        }
    }
}
