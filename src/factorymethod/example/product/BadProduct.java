package factorymethod.example.product;

public class BadProduct extends Product{

    private String name = "bad";

    @Override
    public String getName() {
        return name;
    }
}
