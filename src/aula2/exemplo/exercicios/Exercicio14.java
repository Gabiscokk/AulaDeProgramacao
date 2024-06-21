/*Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
Sabendo-se que o preço do combustível é de R$ 4,15, escreva um programa para ler:
a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia,
o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros.
Calcular e escrever: a média do consumo em Km/L e o lucro (líquido) do dia.*/

package aula2.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        double preçComb = 4.15;
        double marcHodometI;
        double marcHodometF;
        double litrosGast;
        double valorRec;
        double mediaConsum;
        double lucroLiq;

        System.out.println("Digite a marcação do hodômetro (Km) no início do dia:");
        marcHodometI = ler.nextDouble();
        System.out.println("Digite a marcação do hodômetro (Km) no final do dia:");
        marcHodometF = ler.nextDouble();
        System.out.println("Digite o número de litros gastos:");
        litrosGast = ler.nextDouble();
        System.out.println("Digite o total recebido dos passageiros:");
        valorRec = ler.nextDouble();

        mediaConsum = (marcHodometF - marcHodometI) / litrosGast;
        lucroLiq = valorRec - litrosGast * preçComb;

        System.out.println("Você obteve uma média de consumo de " +mediaConsum+ " Km/L");
        System.out.println("Seu lucro do dia equivale a R$ " +lucroLiq);

    }
}
