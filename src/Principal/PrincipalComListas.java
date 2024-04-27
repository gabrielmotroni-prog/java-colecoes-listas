package Principal;

import bt.com.alura.screenmatch.modelos.Filme;
import bt.com.alura.screenmatch.modelos.Serie;
import bt.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        //01
        Filme meuFilme = new Filme("Poderoso chefão", 1970);
        //alimentando passando valores
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinuto(120);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(5);

        //02
        Filme outroFilme = new Filme("Avatar", 2012);
        //alimentando passando valores
        outroFilme.setDuracaoEmMinuto(100);

        //Serie
        Serie serieLoast = new Serie("Greys Anatomy", 2005);

        //Array com super tipo
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add((meuFilme));
        lista.add((outroFilme));
        lista.add((serieLoast));

        for (Titulo item: lista){
            System.out.println("Nome " + item.toString());
            //mostra classsificacao com metodo de cada classe adequadademente
            if(item instanceof Filme filme){
                System.out.println("Classificacao " + filme.getClassificacao());
            }
            if(item instanceof Serie serie){
                System.out.println("Classificacoes " + serie.getTotalDeAvaliacao());
            }
        }

        //exercicios array de string
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("gabriel");
        palavras.add("bruna");

        for (String palavra: palavras){
            System.out.println(palavra);
        }

        //Ordenar dados simples como String e int
        List<String> nomes = new LinkedList<>();
        nomes.add("Gabriel");
        nomes.add("Bruna");
        nomes.add("Puminha");

        Collections.sort(nomes);

        System.out.println(nomes);

        //ordenar objetos
        // implementei a classe comparable com metodo compareTo
        Collections.sort(lista);

        System.out.println(lista);

        //ordernando por data usando comparator
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano");
        System.out.println(lista);
        List<String> nomess = new ArrayList<>();

    }
}
