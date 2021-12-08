package StrategyPattern.Model;

import StrategyPattern.Model.Product;

public interface Tax {
    double dutyTax(Product product);
    int deliveryFee();
    double customTax(Double totalPrice);
    int shippingFee(Product product);
}
