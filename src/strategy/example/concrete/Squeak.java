package strategy.example.concrete;

import strategy.example.QuackBeHavior;

public class Squeak implements QuackBeHavior {

    @Override
    public void quack() {
        System.err.println("loud squeak");
    }
}
