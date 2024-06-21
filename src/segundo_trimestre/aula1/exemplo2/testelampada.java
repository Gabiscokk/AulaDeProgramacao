package segundo_trimestre.aula1.exemplo2;

import java.util.Scanner;

public class testelampada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String resposta;


        lampada l1 = new lampada(); {

            l1.cor = "amarela\n";
            l1.marca = "brasul\n";
            l1.local = "sala de estar\n";
            System.out.println("Ligar lampada?");
           resposta = ler.nextLine();
            if (resposta.equals("sim")) {
                l1.ligar();
            } else {
                l1.desligar();
            }

            // System.out.println("Deseja as infoemações da lampada?");
            resposta = ler.nextLine();
            if (resposta.equals("sim")) {

            } else {
                l1.desligar();
            }


        }
        }
    }

