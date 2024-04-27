package bt.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {
    String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinuto;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinuto() {
        return duracaoEmMinuto;
    }

    public void setDuracaoEmMinuto(int duracaoEmMinuto) {
        this.duracaoEmMinuto = duracaoEmMinuto;
    }

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome:" + nome);
        System.out.println("Ano lançamento" + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }



//    @Override
//    public int compareTo(Titulo outroTitulo) {
//        return this.getNome().compareTo(outroTitulo.getNome());
//    }
}//
