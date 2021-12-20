package IteratorPattern;


public class OfficeComputerLine implements Collection  {
    static final int MAX_CAP = 5;
    int numberOfItems = 0;
    DesktopComputer[] desktopComputerOrders;

    public OfficeComputerLine() {
        desktopComputerOrders = new DesktopComputer[MAX_CAP];
        for(int i = 0;i < MAX_CAP; i++){
            desktopComputerOrders[i] = new OfficeComputer();
        }
        numberOfItems = MAX_CAP;
    }

    public DesktopComputer[] getDesktopComputerOrders() {
        return desktopComputerOrders();
    }

    public DesktopComputer[] desktopComputerOrders() {
        return desktopComputerOrders();
    }

    @Override
    public Iterator createIterator() {
        return new OfficeComputerLineIterator(desktopComputerOrders);
    }


}
