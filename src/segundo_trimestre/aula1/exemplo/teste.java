package segundo_trimestre.aula1.exemplo;

public class teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Ana";
        p1.idade = 20;
        p1.sobrenome = "maria";
        p1.altura = 170;
        p1.DataDeNascimento = "25/10/1999";
        p1.andar();
        p1.falar();
        p1.correr();

        Pessoa p2 = new Pessoa();
        p2.nome = "Gabriel";
        p2.idade = 18;
        p2.sobrenome = "Martins";
        p2.altura = 178;
        p2.DataDeNascimento = "17/01/2006";
        p2.andar();
        p2.falar();
        p2.correr();
    }
}
