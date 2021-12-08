package ObserverPattern;

public class Follower extends Observer{

    private String name;


    public Follower(String name, FamousPerson famousPerson) {
        this.name = name;
        this.famousPerson = famousPerson;
        this.famousPerson.attach(this);
        System.out.println(getName() + " " + "started following" + " " + this.famousPerson.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(getName() + "has received" + " " + famousPerson.getName() + " 's tweet  ::  :)" + famousPerson.getTweet());
    }
}
