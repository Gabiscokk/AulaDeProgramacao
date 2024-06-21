/*Ler o código de um produto e exibir seu tipo de acordo com a tabela a seguir:*/

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Tabela de produtos:");
        System.out.println("Código: 1 -> Nome do produto: Caderno");
        System.out.println("Código: 2 -> Nome do produto: Lápis");
        System.out.println("Código: 3 -> Nome do produto: Borracha");
        System.out.println("Código: Qualquer código -> Nome do produto: Diversos");
        System.out.println("Escolha um produto:");
        int opc = ler.nextInt();

        if(opc == 1) {
           System.out.println("Caderno") ;
        }
        else if(opc == 2) {
            System.out.println("Lápis");
        }
        else if(opc == 3) {
            System.out.println("Borracha");
        }
        else {
            System.out.println("Diversos");
        }
    }
}
