package segundo_trimestre.aula3;

import java.util.Scanner;

public class Aluno {

    private String nome;
    private String sobrenome;
    private String email;
    private int codigo;
    private float notaUm;
    private float notaDois;


    public Aluno(String nome, String sobrenome, String email, int codigo, float notaUm, float notaDois) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.codigo = codigo;
        this.notaUm = notaUm;
        this.notaDois = notaDois;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getNotaUm() {
        return notaUm;
    }

    public void setNotaUm(float notaUm) {
        this.notaUm = notaUm;
    }

    public float getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(float notaDois) {
        this.notaDois = notaDois;
    }


    public float calcularMedia() {
        return (notaUm + notaDois) / 2;
    }

    public String verificarSituacao() {
        float media = calcularMedia();
        if (media >= 8) {
            return "Aprovado";
        } else if (media >= 6) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome do aluno: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite o email do aluno: ");
        String email = scanner.nextLine();

        System.out.print("Digite o código do aluno: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a nota 1 do aluno: ");
        float notaUm = scanner.nextFloat();

        System.out.print("Digite a nota 2 do aluno: ");
        float notaDois = scanner.nextFloat();


        Aluno aluno = new Aluno(nome, sobrenome, email, codigo, notaUm, notaDois);

        System.out.println("\nInformações do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Sobrenome: " + aluno.getSobrenome());
        System.out.println("Email: " + aluno.getEmail());
        System.out.println("Código: " + aluno.getCodigo());
        System.out.println("Nota 1: " + aluno.getNotaUm());
        System.out.println("Nota 2: " + aluno.getNotaDois());

        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Situação: " + aluno.verificarSituacao());

        scanner.close();
    }
}
