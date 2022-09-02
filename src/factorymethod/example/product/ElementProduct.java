package factorymethod.example.product;


/**
 * @author penko.peng
 */
public class ElementProduct extends Product {

    private String elementName = "test";

    private String elementValue;

    @Override
    public String getName() {
        return this.elementName;
    }
}
