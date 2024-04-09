import modelos.Conta;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean flagCompra = true;
        boolean flagConta = true;
        Conta conta = new Conta();

        // Criar conta
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite descricao da conta: ");
        String descricaoConta = scanner.nextLine();

        System.out.println("digite saldo da conta: ");
        double saldoConta  = Double.parseDouble(scanner.nextLine());

        while (flagCompra){
            System.out.print("digite nome do produto: ");
            String nomeProduto = scanner.nextLine();

            System.out.print("digite valor do produto: ");
            double valorProduto = Double.parseDouble(scanner.nextLine());

            System.out.print("quantidade valor do produto: ");
            int quantidadeProduto = Integer.parseInt( scanner.nextLine());

            System.out.print("Digite 1 para continuar ou 0 para encerrar: ");

            //verifica se existe proxima linha
            if(scanner.hasNext()){

                int msgEncerramento = scanner.nextInt();

                //fechar o Scanner quando terminar de usá-lo
                if(msgEncerramento == 0 ){
                    System.out.println("Compras finalizadas!");
                    flagCompra=false;
                    scanner.close();
                }
            }

        }





        // produtp
        // nome
        // valor
        // quantidade

        //compras
        // lista de produtos
        // valor total

        //conta
        //nome
        //saldo
    }
}