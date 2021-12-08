package DecoratorPattern;

public class Main {

    public static void main(String[] args) {

        Waffle waffle = new BelgianWaffle();
        System.out.println(waffle.getDescription() +" "+waffle.getPrice() +"$");
        waffle = new Chocolate(waffle,"Milky Chocolate");
        System.out.println(waffle.getDescription() +" "+waffle.getPrice() +"$");
        waffle = new Fruit(waffle,"Strawberry");
        System.out.println(waffle.getDescription() +" "+waffle.getPrice() +"$");
        waffle = new Fruit(waffle,"Banana");
        System.out.println(waffle.getDescription() +" "+waffle.getPrice() +"$");
        waffle = new Fruit(waffle,"kivi");
        System.out.println(waffle.getDescription() +" "+waffle.getPrice() +"$");
        waffle = new Sauce(waffle,"Chocolate Sauce");
        System.out.println(waffle.getDescription() +" "+waffle.getPrice() +"$ \n" );

        Waffle waffle2 = new FreeGlutenWaffle();
        System.out.println(waffle2.getDescription() +" "+waffle2.getPrice() +"$");
        waffle2 = new Chocolate(waffle2,"Dark Chocolate");
        System.out.println(waffle2.getDescription() +" "+waffle2.getPrice() +"$");
        waffle2 = new Chocolate(waffle2,"Milky Chocolate");
        System.out.println(waffle2.getDescription() +" "+waffle2.getPrice() +"$");
        waffle2 = new Fruit(waffle2,"Strawberry");
        System.out.println(waffle2.getDescription() +" "+waffle2.getPrice() +"$");
        waffle2 = new Fruit(waffle2,"Pineapple");
        System.out.println(waffle2.getDescription() +" "+waffle2.getPrice() +"$");
        waffle2 = new Fruit(waffle2, "Kivi");
        System.out.println(waffle2.getDescription() +" "+waffle2.getPrice() +"$");
        waffle2 = new Nuts(waffle2,"Coconut");
        System.out.println(waffle2.getDescription() +" "+waffle2.getPrice() +"$");






    }
}
