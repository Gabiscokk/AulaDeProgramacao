/*1) Crie um programa em que o usuário informa
o nome de um mês (ex: janeiro) e o programa exibe
o número correspondente a esse mesmo mês (ex: 1);*/

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome do mês:");
        String mes = ler.next();

        switch(mes){
            case "janeiro" -> System.out.println("O mês janeiro corresponde ao número 1");
            case "fevereiro" -> System.out.println("O mês fevereiro corresponde ao número 2");
            case "março" -> System.out.println("O mês março corresponde ao número 3");
            case "abril" -> System.out.println("O mês março corresponde ao número 4");
            case "maio" -> System.out.println("O mês maio corresponde ao número 5");
            case "junho" -> System.out.println("O mês junho corresponde ao número 6");
            case "julho" -> System.out.println("O mês julho corresponde ao número 7");
            case "agosto" -> System.out.println("O mês agosto corresponde ao número 8");
            case "setembro" -> System.out.println("O mês setembro corresponde ao número 9");
            case "outubro" -> System.out.println("O mês outubro corresponde ao número 10");
            case "novembro" -> System.out.println("O mês novembro corresponde ao número 11");
            case "dezembro" -> System.out.println("O mês dezembro corresponde ao número 12");
            default -> System.out.println("Mês inválido ou não existe");
        }
    }
}
