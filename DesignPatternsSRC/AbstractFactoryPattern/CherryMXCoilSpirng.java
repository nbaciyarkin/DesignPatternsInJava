package AbstractFactoryPattern;

public class CherryMXCoilSpirng extends CoilSpring{

    public CherryMXCoilSpirng(int pressureCN) {
        super(pressureCN);
        System.out.println("CherryMXCoilSpring");
    }

    @Override
    public String toString() {
        return "CherryMXCoilSpirng{" +
                "pressureCN=" + pressureCN +
                '}';
    }
}
