package segundo_trimestre.Aula4;

public class ContaCorrente extends Conta {

    private float limite;

public ContaCorrente(String titular, String senha, float limite) {
    super(titular,senha);
    this.limite = limite;
}
    public boolean sacar(float valor) {
    return false;
    }

    public String verificaSaldo() {
    String retorno = String.format("Seu Saldo é de R$.2f", saldo);
    if(saldo>=0)
        retorno+=String.format("limite disponivel: R$.2f", limite) ;
    else
        retorno+=String.format("limite disponivel: R$.2f", limite+saldo) ;
    return retorno;
    }
}

