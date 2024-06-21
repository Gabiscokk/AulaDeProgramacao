package aula2.exemplo;

import java.util.Scanner;

public class Exemplo1 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número:");
        numero = ler.nextInt();
        System.out.println("O número é "+numero);

        float numeroR;
        System.out.print("Digite um número real:");
        numeroR = ler.nextFloat();
        System.out.println("O número é "+numeroR);
        System.out.printf("O número é %.2f\n", numeroR);


    }
}
