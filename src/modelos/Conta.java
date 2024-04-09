package modelos;

public class Conta {
    private String nome;
    private double saldo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {

        // n permite saldo negativo
        if(saldo < 0 ){
            return;
        }

        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }
}
