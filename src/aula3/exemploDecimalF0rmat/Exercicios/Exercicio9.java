/*Receba três valores fornecidos pelo usuário que representarão os lados de um triângulo.
Classifique esse triângulo como:
a) Equilátero: três lados iguais.
b) Isósceles: dois lados iguais.
c) Escaleno: três lados diferentes. Lembre-se de que, para formar um triângulo, nenhum dos
lados pode ser igual a zero, um lado não pode ser maior do que a soma dos outros dois.
*/

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Digite o valor do primeiro lado do triângulo:");
        double ladoUM = ler.nextFloat();
        System.out.println("Digite o valor do segundo lado do triângulo:");
        double ladoDOIS = ler.nextFloat();
        System.out.println("Digite o valor do terceiro lado do triângulo:");
        double ladoTRES = ler.nextFloat();

        if (ladoUM > ladoDOIS+ladoTRES || ladoDOIS > ladoTRES+ladoUM || ladoTRES > ladoDOIS+ladoUM) {
            System.out.println("[ATENÇÃO] um lado não pode ser maior que a soma dos outros dois!");
        }

        else if(ladoUM == ladoDOIS && ladoTRES == ladoDOIS && ladoTRES == ladoUM) {
            System.out.println("Triângulo Equilátero");
        }
        else if(ladoUM == ladoDOIS && ladoUM != ladoTRES || ladoUM == ladoTRES && ladoTRES != ladoDOIS || ladoDOIS == ladoTRES && ladoDOIS != ladoUM){
            System.out.println("Triângulo Isóceles");
        }
        else if(ladoUM != ladoDOIS && ladoTRES != ladoDOIS && ladoTRES != ladoUM) {
            System.out.println("Triângulo Escaleno");
        } else if(ladoUM == 0 || ladoDOIS == 0 || ladoTRES == 0) {
            System.out.println("[ERROR] Nenhum dos lados pode ser igual a zero");
        }
    }

}
