package segundo_trimestre.Exemplos;

import java.util.Random;

public class Conta {
    String titular;
    String identificador;
    String senha;
    float saldo;
    // criando atributo estatico
    int cavalo = 2;
    static String nomeBanco;


    public Conta(String titular, String senha, float saldoInicial) {
        this.titular = titular;
        this.senha = senha;
        this.saldo = saldoInicial;
        geraIdentificador();
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

    void geraIdentificador(){
        Random aleatorio = new Random();
        String identificador = "";
        for(int i=0; i<4; i++) {
            identificador+=(char)aleatorio.nextInt(65,90);
        }
        identificador+=aleatorio.nextInt(1000,2000);
        this.identificador = identificador;;
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

