package factorymethod.example;

import factorymethod.example.product.BadProduct;
import factorymethod.example.product.ElementProduct;
import factorymethod.example.product.Product;

public class ProductCreator extends Creator {

    @Override
    public Product create(int productId) {
        Product product;
        if (productId == 1) {
            product = new ElementProduct();
        } else {
            product = new BadProduct();
        }

        return product;
    }
}
