package EjercicioStrategy.clases.clasesDeQuack;

import EjercicioStrategy.clases.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
    
}
