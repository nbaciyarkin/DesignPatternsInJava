package StrategyPattern.Model;

public class EuropeTax implements Tax {
    @Override
    public double dutyTax(Product product) {
        return product.getPrice() * (1.5/100);
    }

    @Override
    public int deliveryFee() {
        return 11;
    }

    @Override
    public double customTax(Double totalPrice) {
        return 0;
    }

    @Override
    public int shippingFee(Product product) {
        if (product.getSize() == Size.XL){
            return 10;
        }
        else {
            return 0;
        }
    }
}
