package exercicios.interfaces;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public void converterDolarParaReal(double moedaDolar) {
        double conversao = moedaDolar * 5;
        System.out.println("converter " + moedaDolar + " dolares " + "para real. Fica: " + conversao );
    }
}
