/*A jornada de trabalho semanal de um funcionário é de 40 horas.
O funcionário que trabalhar mais de 40 horas receberá hora extra,
cujo cálculo é o valor da hora regular com um acréscimo de 50%.
Escreva um algoritmo que leia o número de horas trabalhadas em um
mês, o salário por hora e escreva o salário total do funcionário,
que deverá ser acrescido das horas extras, caso tenham sido
trabalhadas (considere que o mês possua 4 semanas exatas). */

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main (String[] srgs) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número de horas trabalhadas em um mês:");
        int horaM = ler.nextInt();
        System.out.println("Digite o salário por hora:");
        double salarioH = ler.nextDouble();

        int horasTrabMes = 40 * 4;
        if(horaM == horasTrabMes) {
            double salarioTotSExtras = horaM * salarioH;
            System.out.println("Seu salário resulta em: R$ "+salarioTotSExtras);
        } else if(horaM > horasTrabMes) {
            int horasExt = horaM - horasTrabMes;
            double horasExtGan = (double) horasExt * 1.5;
            double salarioTotCExtras = horasTrabMes * salarioH + horasExtGan;
            System.out.println("Seu salário resulta em: R$ "+salarioTotCExtras);
        } else {
            System.out.println("[ATENÇÃO] Você não cumpriu sua horas de jornada trabalhado por mês");
            double salarioTotSExtras = horaM * salarioH;
            System.out.println("Seu salário resulta em: R$ "+salarioTotSExtras);
        }
    }
}
