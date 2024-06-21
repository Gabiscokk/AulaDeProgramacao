/*Escreva um programa em Java que recebe um inteiro e
diga se é par ou ímpar. Use o operador matemático %
(resto da divisão ou módulo) e o teste condicional if */

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int parImpar = ler.nextInt();

        if(parImpar % 2 == 0){
            System.out.println("Número par");
        }
        else{
            System.out.println("Número ímpar");
        }
    }



}
