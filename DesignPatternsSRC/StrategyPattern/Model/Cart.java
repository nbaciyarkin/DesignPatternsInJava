package StrategyPattern.Model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Shopping shoppingAttribute;
    private List<Product> products = new ArrayList();


    public Cart(Shopping shoppingAttribute) {
        this.shoppingAttribute = shoppingAttribute;
    }

    public double getTotalPrice(){
        return shoppingAttribute.calculatePrice(products);
    }

    public void addProduct(Product product){
        products.add(product);
    }






}
