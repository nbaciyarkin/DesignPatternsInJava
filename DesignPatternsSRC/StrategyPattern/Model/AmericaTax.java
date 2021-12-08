package StrategyPattern.Model;

public class AmericaTax implements Tax {

    @Override
    public double dutyTax(Product product) {
       return product.getPrice() * 0.01;
    }

    @Override
    public int deliveryFee() {
        return 15;
    }


    @Override
    public double customTax(Double total) {
        return total * (0.75/100);
    }

    @Override
    public int shippingFee(Product product) {
        if (product.getSize() == Size.XL){
            return 10;
        }
        else {
            return 5;
        }
    }
}
