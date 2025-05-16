package EjercicioStrategy;

import EjercicioStrategy.clases.Duck;
import EjercicioStrategy.clases.clasesDeFly.FlyNoWay;
import EjercicioStrategy.clases.clasesDeFly.FlyWithJetpack;
import EjercicioStrategy.clases.clasesDeFly.FlyWithWings;
import EjercicioStrategy.patos.DecoyDuck;
import EjercicioStrategy.patos.MallardDuck;
import EjercicioStrategy.patos.RedheadDuck;
import EjercicioStrategy.patos.RubberDuck;


public class MainPatos {
    
    public static void main(String[] args) {
        

        // Crear un pato real (MallardDuck)

        Duck mallard = new MallardDuck();

        mallard.display();

        mallard.setFlyBehavior(new FlyNoWay()); // Inicialmente no vuela

        mallard.performFly(); // Vuela normalmente (FlyWithWings)

        // ¡El pato consigue un jetpack!
        mallard.setFlyBehavior(new FlyWithJetpack());
        mallard.performFly(); // Ahora vuela con jetpack

        // Cambio a "no volar" (por ejemplo, se agota el combustible)
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.performFly(); // No vuela


        System.out.println("---------------------------------");

        // Crear un pato de cabeza roja (RedheadDuck)
        Duck redHead = new RedheadDuck();

        redHead.display();

        redHead.setFlyBehavior(new FlyWithWings()); // Inicialmente vuela con alas
        redHead.performFly(); // Vuela normalmente (FlyWithWings)

        redHead.setFlyBehavior(new FlyNoWay()); // Ahora no vuela
        redHead.performFly(); // No vuela

        redHead.setFlyBehavior(new FlyWithJetpack()); // Ahora vuela con jetpack
        redHead.performFly(); // Vuela con jetpack
        
        

        System.out.println("---------------------------------");

        // Crear un pato de madera (DecoyDuck)
        Duck decoy = new DecoyDuck();

        decoy.display();

        decoy.setFlyBehavior(new FlyNoWay()); // No vuela
        decoy.performFly(); // No vuela

        decoy.setFlyBehavior(new FlyWithWings()); // Ahora vuela con alas
        decoy.performFly(); // Vuela normalmente (FlyWithWings)

        decoy.setFlyBehavior(new FlyWithJetpack()); // Ahora vuela con jetpack
        decoy.performFly(); // Vuela con jetpack

        System.out.println("---------------------------------");


        //Crear un pato de señuelo(RubberDuck)
        Duck rubberDuck = new RubberDuck();

        rubberDuck.display();

        rubberDuck.setFlyBehavior(new FlyNoWay()); // No vuela
        rubberDuck.performFly(); // No vuela

        rubberDuck.setFlyBehavior(new FlyWithWings()); // Ahora vuela con alas
        rubberDuck.performFly(); // Vuela normalmente (FlyWithWings)

        rubberDuck.setFlyBehavior(new FlyWithJetpack()); // Ahora vuela con jetpack
        rubberDuck.performFly(); // Vuela con jetpack
    }
}
