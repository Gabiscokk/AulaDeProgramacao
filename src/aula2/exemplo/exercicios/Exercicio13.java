/*Escreva um programa para ler as dimensões de uma cozinha retangular
(comprimento, largura e altura), calcular e escrever a quantidade de
caixas de azulejos para se colocar em todas as suas paredes. Também
deve ser lido um valor equivalente a área das Janelas e portas para
descontar da área total. Cada caixa de azulejos possui 1,5 m2.*/

package aula2.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        float compr;
        float larg;
        float altu;
        float areaJanPor;
        float areaTotal;
        float quantAzulej;

        System.out.println("Digite o comprimento da cozinha:");
        compr = ler.nextFloat();
        System.out.println("Digite a largura da cozinha:");
        larg = ler.nextFloat();
        System.out.println("Digite a altura da cozinha:");
        altu = ler.nextFloat();
        System.out.println("Digite a área total das janelas e portas:");
        areaJanPor = ler.nextFloat();

        areaTotal = (larg + compr + larg + compr) * altu;
        areaTotal = areaTotal - areaJanPor;
        quantAzulej = areaTotal / (float)1.5;

        System.out.println("Você possui um total de área das paredes em " +areaTotal+ "m²");
        System.out.println("Será necessário comprar " +quantAzulej+ " caixas de azulejo");
    }
}
