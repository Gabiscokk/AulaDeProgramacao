package segundo_trimestre.Aula4;

public class ContaPoupanca extends Conta {

    public ContaPoupanca (String titular, String senha, Float deposito) {
        super(titular,senha);
        saldo = deposito;
    }

    public boolean sacar(Float valor) {
        if(saldo>=valor) {
            saldo-=valor;
            return true;
        }
        return false;

    }

    public String verificaSaldo() {
    return String.format("Seu saldo atual é de R$.2f", saldo);
    }
}
