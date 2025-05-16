package EjercicioStrategy.clases.clasesDeFly;
import EjercicioStrategy.clases.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    
    @Override
    public void fly() {
        System.out.println("Estoy volando con alas");
    }
    
}