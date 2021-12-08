    package TemplateMethodPattern;

public class Test {

    public static void main(String[] args) {

        System.out.println("Game Computer");
        Computer gameComp = new GamingComputer();
        gameComp.createComputer();
        System.out.println("-----------------");

        System.out.println("Office Computer");
        Computer officeComp = new OfficeComputer();
        officeComp.createComputer();





    }

}
