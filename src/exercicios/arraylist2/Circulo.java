package exercicios.arraylist2;

public class Circulo implements Forma{
    double pi = 3.14;
    double raio;

    Circulo(double raio ){
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        return this.pi * (this.raio*this.raio);
    }
}
