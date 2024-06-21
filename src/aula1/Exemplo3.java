/*Faça uma classe Java que peça as 4 notas bimestrais e mostre a média*/

package aula1;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args){
        System.out.print("Qual seu nome: ");
        //String nome = ler.next();
        String nome = new Scanner(System.in).next();
        System.out.print("Qual seu sobrenome: ");
        String sobrenome = new Scanner(System.in).next();
        System.out.println("Bem vindo "+nome+" "+sobrenome);
        System.out.print("Qual seu nome completo: ");
        String nomeCompleto = new Scanner(System.in).nextLine();
        System.out.println("Bem vindo "+nomeCompleto);

    }
}
