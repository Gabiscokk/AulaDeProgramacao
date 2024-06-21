/*Uma equipe de Fórmula 1 deseja calcular o número mínimo de
litros que deverá colocar no tanque de seu carro para que ele
possa percorrer um determinado número de voltas até o primeiro
reabastecimento. Escreva um programa que leia o comprimento da
pista (em metros), o número total de voltas a serem percorridas
no grande prêmio, o número de reabastecimentos desejados e o
consumo de combustível do carro (em Km/L). Calcular e escrever
o número mínimo de litros necessários para percorrer até o primeiro
reabastecimento. Observação: Considere que o número de voltas entre
os reabastecimentos é o mesmo. */

package aula2.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        float compPista;
        float numVoltas;
        float numReabas;
        float consCarro;
        float litrMin;
        float compPistaTotal;
        float distReabas;

        System.out.println("Digite o comprimento da pista em metros:");
        compPista = ler.nextFloat();
        System.out.println("Digite o número total de voltas a serem percorridas:");
        numVoltas = ler.nextFloat();
        System.out.println("Digite o número de reabastecimentos desejados:");
        numReabas = ler.nextFloat();
        System.out.println("Digite o consumo de combustível do carro: (Km/L)");
        consCarro = ler.nextFloat();

        //Comprimento total da pista para vencer o prêmio (em Km/L)
        compPistaTotal = compPista / 1000 * numVoltas;
        //Distância que o carro deve andar antes de cada abastecimento
        distReabas = compPistaTotal / numReabas;
        litrMin = distReabas / consCarro;

        System.out.println("Será necessário ter no mínimo " +litrMin+ " litros no tanque do veículo");
    }
}
