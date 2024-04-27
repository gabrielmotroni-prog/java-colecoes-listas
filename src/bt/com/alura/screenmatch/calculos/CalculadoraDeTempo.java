package bt.com.alura.screenmatch.calculos;

import bt.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo t){
        //acumula tempo//
        this.tempoTotal += t.getDuracaoEmMinuto();
    }
}
