package exercicios.heranca;

import exercicios.heranca.Animal;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
    public void arranharMoveis(){
        System.out.println("moveis arranhados");
    }
}
