package IteratorPattern;


public class ComputerBuildLine {

    public OfficeComputerLine officeComputerLine;
    public GamingComputerLine gamingComputerLine;

    public ComputerBuildLine(OfficeComputerLine officeComputerLine, GamingComputerLine gamingComputerLine) {
        this.officeComputerLine = officeComputerLine;
        this.gamingComputerLine = gamingComputerLine;
    }

    public void buildComputer(Iterator iterator) {
        if (iterator instanceof OfficeComputerLineIterator) {
            System.out.println("Office computers are:");
            OfficeComputerLineIterator officeIterator = (OfficeComputerLineIterator) iterator;


            while (officeIterator.hasNext()) {
                DesktopComputer desktopComputer = (DesktopComputer) officeIterator.next();
                desktopComputer.buildComputer();
                System.out.println("------------------");
                System.out.println(desktopComputer);
            }
        }
            else if (iterator instanceof GamingComputerLineIterator) {
            System.out.println("Gaming Computers are:");
            GamingComputerLineIterator gamingIterator = (GamingComputerLineIterator) iterator;
            while (gamingIterator.hasNext()) {
                DesktopComputer desktopComputer = (DesktopComputer) gamingIterator.next();
                desktopComputer.buildComputer();
                System.out.println("--------------");
                System.out.println(desktopComputer);
            }
        }
    }

    public void runLine() {
        buildComputer(officeComputerLine.createIterator());
        buildComputer(gamingComputerLine.createIterator());
    }


}