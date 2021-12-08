package DecoratorPattern;

public class Fruit extends WaffleDecorator {
    private final Waffle waffle;
    private String type;

    public Fruit(Waffle waffle, String type) {
        this.waffle = waffle;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + "," + this.getType();
    }

    @Override
    public double getPrice() {
        return waffle.getPrice() + 0.5;
    }
}
