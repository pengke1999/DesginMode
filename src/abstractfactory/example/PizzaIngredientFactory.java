package abstractfactory.example;

import abstractfactory.example.product.Cheese;
import abstractfactory.example.product.Clam;
import abstractfactory.example.product.Dough;

/**
 * @author penko.peng
 *
 * 提供一系列产品家族
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Cheese createCheese();

    Clam createClam();
}
