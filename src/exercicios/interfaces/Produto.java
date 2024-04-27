package exercicios.interfaces;

public class Produto implements Vendavel{
    public String nome;
    public double precoUnitario;

    @Override
    public double calculaPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public double aplicaDesconto( double porcentagemDesconto) {
        double desconto = (this.precoUnitario * porcentagemDesconto) /100 ;
        return this.precoUnitario - desconto;
    }


}
