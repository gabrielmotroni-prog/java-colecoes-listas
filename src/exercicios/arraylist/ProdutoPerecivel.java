package exercicios.arraylist;

public class ProdutoPerecivel extends Produto{
    String dataValidade = "12/12/12";
    public ProdutoPerecivel(String nome, Double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }
}
