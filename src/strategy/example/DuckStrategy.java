package strategy.example;

import lombok.Data;

/**
 * @author penko.peng
 */
public abstract class DuckStrategy {

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBeHavior getQuackBeHavior() {
        return quackBeHavior;
    }

    public void setQuackBeHavior(QuackBeHavior quackBeHavior) {
        this.quackBeHavior = quackBeHavior;
    }

    private FlyBehavior flyBehavior;

    private QuackBeHavior quackBeHavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBeHavior.quack();
    }
}
