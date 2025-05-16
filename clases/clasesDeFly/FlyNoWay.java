package EjercicioStrategy.clases.clasesDeFly;

import EjercicioStrategy.clases.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No puedo volar :( ");
    }
    
}
