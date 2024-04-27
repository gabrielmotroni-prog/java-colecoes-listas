package exercicios.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        //
        //01
        //
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(33);
        numeros.add(32);
        numeros.add(31);

        Collections.sort(numeros);

        System.out.println(numeros);

        //
        //02 e 03
        //

        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("gabriel"));
        titulos.add(new Titulo("bruna"));
        titulos.add(new Titulo("diego"));

        //Para tipos primitivos o Collections.sort entende naturamente a ordenação.
        //Porém para objetos, precisamos impplementar o Comparable, sobrecrevendo o metodo compareTo,
        //para informamos ao Coolesctions.sorte o que ele deve considerar para ordernar
        Collections.sort(titulos);

        System.out.println(titulos.toString());


        //
        //04 - Interface List instancia tanto ArrayList tantoLinkedList
        //
        List<String> apelidos = new ArrayList<>();
        apelidos.add("biel");
        apelidos.add("bru");

        List<String> apelidos2 = new ArrayList<>();
        apelidos2.add("biel2");
        apelidos2.add("bru2");

        //relebrando for
        //01 laco for each tradicional
        for(String apelido: apelidos){
            System.out.println(apelido);
        }
        //02 metodo for each
        apelidos2.forEach(apelido -> System.out.println(apelido));

        //03method reference
        apelidos.forEach(System.out::println);


        //
        //05 - Interface List instancia tanto ArrayList tantoLinkedList
        //Ganhamos deixando uma lista flexivel assim

        //interface List
        List<String> listaPolimorfica;

        //instanciando ArrayList
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("azul");

        //instanciando LinkedList
        listaPolimorfica.add("branco");

        listaPolimorfica.forEach(item-> System.out.println(item));

    }
}
