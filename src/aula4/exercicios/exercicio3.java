package aula4.exercicios;

import java.util.Scanner;

//Escreva um algoritmo para ler um valor entre 1 (inclusive) e 10 (inclusive).
// Se o valor lido não estiver entre 1 (inclusive) e 10 (inclusive), deve ser lido um novo valor.
// Após a leitura do valor, escrever o valor lido na tela.
public class exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int v = 0;
        while (v > 10 || v < 1) {
            System.out.print("Diga um valor: ");
            v = ler.nextInt();
        }
        System.out.println("valor valido");
    }

}
