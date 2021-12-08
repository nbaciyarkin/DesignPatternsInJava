package ObserverPattern;

import java.util.ArrayList;

public class FamousPerson implements Subject{

    private ArrayList <Observer> observers;

    private String tweet;
    private String name;



    public FamousPerson(String name) {
        observers = new ArrayList<>();
        this.name = name;

    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public String getTweet() {
        return tweet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
        System.out.println(getName()+" "+"has tweeted :: :) " + getTweet()+ "\n");
        notifyAllObservers();
    }


    public void notifyAllObservers(){
        for(Observer observers : observers){
            observers.update();
        }
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void deAttach(Observer observer){
        Follower castedFolower = (Follower) observer;
        System.out.println(castedFolower.getName() + "has stopped following"+ " " + observer.famousPerson.getName());
        observers.remove(observer);
        }
    }

