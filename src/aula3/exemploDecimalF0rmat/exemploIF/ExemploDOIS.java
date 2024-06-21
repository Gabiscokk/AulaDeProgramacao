package aula3.exemploDecimalF0rmat.exemploIF;

import java.util.Scanner;

public class ExemploDOIS {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Idade:");
        int idade = ler.nextInt();

        if(idade<0){
            System.out.println("Idade inválida");
        }
        else if(idade<10){
            System.out.println("Classe infantil");
        }
        else if(idade<25){
            System.out.println("Classe juvenil");
        }
        else if(idade<65){
            System.out.println("Classe adulto");
        }
        else{
            System.out.println("Classe terceira idade");
        }
    }
}
