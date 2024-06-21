/*Usando o comando de seleção condicional simples “IF”,
faça um programa que leia uma senha de 8 caracteres
inteiros e verifique se a senha informada equivale a
senha predefinida no programa. Se for válida informe na
tela "Acesso Autorizado. Caso a senha não estiver correta
informe "Acesso negado".*/

package aula3.exemploDecimalF0rmat.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Defina sua senha:");
        String senha = ler.next();
        System.out.println("Digite sua senha para entrar:");
        String tentSenha = ler.next();

        if(tentSenha.equals(senha)){
            System.out.println("Acesso autorizado");
        }
        else {
            System.out.println("Acesso negado");
        }
    }
}
