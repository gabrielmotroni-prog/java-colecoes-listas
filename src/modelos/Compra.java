package modelos;

import java.util.List;

public class Compra {
    private String descricaoCompra;
    private double valorTotal;
    private List<Produto> listDeItems;
    private Conta comprador;

    public Compra(String descricaoCompra, Conta comprador) {
        this.descricaoCompra = descricaoCompra;
        this.comprador = comprador;
    }

    public String getDescricaoCompra() {
        return descricaoCompra;
    }

    public void setDescricaoCompra(String descricaoCompra) {
        this.descricaoCompra = descricaoCompra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<Produto> getListDeItems() {
        return listDeItems;
    }

    public void realizarCompra(Produto produto){
        var valorReal = produto.getValor() * produto.getQuantidade();

        if(valorReal > this.comprador.getSaldo()){
            System.out.println("Saldo insuficiente");
        }
        else{
            System.out.println("Produto" + produto.getNome() + "comprado!");
            this.listDeItems.add(produto);
        }

    }

    public void finalizarCompra(){
        System.out.println("Compra finalizada!");

        System.out.println("Items comprados: ");
        listDeItems.forEach(produto-> System.out.println(
                "Produto: " + produto.getNome() +
                        "Valor: " + produto.getValor() + "quantidade: " + produto.getQuantidade()));

    }


}
