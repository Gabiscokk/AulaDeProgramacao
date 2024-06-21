/*Faça um algoritmo para ler: número da conta do cliente,
saldo, débito e crédito. Após, calcular e escrever o saldo
atual (saldo atual = saldo - débito + crédito). Também testar
se saldo atual for maior ou igual a zero escrever a mensagem
'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. */

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número da sua conta:");
        int numCont = ler.nextInt();
        System.out.println("Digite o saldo da sua conta:");
        double saldo = ler.nextDouble();
        System.out.println("Digite o débito da sua conta:");
        double deb = ler.nextDouble();
        System.out.println("Digite o crédito da sua conta:");
        double cred = ler.nextDouble();

        double saldoAtual = saldo - deb + cred;

        if(saldoAtual >= 0) {
            System.out.println("Saldo positivo!");
        } else {
            System.out.println("Saldo negativo!");
        }


    }
}
