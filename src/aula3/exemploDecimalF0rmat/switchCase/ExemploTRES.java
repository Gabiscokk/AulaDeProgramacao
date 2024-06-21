package aula3.exemploDecimalF0rmat.switchCase;

import java.util.Scanner;

public class ExemploTRES {
    public static void main (String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Informe seu perfil:");
    String perfil = ler.next();
    switch (perfil) {
        case "admin" -> System.out.println("Perfil administrador");
        case "usuario" -> System.out.println("Perfil usuario");
        default -> System.out.println("Perfil visitante");

    }
    }
}
