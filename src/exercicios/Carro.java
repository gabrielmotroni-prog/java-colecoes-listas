package exercicios;

import java.util.Arrays;

//Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos//
public class Carro {
    private String modelo;

    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPrecos(double preco1, double preco2, double preco3){
        this.precoAno1 = preco1;
        this.precoAno2 = preco2;
        this.precoAno3 = preco3;
    }

    public void exibirInfo(){
        System.out.println("Modelo :" + this.modelo);
        System.out.println("Preco ano 01 " + this.precoAno1);
        System.out.println("Preco ano 02 " + this.precoAno2);
        System.out.println("Preco ano 03 " + this.precoAno3);
        System.out.println("Menor preço " + this.calculaMenorPreco());
        System.out.println("Maior preço " + this.calculaMaiorPreco());
    }

    public double calculaMenorPreco(){
        double menorPreco = precoAno1;

        if(menorPreco > precoAno2){
            menorPreco = precoAno2;
        }

        if(menorPreco > precoAno3){
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    public double calculaMaiorPreco(){
        double maiorPreco = precoAno1;

        if(maiorPreco < precoAno2){
            maiorPreco = precoAno2;
        }

        if(maiorPreco < precoAno3){
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }




}
