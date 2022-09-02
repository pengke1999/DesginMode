package factorymethod.example;

import factorymethod.example.product.Product;

/**
 * @author penko.peng
 */
public abstract class Creator {



    /**
     * 工厂方法
     *
     * @param productId 产品id
     */
    public abstract Product create(int productId);

    public Product orderProduct(int procutId) {
        Product product;
        System.err.println("ready");
        System.err.println("init");
        System.err.println("link");
        System.err.println("new");
        product = create(procutId);
        String name = product.getName();
        System.err.println(name);
        return product;
    }
}
