package strategy.example.context;

import strategy.example.DuckStrategy;
import strategy.example.concrete.FlyNoWay;
import strategy.example.concrete.MuteQuack;

public class ModelDuck extends DuckStrategy {

    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBeHavior(new MuteQuack());
    }

    public void display() {
        System.err.println("i'm model duck");
    }

}
