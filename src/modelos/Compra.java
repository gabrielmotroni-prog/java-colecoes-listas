package modelos;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private String descricaoCompra;
    private double valorTotal;
    private List<Produto> listDeItems = new ArrayList<Produto>();
    private Conta comprador;

    public Compra(String descricaoCompra, Conta comprador) {
        this.descricaoCompra = descricaoCompra;
        this.comprador = comprador;
        //this.listDeItems.add()
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

    public int realizarCompra(Produto produto){
        var valorReal = produto.getValor() * produto.getQuantidade();

        if(valorReal > this.comprador.getSaldo()){
            System.out.println("Saldo insuficiente");
            //finaliza
            return 0;
        }
        else{
            System.out.println("Produto " + produto.getNome() + " comprado!");
            this.listDeItems.add(produto);
            //continua
            return 1;
        }

    }

    public void finalizarCompra(){
        System.out.println("################");

        System.out.println("Compra finalizada com sucesso!");

        System.out.println("################");

        System.out.println("Items comprados: ");
        listDeItems.forEach(produto-> System.out.println(
                "Produto: " + produto.getNome() +
                        " Valor: " + produto.getValor() + " Quantidade: " + produto.getQuantidade()));
        System.out.println("################");

    }


}
