package segundo_trimestre.Aula5.exemploPolimorfismo;

import segundo_trimestre.Exemplos.Operacoes;

public class teste {
    public static void main(String[] args) {
        operacoes op = new operacoes();
        System.out.println("Somando dois numeros: "+op.soma(5,7));
        System.out.println("Somando tres numeros: "+op.soma(5,7,8));
        System.out.println("Somando duas Strings: "+op.soma("Palavra", "quero"));
    }


}
