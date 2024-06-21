package aula6;

import java.util.Scanner;

// Matriz
public class exemplo1 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        // tipo [][] nome = [linhas][colunas]
        int[][] matriz = new int[3][4];
        for (int l=0; 1<3; l++) {
            for (int c = 0; c<4; c++) {
                System.out.printf("matriz[%d][%d]",l, c);
                matriz[l][c] = ler.nextInt();
            }

        }
        }
    }

