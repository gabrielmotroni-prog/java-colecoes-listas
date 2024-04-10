package modelos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Compra  {
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
            System.out.println("Valor Total: R$" + this.valorTotal);
            //finaliza
            return 0;
        }
        else{
            System.out.println("Produto " + produto.getNome() + " comprado!");
            this.listDeItems.add(produto);
            this.valorTotal+= produto.getValor();
            //continua
            return 1;
        }

    }

    public void finalizarCompra(){
        System.out.println("################");

        System.out.println("Compra finalizada com sucesso!");

        System.out.println("################");

        System.out.println("Items comprado: ");

        if(listDeItems.isEmpty()){
            System.out.println("nada foi comprado!");
        }
        else{

            //orderna lista pelo valor (foi implementado compareTo em Produto)
            Collections.sort(listDeItems);

            listDeItems.forEach(produto-> System.out.println(
                    "Produto: " + produto.getNome() +
                            " Valor: " + produto.getValor() + " Quantidade: " + produto.getQuantidade()));
            System.out.println("################");
            System.out.println("Valor Total: R$" + this.valorTotal);
        }


    }
}
