package aula3.exemploDecimalF0rmat.switchCase;

import java.util.Scanner;

public class ExemploUM {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero de um 1 a 7");
        int dia = ler.nextInt();

        switch(dia){
            case 1,7:
                System.out.println("Fim de semana");
                break;
            case 2,3,4,5,6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Número iválido");
                break;
        }
    }
}
