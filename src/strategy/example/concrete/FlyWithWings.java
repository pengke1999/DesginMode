package strategy.example.concrete;

import strategy.example.FlyBehavior;

/**
 * @author penko.peng
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.err.println("I'm flying");
    }
}
