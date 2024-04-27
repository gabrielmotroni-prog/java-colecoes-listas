package exercicios.heranca;

import exercicios.heranca.Animal;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("au au!");
    }
    public void abanarRabo(){
        System.out.println("rabo balancando");
    }
}
