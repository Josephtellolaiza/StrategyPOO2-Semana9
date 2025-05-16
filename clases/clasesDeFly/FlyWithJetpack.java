package EjercicioStrategy.clases.clasesDeFly;

import EjercicioStrategy.clases.interfaces.FlyBehavior;

public class FlyWithJetpack implements FlyBehavior {

    @Override
    public void fly() {
        
        System.out.println("¡Volando con un jetpack! ");
    }
    
}
