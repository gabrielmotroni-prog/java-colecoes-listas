import modelos.Compra;
import modelos.Conta;
import modelos.Produto;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean flagCompra = true;
        Conta conta = new Conta();
        Compra compra;

        // Criar conta
        // Crie um objeto Scanner para ler a entrada do usuário
        System.out.println("################");
        System.out.println("> criando nova conta:");
        Scanner scanner = new Scanner(System.in);



        System.out.println("digite descricao da conta: ");
        String descricaoConta = scanner.nextLine();

        System.out.println("digite saldo da conta: ");
        double saldoConta  = Double.parseDouble(scanner.nextLine());

        conta.setNome(descricaoConta);
        conta.setSaldo(saldoConta);

        compra = new Compra("compra online", conta);

        while (flagCompra){
            System.out.println("################");
            System.out.println("> criando novo produto:");

            System.out.print("digite nome do produto: ");
            String nomeProduto = scanner.nextLine();

            System.out.print("digite valor do produto: ");
            double valorProduto = Double.parseDouble(scanner.nextLine());

            System.out.print("quantidade valor do produto: ");
            int quantidadeProduto = Integer.parseInt( scanner.nextLine());

            Produto produto = new Produto(nomeProduto,valorProduto,quantidadeProduto);

            //tenta realizar compra verificando saldo na conta com produto
            int tentativaDeCompra = compra.realizarCompra(produto);

            if(tentativaDeCompra == 0 ){
                System.out.println("Ops! compra finalizada por falta de saldo!");
                flagCompra=false;
                compra.finalizarCompra();
                scanner.close();
                return;
            }

            System.out.print("Digite 1 para continuar ou 0 para encerrar: ");
            //verifica se existe proxima linha
            if(scanner.hasNext()){
                int msgEncerramento = Integer.parseInt(scanner.nextLine());

                //fechar o Scanner quando terminar de usá-lo
                if(msgEncerramento == 0 ){
                    System.out.println("Compras finalizadas!");
                    flagCompra=false;
                    compra.finalizarCompra();
                    scanner.close();
                }
            }
            System.out.println("################");
            System.out.println("> criando novo produto:");

        }





        // Produto
        // nome
        // valor
        // quantidade

        // Compra
        // conta
        // lista de produtos
        // valor total

        // Conta
        // nome
        //saldo
    }
}