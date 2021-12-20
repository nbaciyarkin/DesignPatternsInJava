package IteratorPattern;
import java.util.ArrayList;

public class GamingComputerLine implements Collection {
    ArrayList<DesktopComputer> desktopComputers;

    public GamingComputerLine(int orderCount) {
        desktopComputers = new ArrayList<>();

        for(int i = 0; i < orderCount; i++){
            desktopComputers.add(new GamingComputer());
        }
    }

    public void addItem(GamingComputer gamingComputer){
        desktopComputers.add(gamingComputer);
    }

    public ArrayList<DesktopComputer> getDesktopComputers(){
        return desktopComputers;
    }

    @Override
    public Iterator createIterator() {
        return new GamingComputerLineIterator(desktopComputers);
    }
}
