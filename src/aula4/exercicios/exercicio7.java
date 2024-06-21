package aula4.exercicios;

import java.util.Scanner;

//Escreva um algoritmo para ler uma senha. Se o usuário não digitar a senha correta que é 12345,
// o algoritmo deve ler novamente, até que seja a senha correta. O algoritmo deve também contar quantas vezes
// o usuário tentou digitar a senha incorreta, ou seja, quantas tentativas de acerto aconteceram.
// Escrever essa informação na tela.
public class exercicio7 {
    public static void main(String[] args) throws InterruptedException {
        Scanner ler = new Scanner(System.in);
        int senha = 0;
        int c = 0;
        while (senha != 12345) {
            System.out.println("Digite sua senha: ");
            senha = ler.nextInt();
            c++;
            if (senha == 12345) {
                System.out.println("Senha correta. tentou "+c+" vezes");
            }
        }




    }
}
