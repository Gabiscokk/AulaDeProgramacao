package segundo_trimestre.aula3.Banco;

public class Conta {
    private String titular;
    private String identificador;
    private String senha;
    private float saldo;


    public Conta(String titular, String identificador, String senha, float saldoInicial) {
        this.titular = titular;
        this.identificador = identificador;
        this.senha = senha;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(float valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saque não realizado. Verifique o valor e o saldo disponível.");
            return false;
        }
    }

    public String verificarSaldo() {
        return "Saldo atual: " + saldo;
    }
}

