package exercicios.arraylist2;

public class ContaBancaria {
    int conta;
    double saldo;

    ContaBancaria(int conta, double saldo){
        this.conta = conta;
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
}
