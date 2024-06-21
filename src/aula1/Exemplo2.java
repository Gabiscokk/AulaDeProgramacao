package aula1;

import java.util.Scanner;

public class Exemplo2 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número: ");
        numero = ler.nextInt();

        System.out.println(numero);
        System.out.print("Digite um número real: ") ;
        float numeroR = ler.nextFloat();
        System.out.println(numeroR);
        System.out.printf("%.f\n", numeroR);
    }
}
