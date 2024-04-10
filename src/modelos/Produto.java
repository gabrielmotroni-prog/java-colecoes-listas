package modelos;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double valor;

    private int quantidade;

    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    @Override
    public int compareTo(Produto outroProduto) {
        if(this.getValor() < outroProduto.getValor()){
            return -1; // Este produto é menor que o produto passado como parâmetro
        }
        else if(this.valor > outroProduto.valor){
            return 1; // Este produto é maior que o produto passado como parâmetro
        }
        else{
            return 0; // Os valores dos produtos são iguais
        }
    }
}
