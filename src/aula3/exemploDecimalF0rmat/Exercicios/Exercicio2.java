/*Faça um programa que leia o nome e a idade de 1
nadador e exiba na tela o nome da categoria a qual
este nadador pertence. A categoria dos nadadores
é dada pela seguinte tabela:*/

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do nadador:");
        String nome = ler.next();

        System.out.println("Digite a idade do nadador:");
        int idade = ler.nextInt();

        if(idade>=5 && idade<=7){
            System.out.println("O nadador(a)" +nome+ "pertence a categoria Infantil A");
        }
        else if(idade>=8 && idade<=10){
            System.out.println("O nadador(a)" +nome+ "pertence a categoria Infantil B");
        }
        else if(idade>=11 && idade<=13){
            System.out.println("O nadador(a)" +nome+ "pertence a categoria Juvenil A");
        }
        else if(idade>=14 && idade<=17){
            System.out.println("O nadador(a)" +nome+ "pertence a categoria Juvenil B");
        }
        else if(idade>=18) {
            System.out.println("O nadador(a)" +nome+ "pertence a categoria Adulto");
        }
        else {
            System.out.println("Idade abaixo do esperado");
        }
    }
}
