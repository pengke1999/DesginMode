package strategy.example.concrete;

import strategy.example.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.err.println("I can't fly");
    }
}
