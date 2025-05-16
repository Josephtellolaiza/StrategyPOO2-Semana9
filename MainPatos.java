package EjercicioStrategy;

import EjercicioStrategy.clases.Duck;
import EjercicioStrategy.clases.clasesDeFly.FlyNoWay;
import EjercicioStrategy.clases.clasesDeFly.FlyWithJetpack;
import EjercicioStrategy.clases.clasesDeFly.FlyWithWings;
import EjercicioStrategy.clases.clasesDeQuack.MuteQuack;
import EjercicioStrategy.clases.clasesDeQuack.Quack;
import EjercicioStrategy.clases.clasesDeQuack.Squeak;
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


        mallard.setQuackBehavior(new Quack()); // Inicialmente hace quack
        mallard.performQuack(); // Hace quack

        mallard.setQuackBehavior(new Squeak()); // Ahora hace squeak
        mallard.performQuack(); // Hace squeak

        mallard.setQuackBehavior(new MuteQuack()); // Ahora no hace nada
        mallard.performQuack(); // No hace nada


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


        redHead.setQuackBehavior(new Quack()); // Inicialmente hace quack
        redHead.performQuack(); // Hace quack

        redHead.setQuackBehavior(new Squeak()); // Ahora hace squeak
        redHead.performQuack(); // Hace squeak

        redHead.setQuackBehavior(new MuteQuack()); // Ahora no hace nada
        redHead.performQuack(); // No hace nada
        
        

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


        decoy.setQuackBehavior(new Quack()); // Inicialmente hace quack
        decoy.performQuack(); // Hace quack

        decoy.setQuackBehavior(new Squeak()); // Ahora hace squeak
        decoy.performQuack(); // Hace squeak

        decoy.setQuackBehavior(new MuteQuack()); // Ahora no hace nada
        decoy.performQuack(); // No hace nada

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


        rubberDuck.setQuackBehavior(new Quack()); // Inicialmente hace quack
        rubberDuck.performQuack(); // Hace quack

        rubberDuck.setQuackBehavior(new Squeak()); // Ahora hace squeak
        rubberDuck.performQuack(); // Hace squeak

        rubberDuck.setQuackBehavior(new MuteQuack()); // Ahora no hace nada
        rubberDuck.performQuack(); // No hace nada
    }
}
