package bt.com.alura.screenmatch.modelos;

import bt.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private  int numero;
    private  String nome;
    private  String serie;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getTotalVisuaizacoes() {
        return totalVisuaizacoes;
    }

    public void setTotalVisuaizacoes(int totalVisuaizacoes) {
        this.totalVisuaizacoes = totalVisuaizacoes;
    }

    private  int totalVisuaizacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //as regras de de cada getClassificacao é diferente
    @Override
    public int getClassificacao() {
        if(this.totalVisuaizacoes>100){
            return 4;
        }else{
            return 0;
        }

    }
    //
}
