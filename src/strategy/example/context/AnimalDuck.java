package strategy.example.context;

import strategy.example.DuckStrategy;
import strategy.example.concrete.FlyWithWings;
import strategy.example.concrete.Squeak;

public class AnimalDuck extends DuckStrategy {

    public AnimalDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBeHavior(new Squeak());
    }

    public void display() {

    }

}
