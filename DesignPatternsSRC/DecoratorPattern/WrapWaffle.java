package DecoratorPattern;

public class WrapWaffle implements Waffle{
    @Override
    public String getDescription() {
        return "Wrap Waffle";
    }

    @Override
    public double getPrice() {
        return 13.0;
    }
}
