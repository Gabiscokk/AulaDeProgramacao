/*Criar um programa para identificar o valor a ser pago
por um plano de saúde dada a idade do conveniado considerando
que todos pagam R$ 100 mais um adicional conforme os seguintes dados:
a) crianças com menos de 10 anos pagam R$80;
b) conveniados com idade entre 10 e 30 anos pagam R$50;
c) conveniados com idade entre 40 e 60 anos pagam R$ 95;
d) conveniados com mais de 60 anos pagam R$130.
*/

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = ler.nextInt();
        double planoVal;

        if(idade < 10) {
            planoVal = 100 + 80;
            System.out.println("Plano de saúde: R$ "+planoVal);
        } else if(idade <= 30) {
            planoVal = 100 + 50;
            System.out.println("Plano de saúde: R$ "+planoVal);
        } else if(idade <= 60) {
            planoVal = 100 + 95;
            System.out.println("Plano de saúde: R$ "+planoVal);
        } else {
            planoVal = 100 + 130;
            System.out.println("Plano de saúde: R$ "+planoVal);
        }
    }
}
