package aula4.exercicios;
//Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, calcular e imprimir
// a média (simples) desse aluno.
// Só devem ser aceitos valores válidos durante a leitura de cada nota (notas válidas: 0.0 a 10.0).
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        float m;

        while (n1 > 10 || n1 < 1 || n2 > 10 || n1 < 1) {
                System.out.print("Digite suas duas notas: ");
                n1 = ler.nextInt();
                n2 = ler.nextInt();
                if (n1 < 10 && n1 > 1 || n2 < 10 && n1 > 1) {
                    m = (n1+n2/2);
                    System.out.println("Sua média é "+m);
            }

        }




    }
}
