/*Solicite o nome e a idade de duas pessoas.
Em seguida exiba o nome da pessoa mais velha
e o nome da pessoa mais nova. */

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa:");
        String nomeP1 = ler.next();
        System.out.println("Digite a idade da primeira pessoa:");
        int idadeP1 = ler.nextInt();
        System.out.println("Digite o nome da segunda pessoa:");
        String nomeP2 = ler.next();
        System.out.println("Digite a idade da segunda pessoa:");
        int idadeP2 = ler.nextInt();

        if(idadeP1 > idadeP2) {
            System.out.println(nomeP1+" é o mais velho com "+idadeP1+" anos de idade.");
        }
        else if(idadeP1 < idadeP2) {
            System.out.println(nomeP2+" é o mais velho com "+idadeP2+" anos de idade.");
        }
        else {
            System.out.println(nomeP1+" e "+nomeP2+" possuem a mesma idade, "+idadeP1+" anos.");
        }
    }
}
