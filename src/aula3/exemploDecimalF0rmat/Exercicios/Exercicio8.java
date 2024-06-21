/*8) A calculadora de Luciana pifou, justo quando ela
precisa fazer vários cálculos. Ela tem um computador,
mas não sabe que um dos acessórios do Windows é uma
calculadora. Sendo estudante de programação, Luciana
resolveu fazer um programa. A especificação que bolou
prevê que programa leia dois números inteiros (o que atende
suas necessidades) e em seguida um símbolo de operação. Se
este for '+', o programa soma os números, se '-', subtrai, se
'*' multiplica e se '/' divide. Se o símbolo for diferente desses,
é mostrada uma mensagem de erro. O programa, antes de dividir,
critica se o divisor é zero e mostra uma mensagem de erro.
Implemente um programa que construa essa calculadora para Luciana */

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int n1 = ler.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = ler.nextInt();
        ler.nextLine();
        System.out.println("Qual operação deve ser realizada?");
        System.out.println("(+) -> Para realizar uma adição");
        System.out.println("(-) -> Para realizar uma subtração");
        System.out.println("(*) -> Para realizar uma multiplicação");
        System.out.println("(÷) -> Para realizar uma divisão");
        System.out.println("Escolha uma opção acima:");
        char opc = ler.nextLine().charAt(0);

        switch(opc) {
            case '+' -> {
                int soma = n1 + n2;
                System.out.println(soma);
            }
            case '-' -> {
                int subtracao = n1 - n2;
                System.out.println(subtracao);
            }
            case '*' -> {
                int multiplicacao = n1 * n2;
                System.out.println(multiplicacao);
            }
            case '/' -> {
                double divisao = (double) n1 / n2;
                System.out.println(divisao);
            }
            default -> {
                System.out.println("[ERROR] Símbolo inválido!");
            }
        }
    }
}
