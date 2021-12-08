package ObserverPattern;

public interface Subject {

    public void notifyAllObservers();

    public void attach(Observer observer);

    public void deAttach(Observer observer);

}
