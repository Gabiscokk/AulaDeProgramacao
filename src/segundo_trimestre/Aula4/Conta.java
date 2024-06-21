package segundo_trimestre.Aula4;

import java.util.Random;

public class Conta {
     private String titular;
     private String identificador;
     private String senha;
     protected float saldo;


    public Conta(String titular, String senha) {
        this.titular = titular;
        this.senha = senha;
    }

    private void geraIdentificador() {
        String ID = " ";
        Random aleatorio = new Random();
        for (int i=0;i<4;i++) {
            ID+=(char)aleatorio.nextInt(65,90);
        }
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

    public boolean validarAcesso(String identificador, String Senha) {
    return this.identificador.equals(identificador) && this.senha.equals(senha);
    }
}