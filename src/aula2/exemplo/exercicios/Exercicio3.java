package aula2.exemplo.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {

            Scanner ler = new Scanner(System.in);
            float nota1;
            float nota2;
            float nota3;
            float nota4;
            System.out.println("Digite sua 1ª nota:");
                nota1 = ler.nextFloat();
            System.out.println("Digite sua 2ª nota:");
                nota2 = ler.nextFloat();
            System.out.println("Digite sua 3ª nota:");
                nota3 = ler.nextFloat();
            System.out.println("Digite sua 4ª nota:");
                nota4 = ler.nextFloat();

                float media = (nota1 + nota2 + nota3 + nota4) / 4;

                System.out.println("A média das notas é "+media);
    }
}
