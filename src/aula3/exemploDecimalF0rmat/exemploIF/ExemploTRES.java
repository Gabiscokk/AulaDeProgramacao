package aula3.exemploDecimalF0rmat.exemploIF;

import java.util.Scanner;

public class ExemploTRES {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe seu perfil:");
        String perfil = ler.next();
        if (perfil.equals("admin")){
            System.out.println("Perfil administrador");
        }
        else if (perfil.equals("usuario")) {
            System.out.println("Perfil usuario");
        }
        else {
            System.out.println("Perfil visitante");
        }
    }
}
