package aula1;

public class Exemplo1 {
    public static void main(String[] args) {
        System.out.println("Imprime e quebra linha...");
        System.out.print("Imprime sem quebrar linha");
        System.out.printf("Esse texto fica ao lado\n");

        int altura = 180;
        String nome = "Filipe";
        String sobrenome = "Pacheco";
        System.out.println("Nome: " + nome + " " + sobrenome + " altura: " + altura + "cm");
        System.out.printf("Nome: %s %s altura:%d cm\n", nome, sobrenome, altura);

        float valor = (float) 1.6;
        System.out.println("O valor é" +valor);
        System.out.printf("O valor é %.2f\n", valor);
    }
}
