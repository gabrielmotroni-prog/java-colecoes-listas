package exercicios.arraylist2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(8));
        formas.add(new Quadrado(8));

        for(Forma forma: formas){
            System.out.println(forma.calcularArea());
        }

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria(123, 12));
        contas.add(new ContaBancaria(456, 10));
        contas.add(new ContaBancaria(100, 1));

        ContaBancaria contaMaiorSaldo = contas.get(0);
        for(ContaBancaria conta: contas){

            if(conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("A conta com maior saldo é a conta: " + contaMaiorSaldo.getConta() + " saldo: " + contaMaiorSaldo.saldo );
    }
}
