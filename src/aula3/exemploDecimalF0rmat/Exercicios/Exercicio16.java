/*Faça um algoritmo para ler: quantidade atual em estoque,
quantidade máxima em estoque e quantidade mínima em estoque
de um produto. Calcular e escrever a quantidade média
((quantidade média = quantidade máxima + quantidade mínima)/2).
Se a quantidade em estoque for maior ou igual a quantidade
média escrever a mensagem 'Não efetuar compra', senão escrever
a mensagem 'Efetuar compra'.*/

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade atual em estoque:");
        int quantAtual = ler.nextInt();
        System.out.println("Digite a quantidade máxima em estoque:");
        int quantMax = ler.nextInt();
        System.out.println("Digite a quantidade mínima em estoque:");
        int quantMin = ler.nextInt();

        int quantMed = (quantMax + quantMin) / 2;

        if(quantAtual >= quantMed) {
            System.out.println("Não efetuar mais a compra deste produto");
        } else {
            System.out.println("Efetuar a compra deste produto");
        }
    }
}
