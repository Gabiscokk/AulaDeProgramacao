/*Escreva um algoritmo que leia 4 valores i, a, b, c escrever os valores lidos e em seguida
Se i = 1 escrever os três valores em ordem crescente
Se i = 2 escrever os três valores em ordem decrescente
Se i = 3 Escrever o dobro dos três números
*/

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor para (i):");
        int i = ler.nextInt();
        System.out.println("Digite um valor para (a)");
        int a = ler.nextInt();
        System.out.println("Digite um valor para (b)");
        int b = ler.nextInt();
        System.out.println("Digite um valor para (c)");
        int c = ler.nextInt();

        switch(i){
            //a b c
            //a c b

            //b c a
            //b a c

            // c a b
            //c b a
            case 1 ->{
                if ( a < b && a < c){
                    if (b < c) {
                        System.out.println("Ordem crescente: "+a+ " , "+b+ " , "+c);
                    } else {
                        System.out.println("Ordem crescente: "+a+ " , "+c+ " , "+b);
                    }
                } else if (b < c && b < a) {
                    if(c < a) {
                        System.out.println("Ordem crescente: "+b+ " , "+c+ " , "+a);
                    } else {
                        System.out.println("Ordem crescente: "+b+ " , "+a+ " , "+c);
                    }
                } else if (c < a && c < b) {
                    if(a < b){
                        System.out.println("Ordem crescente: "+c+ " , "+a+ " , "+b);
                    } else {
                        System.out.println("Ordem crescente: "+c+ " , "+b+ " , "+a);
                    }
                }
            }case 2 ->{
                if ( a > b && a > c){
                    if (b > c) {
                        System.out.println("Ordem decrescente: "+a+ " , "+b+ " , "+c);
                    } else {
                        System.out.println("Ordem decrescente: "+a+ " , "+c+ " , "+b);
                    }
                } else if (b > c && b > a) {
                    if(c > a) {
                        System.out.println("Ordem decrescente: "+b+ " , "+c+ " , "+a);
                    } else {
                        System.out.println("Ordem decrescente: "+b+ " , "+a+ " , "+c);
                    }
                } else if (c > a && c > b) {
                    if(a > b){
                        System.out.println("Ordem decrescente: "+c+ " , "+a+ " , "+b);
                    } else {
                        System.out.println("Ordem decrescente: "+c+ " , "+b+ " , "+a);
                    }
                }
            }
            case 3 ->{
                int dobro = (a + b + c) * 2;
                System.out.println("Dobro dos valores: "+dobro);
            }
            default -> {
                System.out.println("[ATENÇÃO] Valor inválido para (i)");
            }
        }
    }
}
