package aula4.exercicios;

import java.util.Scanner;

//Faça um algoritmo para escrever de 1 a 10 na tela, utilizando a estrutura ENQUANTO e um CONTADOR.
public class exercicio1 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont = 0;
        while(cont<=10){
            System.out.print(cont + "");
            cont++;
        }
    }
}
