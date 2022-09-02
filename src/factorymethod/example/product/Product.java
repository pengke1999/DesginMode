package factorymethod.example.product;

import lombok.Data;

/**
 * @author penko.peng
 */
@Data
public abstract class Product {

    private String name;

    private String feature;


    public abstract String getName();
}
