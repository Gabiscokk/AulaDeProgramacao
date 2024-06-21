package aula4.exercicios;

import java.util.Scanner;

//Escreva um algoritmo para ler uma idade,
// mas o algoritmo deve aceitar somente idade válida, ou seja, o algoritmo deve “validar” a leitura da idade.
// Idade válida tem que ser maior que 0 e menor que 150. Escrever a idade lida
public class exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idd = 0;
        while (idd > 150 || idd < 1) {
            System.out.print("Diga sua idade: ");
            idd = ler.nextInt();
        }
        System.out.println("Idade valida");



    }

}
