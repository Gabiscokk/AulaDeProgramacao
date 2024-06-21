/*Ler 3 valores (considere que não serão informados
valores iguais) e escrevê-los em ordem crescente. */

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int v1 = ler.nextInt();
        System.out.println("Digite o segundo valor:");
        int v2 = ler.nextInt();
        System.out.println("Digite o terceiro valor:");
        int v3 = ler.nextInt();

        if ( v1 < v2 && v1 < v3){
            if (v2 < v3) {
                System.out.println("Ordem crescente: "+v1+ " , "+v2+ " , "+v3);
            } else {
                System.out.println("Ordem crescente: "+v1+ " , "+v3+ " , "+v2);
            }
        } else if (v2 < v3 && v2 < v1) {
            if(v3 < v1) {
                System.out.println("Ordem crescente: "+v2+ " , "+v3+ " , "+v1);
            } else {
                System.out.println("Ordem crescente: "+v2+ " , "+v1+ " , "+v3);
            }
        } else if (v3 < v1 && v3 < v2) {
            if(v1 < v2){
                System.out.println("Ordem crescente: "+v3+ " , "+v1+ " , "+v2);
            } else {
                System.out.println("Ordem crescente: "+v3+ " , "+v2+ " , "+v1);
            }
        }
    }
}
