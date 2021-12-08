package StrategyPattern.Model;

import java.util.List;

public class AmericaShopping implements Shopping {

    private Tax tax;
    private double totalProductPrice = 0.0;


    public AmericaShopping(Tax tax) {
        this.tax = tax;
    }

    @Override
    public double calculatePrice(List<Product> products) {

        Product product;
        for (int i = 0; i< products.size(); i++) {
             product = products.get(i);
             totalProductPrice = totalProductPrice + product.getPrice() + tax.dutyTax(product) +
                      + tax.shippingFee(product) ;
        }
        return (tax.deliveryFee() + totalProductPrice) + tax.customTax(tax.deliveryFee() + totalProductPrice);
    }

    @Override
    public Currency getCurrency() {
        return Currency.USD;
    }
}
