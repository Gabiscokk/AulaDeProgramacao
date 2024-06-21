package segundo_trimestre.Exemplos;

public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta("Ana", "123", 100);
        System.out.println("Conta cadastrada  com ID: "+c1.identificador);
        Conta c2 = new Conta("ana", "12334", 199);
        System.out.println("Conta cadastrada com ID: "+c2.identificador);
        // testando static
        c1.nomeBanco = "Banco CIMOL";
        System.out.println("Nome do banco c1 "+c1.nomeBanco);
        System.out.println("Nome do banco c2 "+c2.nomeBanco);
        // acesso direto pela classe por ser um atributo estatico
        Conta.nomeBanco = "teste";
        System.out.println("Nome do banco c1 "+c1.nomeBanco);
        System.out.println("Nome do banco c2 "+c2.nomeBanco);
    }
}
