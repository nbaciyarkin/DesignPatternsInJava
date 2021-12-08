package StrategyPattern.Model;

import java.util.List;

public class EuropeShopping implements Shopping {

    private Tax tax;

    private double totalProductPrice = 0.0;

    public EuropeShopping(Tax tax) {
        this.tax = tax;
    }

    @Override
    public double calculatePrice(List<Product> products) {
        Product product;
        for (int i = 0; i< products.size(); i++){
            product = products.get(i);

            totalProductPrice = totalProductPrice + product.getPrice() + tax.dutyTax(product) +
                      tax.shippingFee(product);
        }
        return  (tax.deliveryFee() + totalProductPrice) ;
    }


    @Override
    public Currency getCurrency() {
        return Currency.EUR;
    }
}
