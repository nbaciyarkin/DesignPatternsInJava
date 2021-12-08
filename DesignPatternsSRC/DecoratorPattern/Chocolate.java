package DecoratorPattern;

public class Chocolate extends WaffleDecorator{
    private final Waffle waffle;
    private String type;

    public Chocolate(Waffle waffle, String type) {
        this.waffle = waffle;
        this.type = type;
    }

    @Override
    public double getPrice() {
        return waffle.getPrice() + 2.0;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + "," + this.getType();
    }

    public void setType(String type) {
        this.type = type;
    }
}
