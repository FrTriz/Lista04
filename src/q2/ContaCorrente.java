package q2;

public class ContaCorrente {
    private double saldo;

    public void executarOperacao(Operacao opr){
        saldo += opr.operar();
    }

    public double getSaldo() {
        return saldo;
    }
}
