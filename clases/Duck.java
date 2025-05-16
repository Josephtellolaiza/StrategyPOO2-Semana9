package EjercicioStrategy.clases;

import EjercicioStrategy.clases.interfaces.FlyBehavior;
import EjercicioStrategy.clases.interfaces.QuackBehavior;

public abstract class Duck {
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    

    
    public void swim(){
        System.out.println("Todos los patos flotan, incluso los patos de madera!");

    }

    public void display() {
        // This method should be overridden by subclasses
        System.out.println("Soy un Pato!");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
    
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void otherMethods() {
        
        System.out.println("Otros métodos del pato.");
    }
}
