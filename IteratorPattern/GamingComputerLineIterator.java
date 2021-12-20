package IteratorPattern;

import java.util.ArrayList;

public class GamingComputerLineIterator implements Iterator {
    public int pos = 0;
    public ArrayList<DesktopComputer> compList;

    public GamingComputerLineIterator(ArrayList<DesktopComputer> compList) {
        this.compList = compList;
    }

    @Override
    public boolean hasNext() {
        if (pos >= compList.size() || compList.get(pos) == null){
            return false;
        }
        else
            return true;
    }

    @Override
    public Object next() {
        DesktopComputer desktopComputer =  compList.get(pos);
        pos++;
        return desktopComputer;
    }
}
