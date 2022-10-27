package abstractfactory.example;

import abstractfactory.example.product.Cheese;
import abstractfactory.example.product.Clam;
import abstractfactory.example.product.Dough;

public class BeautyPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Clam createClam() {
        return null;
    }
}
