package IteratorPattern;

public class OfficeComputerLineIterator implements Iterator {
    DesktopComputer[] desktopComputerOrders;
    int pos = 0;

    public OfficeComputerLineIterator(DesktopComputer[] desktopComputerOrders) {
        this.desktopComputerOrders = desktopComputerOrders;
    }

    @Override
    public boolean hasNext() {
        if (pos >= desktopComputerOrders.length || desktopComputerOrders[pos] == null){
            return false;
        }
        else
            return true;
    }


    @Override
    public Object next() {
        DesktopComputer desktopComputer =  desktopComputerOrders[pos];
        pos++;
        return desktopComputer;
    }
}
