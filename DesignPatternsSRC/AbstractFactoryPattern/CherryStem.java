package AbstractFactoryPattern;

public class CherryStem implements Stem{
    public CherryStem(){
        System.out.println("CherryMXStem");
    }

    @Override
    public String toString() {
        return "CherryMXStem";
    }
}
