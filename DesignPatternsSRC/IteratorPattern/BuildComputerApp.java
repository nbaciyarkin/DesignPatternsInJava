package IteratorPattern;


public class BuildComputerApp {
    public static void main(String[] args) {
        OfficeComputerLine officeComputerLine = new OfficeComputerLine();
        GamingComputerLine gamingComputerLine = new GamingComputerLine(4);


        System.out.println("----------------------------------------------");
        System.out.println("Computer BuildLine");

        ComputerBuildLine computerBuildLine = new ComputerBuildLine(officeComputerLine,gamingComputerLine);
        computerBuildLine.runLine();
    }
}
