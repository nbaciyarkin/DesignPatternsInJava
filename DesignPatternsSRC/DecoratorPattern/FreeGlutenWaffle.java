package DecoratorPattern;

public class FreeGlutenWaffle implements Waffle {
    @Override
    public String getDescription() {
        return "Free Gluten Waffle";
    }

    @Override
    public double getPrice() {
        return 17.0;
    }
}
