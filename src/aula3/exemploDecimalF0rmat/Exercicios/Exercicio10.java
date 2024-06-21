/*A partir de 3 notas fornecidas de um aluno,
informe se ele foi aprovado, ficou de recuperação
ou foi reprovado. A média de aprovação é >= 7.0; a
média de recuperação é >= 5.0 e < 7.0; e a média do
reprovado é < 5.0 */

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a primeira nota do aluno(a):");
        double nota1 = ler.nextDouble();
        System.out.println("Informe a segunda nota do aluno(a):");
        double nota2 = ler.nextDouble();
        System.out.println("Informe a terceira nota do aluno(a):");
        double nota3 = ler.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7.0) {
            System.out.println("Aluno(a) aprovado(a)!");
        }
        else if(media >= 5.0 & media < 7.0) {
            System.out.println("Aluno(a) em recuperação!");
        }
        else {
            System.out.println("Aluno reprovado!");
        }
    }

}
