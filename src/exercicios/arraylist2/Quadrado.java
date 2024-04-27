package exercicios.arraylist2;

public class Quadrado implements Forma{

    Quadrado(double lado){
        this.lado = lado;
    }
    double lado;
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
