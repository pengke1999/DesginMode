package strategy.example.concrete;

import strategy.example.QuackBeHavior;

public class MuteQuack implements QuackBeHavior {

    @Override
    public void quack() {
        System.err.println("silence");
    }
}
