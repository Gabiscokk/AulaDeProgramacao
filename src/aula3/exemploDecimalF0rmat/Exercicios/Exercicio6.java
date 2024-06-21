/*Faça um programa que solicite ao usuário digitar dois valores,
em seguida, exiba na tela qual dos dois é o maior. OBS: o usuário
poderá informar valores iguais, logo, o sistema deve dizer que foram
digitados valores iguais. */

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int valor1 = ler.nextInt();
        System.out.println("Digite outro valor:");
        int valor2 = ler.nextInt();

        if(valor1>valor2){
            System.out.println("O valor " +valor1+ " é maior que o valor " +valor2);
        }
        else if(valor2>valor1){
            System.out.println("O valor " +valor2+ " é maior que o valor " +valor1);
        }
        else{
            System.out.println("Ambos os valores digitados são iguais");
        }
    }
}
