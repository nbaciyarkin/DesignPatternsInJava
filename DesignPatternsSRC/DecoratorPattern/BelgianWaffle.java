package DecoratorPattern;

public class BelgianWaffle implements Waffle{
    @Override
    public String getDescription() {
        return "Belgian Waffle";
    }

    @Override
    public double getPrice() {
        return 16.0;
    }
}
