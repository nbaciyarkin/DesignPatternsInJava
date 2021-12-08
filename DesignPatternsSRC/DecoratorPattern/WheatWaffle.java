package DecoratorPattern;

public class WheatWaffle implements Waffle {
    @Override
    public String getDescription() {
        return "Wheat Waffle";
    }

    @Override
    public double getPrice() {
        return 15.0;
    }
}
