package AbstractFactoryPattern;

public class SwitchApp {

    public static void main(String[] args) {
        SwitchMaker cherryMXMaker = new CherryMXBrand();
        Switch cherryMXLinearSwitch = cherryMXMaker.assembleSwitch("linear");

        System.out.println(cherryMXLinearSwitch);

    }

}
