package segundo_trimestre.aula3.Banco;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.print("Digite o identificador da conta: ");
        String identificador = scanner.nextLine();

        System.out.print("Digite a senha da conta: ");
        String senha = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        float saldoInicial = scanner.nextFloat();

        Conta conta = new Conta(titular, identificador, senha, saldoInicial);

        int opcao;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Verificar Saldo");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    float valorDeposito = scanner.nextFloat();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    float valorSaque = scanner.nextFloat();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println(conta.verificarSaldo());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}

