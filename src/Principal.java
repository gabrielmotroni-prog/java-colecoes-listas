import bt.com.alura.screenmatch.modelos.Episodio;
import bt.com.alura.screenmatch.modelos.Filme;
import bt.com.alura.screenmatch.modelos.FiltroRecomendacao;
import bt.com.alura.screenmatch.modelos.Serie;
import bt.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import exercicios.arraylist.ProdutoPerecivel;
import exercicios.interfaces.ConversaoFinanceira;
import exercicios.interfaces.ConversorMoeda;
import exercicios.interfaces.Produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //classe ponto de partida
        //



        // Filmes //


        //01
        Filme meuFilme = new Filme("Poderoso chefão", 1970);

        //alimentando passando valores
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinuto(120);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(5);

        System.out.println("Total de avaliações " + meuFilme.getTotalDeAvaliacao());
        System.out.println("Média das avaliações " +  meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        //02
        Filme outroFilme = new Filme("Chefinho", 1970);
        //alimentando passando valores
        outroFilme.setDuracaoEmMinuto(100);



        // calcular filme

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        //acumula tempo
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println("Total de tempo para assitir os filmes " + calculadora.getTempoTotal() + " minutos");




        // Series //

        Serie greysAnatomy = new Serie("Greys Anatomy",2008 );
        greysAnatomy.setAtiva(true);
        greysAnatomy.setTemporadas(2);
        greysAnatomy.setEpisodioPorTemporada(2);
        greysAnatomy.setMinutosPorEpisodio(10);

        System.out.println("Duração para para maratonar Grey: " + greysAnatomy.getDuracaoEmMinuto());

        //calcula series

        CalculadoraDeTempo calculadoraSerie = new CalculadoraDeTempo();
        //acumula tempo
        calculadoraSerie.inclui(greysAnatomy);
        System.out.println("Total de tempo para assitir as series " + calculadoraSerie.getTempoTotal() + " minutos");


        //exercicios

//        ModelCar carro1 = new ModelCar();
//        carro1.definirModelo("Sedan");
//        carro1.definirPrecos(1000,2000,3000);
//        carro1.exibirInfo();

//        Cachorro cachorro1 = new Cachorro();
//        cachorro1.emitirSom();
//        cachorro1.abanarRabo();
//
//        Gato gato1 = new Gato();
//
//        gato1.emitirSom();
//        gato1.arranharMoveis();

        ConversaoFinanceira conversao = new ConversorMoeda();
        conversao.converterDolarParaReal(1);

        Produto produto = new  Produto();
        produto.precoUnitario = 100;
        produto.calculaPrecoTotal( 100);
        double valorComDesconto = produto.aplicaDesconto( 10);
        System.out.println("valor: " + produto.precoUnitario + ". Valor com desconto: " + valorComDesconto);

//        FiltroRecomendacao filtro = new FiltroRecomendacao();
//        filtro.filtra(meuFilme);
//
//        Episodio episodio  = new Episodio();
//        episodio.setNumero(1);
//        episodio.setSerie("grey");
//        episodio.setTotalVisuaizacoes(300);
//
//        filtro.filtra(episodio);

        // Classe Array List

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        //adicionar
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        //conta
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiri da filme " + listaDeFilmes.get(0).getNome());

        System.out.println(listaDeFilmes.toString());

        //Exercicio Array List
        ArrayList<exercicios.arraylist.Produto> listaProdutos = new ArrayList<>();
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("queijo", 15.1, 1, "12/12/12");

        listaProdutos.add(new exercicios.arraylist.Produto("Acucar", 8.5, 1) );
        listaProdutos.add(new exercicios.arraylist.Produto("Arroz", 10.0, 1) );
        listaProdutos.add(produtoPerecivel);

        System.out.println("Quantidade de produtos " + listaProdutos.size());
        System.out.println("Primeiro produto da lista: " + listaProdutos.get(0).toString());
        System.out.println("Ultimo produto da lista: " + listaProdutos.get(2).toString());

        //percorre
        for(exercicios.arraylist.Produto produtoI : listaProdutos){
            System.out.println(produtoI);
        }




    }


}
